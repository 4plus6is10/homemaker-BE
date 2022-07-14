package com.plus6is10.homemaker.jython;

import java.sql.*;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/jython")
public class SearchContentBased {
    
    @GetMapping("/searchcontent")
    public static void main(String[] args) {

    Connection conn;
    Statement stmt;

    try {
    Class.forName("com.mysql.jdbc.Driver");//드라이버 로딩: DriverManager에 등록
    }catch(ClassNotFoundException e) {
    System.err.print("ClassNotFoundException: ");
    }

    try {
    //String jdbcUrl = "jdbc:mysql://localhost:3306/crm_db?useUnicode=true&useUnicode=true&characterEncoding=euc_kr";//사용하는 데이터베이스명을 포함한 url
    String jdbcUrl = "jdbc:mysql://3.39.177.19:3306/projectdb";//사용하는 데이터베이스명을 포함한 url
    String userId = "root";
    String userPass = "1234";

    conn = DriverManager.getConnection(jdbcUrl, userId, userPass);//Connection 객체를 얻어냄
    stmt = conn.createStatement();//Statement 객체를 얻어냄

    System.out.println("제대로 연결되었습니다");//성공시 화면에 표시됨

        ResultSet rs = stmt.executeQuery("SELECT searched_asin,  GROUP_CONCAT(asin SEPARATOR ',') AS asin FROM content_based WHERE searched_asin = 'B00004C8S8' GROUP BY searched_asin;");
        // int seq;
        String searched_asin;
        String asin, recommended_asin;
        while(rs.next()){
            searched_asin = rs.getString("searched_asin");
            asin = rs.getString("asin");
            // recommended_asin = rs.getString("recommended_asin");

            System.out.println(searched_asin+" "+asin);
            //System.out.println(no+" "+toUnicode(name)+" "+toUnicode(memo)); // 문자열이 latin1 일때 
        }
        

    }catch(SQLException e) {
        System.out.println("SQLException: " + e.getMessage());
        } 
    }

} 
