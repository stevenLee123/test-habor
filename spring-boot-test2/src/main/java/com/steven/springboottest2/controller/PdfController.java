/**
 * @Author： supconit
 * @Date： 2021/1/21
 * @Description：
 */
package com.steven.springboottest2.controller;


import com.lowagie.text.*;
import com.lowagie.text.Font;
import com.lowagie.text.pdf.PdfCell;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.steven.springboottest2.domain.User;
import com.steven.springboottest2.servuce.PdfExportService;
import com.steven.springboottest2.view.PdfView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("api/v1")
public class PdfController {

    @GetMapping("/pdfExport")
    public ModelAndView exportPdf(String name, String note) {
        List<User> list = new ArrayList<>();
        list.add(new User("a", "1"));
        list.add(new User("b", "11"));
        list.add(new User("c", "12"));
        list.add(new User("d", "13"));
        View view = new PdfView(pdfExportService(list));
        ModelAndView mv = new ModelAndView();
        mv.setView(view);
        mv.addObject("list",list);
        return mv;
    }

    private PdfExportService pdfExportService(List<User> list) {
        return (model,
                document, writer,
                request,
                response) -> {

            try {

                document.setPageSize(PageSize.A4);
                document.addTitle("pdfinfo");
                document.add(new Chunk("\n"));
                PdfPTable table = new PdfPTable(2);
                Font f8 = new Font();
                f8.setColor(Color.BLUE);
                f8.setStyle(Font.BOLD);
                PdfPCell cell = new PdfPCell(new Paragraph("username", f8));
                cell.setHorizontalAlignment(1);
                table.addCell(cell);
                cell = new PdfPCell(new Paragraph("age", f8));
                cell.setHorizontalAlignment(1);
                table.addCell(cell);
                for (User user: list) {
                    document.add(new Chunk("\n"));
                    cell = new PdfPCell(new Paragraph(user.getName(), f8));
                    cell.setHorizontalAlignment(1);
                    table.addCell(cell);
                    cell = new PdfPCell(new Paragraph(user.getAge(), f8));
                    cell.setHorizontalAlignment(1);
                    table.addCell(cell);
                }
                document.add(table);
            } catch (DocumentException e) {
                e.printStackTrace();
            }
        };
    }
}
