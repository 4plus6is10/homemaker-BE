package com.plus6is10.homemaker.jython;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test2 {
    public static void main(String[] args) {
        Connection conn;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://43.200.48.164:3306/projectdb","root","1234");

            System.out.println("연결 성공");

            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
