/**
 * @Author： supconit
 * @Date： 2021/1/21
 * @Description：
 */
package com.steven.springboottest2.servuce;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Service
public interface PdfExportService {

    void  make(Map<String, Object> model,
               Document document, PdfWriter writer,
               HttpServletRequest request,
               HttpServletResponse response);
}
