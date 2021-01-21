/**
 * @Author： supconit
 * @Date： 2021/1/21
 * @Description：
 */
package com.steven.springboottest2.view;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfWriter;
import com.steven.springboottest2.servuce.PdfExportService;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class PdfView extends AbstractPdfView {

    private PdfExportService pdfExportService;

    public PdfView(PdfExportService pdfExportService) {
        this.pdfExportService = pdfExportService;
    }

    @Override
    protected void buildPdfDocument(Map<String, Object> model,
                                    Document document, PdfWriter writer,
                                    HttpServletRequest request,
                                    HttpServletResponse response) throws Exception {
        pdfExportService.make(model,document,writer,request,response);
    }
}
