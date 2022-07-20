package com.plus6is10.homemaker.controller;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

// [크로스 도메인 접속 허용 설정]
@CrossOrigin("*")

// [RestController = rest api 요청 / Controller = view 연결]
@RestController
public class ImageController {
    @GetMapping("/showImage")
    public ResponseEntity<Resource> showImage(@RequestParam Map<String, String> param) {

        // String imageRoot =
        // "http://43.200.48.164:50070/explorer.html#/amazon_data/wordcloud/";
        String imageRoot = "E:/Amazon review data (2018)/00. data/wordcloud2/";

        // 서버 경로 + 파일 명 저장 실시
        imageRoot = imageRoot + String.valueOf(param.get("asin"));

        System.out.println(imageRoot);

        // Resorce를 사용해서 로컬 서버에 저장된 이미지 경로 및 파일 명을 지정
        Resource resource = new FileSystemResource(imageRoot);

        // 로컬 서버에 저장된 이미지 파일이 없을 경우
        if (!resource.exists()) {
            System.out.println("FILE : NOT_FOUND");
            return new ResponseEntity<Resource>(HttpStatus.NOT_FOUND); // 리턴 결과 반환 404
        }

        // 로컬 서버에 저장된 이미지가 있는 경우 로직 처리
        HttpHeaders header = new HttpHeaders();
        Path filePath = null;
        try {
            filePath = Paths.get(imageRoot);
            // 인풋으로 들어온 파일명 .png / .jpg 에 맞게 헤더 타입 설정
            header.add("Content-Type", Files.probeContentType(filePath));
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 이미지 리턴 실시 [브라우저에서 get 주소 확인 가능]
        return new ResponseEntity<Resource>(resource, header, HttpStatus.OK);
    }

}