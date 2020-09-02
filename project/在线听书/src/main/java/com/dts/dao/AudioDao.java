package com.dts.dao;

import com.dts.model.Audio;
import com.dts.util.DB;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AudioDao {
    public void insert(int sid, String uuid, String contentType, InputStream inputStream) throws SQLException {
        String sql = "insert into audios (sid, uuid, content_type, content) values (?, ?, ?, ?)";

        try (Connection c = DB.getConnection()) {
            try (PreparedStatement s = c.prepareStatement(sql)) {
                s.setInt(1, sid);
                s.setString(2, uuid);
                s.setString(3, contentType);
                s.setBlob(4, inputStream);

                s.executeUpdate();
            }
        }
    }

    public Audio select(String uuid) throws SQLException {
        String sql = "select content_type, content from audios where uuid = ?";

        try (Connection c = DB.getConnection()) {
            try (PreparedStatement s = c.prepareStatement(sql)) {
                s.setString(1, uuid);

                try (ResultSet r = s.executeQuery()) {
                    if (!r.next()) {
                        return null;
                    }

                    return new Audio(r.getString("content_type"), r.getBinaryStream("content"));
                }
            }
        }
    }
}
