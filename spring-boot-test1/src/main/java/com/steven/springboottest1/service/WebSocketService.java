/**
 * @Author： supconit
 * @Date： 2021/1/13
 * @Description：
 */
package com.steven.springboottest1.service;

import org.springframework.stereotype.Service;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

@Service
@ServerEndpoint("/ws")
public class WebSocketService {

    private static int onLineCount = 0;

    private static CopyOnWriteArraySet<WebSocketService> webSocketServiceSet =
            new CopyOnWriteArraySet<>();

    private Session session;

    @OnOpen
    public void onOpen(Session session){
        this.session  = session;
        webSocketServiceSet.add(this);
        addOne();
        System.out.println("new gay online,count："+ getOnLineCount());
    }

    @OnClose
    public void onClose(){
        webSocketServiceSet.remove(this);
        subOne();
        System.out.println("a gay offline,count:"+ getOnLineCount());
    }

    @OnMessage
    public void onMessage(String message,Session session) throws IOException {
        System.out.println("receive message from a gay:" + message);
        for (WebSocketService webSocketService: webSocketServiceSet) {
            webSocketService.sendMessage("a gay say: "+ message);
        }
    }

    @OnError
    public void onError(Session session,Throwable error){
        System.out.println("encounter error");
        error.printStackTrace();
    }

    private void sendMessage(String message) throws IOException{
        this.session.getBasicRemote().sendText(message);
    }

    public static synchronized void addOne(){
        onLineCount++;
    }

    public void subOne(){
        onLineCount--;
    }

    public static int getOnLineCount() {
        return onLineCount;
    }
}
