package cn.com.sky.controller;

//import org.codehaus.plexus.util.IOUtil;

import org.springframework.web.servlet.view.AbstractUrlBasedView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

/**
 *
 */
public class StaticPdfView extends AbstractUrlBasedView {

    public StaticPdfView() {
        setContentType("application/pdf");
    }


    @Override
    protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType(getContentType());
        InputStream inputStream = new FileInputStream(getUrl());
        OutputStream outputStream = response.getOutputStream();
//        IOUtil.copy(inputStream, outputStream);
        outputStream.flush();
//        IOUtil.close(inputStream);
//        IOUtil.close(outputStream);
    }
}