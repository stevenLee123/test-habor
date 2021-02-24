/**
 * @Author： supconit
 * @Date： 2021/1/22
 * @Description：
 */
package com.steven.springcloudfeignclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class FeignController {

    public String testFeign(){
        return null;
    }
}
