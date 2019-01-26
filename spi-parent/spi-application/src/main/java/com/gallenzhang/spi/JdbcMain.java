package com.gallenzhang.spi;
import java.sql.*;

/**
 * @author : zhangxq
 * @date : 2019/1/26
 * @description :Jdbc测试
 */
public class JdbcMain {

    public static void main(String[] args) {
        try {
            String url="jdbc:mysql://127.0.0.1:3306/seckill?useUnicode=true&amp;characterEncoding=utf-8";
            String user = "root";
            String password = "root";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            String queryStr = "select count(*) from seckill";
            PreparedStatement pst = conn.prepareStatement(queryStr);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt(1));
            }
            rs.close();
            pst.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
