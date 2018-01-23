package com.kursisipervin.dboperations;

import com.kursisipervin.model.DangerLimit;
import com.mysql.jdbc.Driver;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBOperation {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    private void connect() {

        try {
            DriverManager.registerDriver(new Driver());
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kursisipervin", "root", "admin");
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void close() {

        try {
            if (!conn.isClosed()) {
                conn.close();

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AddNameMax(DangerLimit limit) {

        connect();
        try {
            ps = conn.prepareStatement("insert into danger_limit values(0,?,?,?,?,?,?,?,?)");
            ps.setString(1, limit.getName());
            ps.setDouble(2, limit.getCoxasagi());
            ps.setDouble(3, limit.getAsagi());
            ps.setDouble(4, limit.getNorma());
            ps.setDouble(5, limit.getYuxari());
            ps.setDouble(6, limit.getCoxyuxari());
            ps.setString(7, limit.getDangerMaxParam());
            ps.setString(8, limit.getMessage());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public List<DangerLimit> allNameMax() {
        List<DangerLimit> list = new ArrayList();
        connect();
        try {
            ps = conn.prepareStatement("select * from danger_limit");
            rs = ps.executeQuery();
            while (rs.next()) {
                DangerLimit dl = new DangerLimit();
                dl.setId(rs.getInt("id"));
                dl.setName(rs.getString("name"));
                dl.setCoxasagi(rs.getDouble("asagi"));
                dl.setAsagi(rs.getDouble("cox_asagi"));
                dl.setNorma(rs.getDouble("norma"));
                dl.setYuxari(rs.getDouble("yuxari"));
                dl.setCoxyuxari(rs.getDouble("cox_yuxari"));
                dl.setDangerMaxParam(rs.getString("danger_max_parametr"));
                dl.setMessage(rs.getString("message"));

                list.add(dl);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return list;

    }

    public void DeleteParametr(DangerLimit dl) {

        connect();
        try {
            ps = conn.prepareStatement("delete from danger_limit where id=(" + dl.getId() + ")");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

   

}
