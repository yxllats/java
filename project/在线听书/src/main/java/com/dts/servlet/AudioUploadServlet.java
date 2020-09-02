package com.dts.servlet;

import com.dts.service.AudioService;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@MultipartConfig
@WebServlet("/upload/audio")
public class AudioUploadServlet extends HttpServlet {
    private AudioService audioService;

    @Override
    public void init() throws ServletException {
        audioService = new AudioService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        String s = req.getParameter("sid");
        int sid = Integer.parseInt(s);

        Part audio = req.getPart("audio");


        resp.setContentType("utf-8");
        resp.setContentType("application/json");
        PrintWriter writer = resp.getWriter();
        try {
            String uuid = audioService.save(sid, audio);
            writer.printf("{\"uuid\": \"%s\"}%n", uuid);
        } catch (SQLException e) {
            e.printStackTrace();
            resp.setStatus(500);
            writer.printf("{\"reason\": \"%s\"}%n", e.getMessage());
        }
    }
}
