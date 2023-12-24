package com.common;
import org.springframework.web.servlet.view.AbstractView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class PdfView extends AbstractView {

    private final byte[] content;

    public PdfView(byte[] content) {
        this.content = content;
        setContentType("application/pdf");
    }

    @Override
    protected void renderMergedOutputModel(
            Map<String, Object> model,
            HttpServletRequest request,
            HttpServletResponse response
    ) throws Exception {
        response.setHeader("Content-Disposition", "attachment; filename=Report.pdf");
        response.setContentLength(content.length);
        response.getOutputStream().write(content);
    }
}
