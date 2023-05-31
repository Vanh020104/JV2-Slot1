package demo2;

import java.sql.*;

public class ClassRoom {
    private final static String connectionString = "jdbc:mysql://localhost:3306/classrooms";
    private final static String user = "root";
    private final static String pwd = "";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectionString, user, pwd);

            // query
            Statement stt = conn.createStatement();
            String sql = "select * from classrooms";
            ResultSet rs = stt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String room = rs.getString("room");
                System.out.printf(id + "-" + name + "-" + room);
            }
        } catch (Exception e) {
            System.out.println("error:" + e.getMessage());
        }
    }
}
