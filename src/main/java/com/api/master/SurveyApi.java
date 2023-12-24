package com.api.master;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.common.ResponseHandler;
import com.controller.SurveyController;
import com.dto.QuestionDto;
import com.model.Question;
import com.service.SurveyService;

@RestController
@RequestMapping("/api")
public class SurveyApi {
    
    @Autowired
    SurveyService surveyService;
    
    @PostMapping("/post-read-template")
    @ResponseBody
    public ResponseEntity<?> readTemplate(@RequestParam("file") MultipartFile file) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>.. ");
        try {
                byte[] bytes = file.getBytes();
                List<QuestionDto> fileData = surveyService.readFile(bytes);
            if(fileData==null){
                return ResponseHandler.generateResponse("Template Not Found", HttpStatus.NOT_FOUND, null);
            }
            return ResponseHandler.generateResponse("success", HttpStatus.OK, fileData);
            
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }                
    }

    @GetMapping("/get-initiate-question")
    @ResponseBody
    public ResponseEntity<?> initiate() throws Exception {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>.. ");
        try {
            List<QuestionDto> data = surveyService.initiateQuestion();
            if(data==null){
                return ResponseHandler.generateResponse("Template Not Found", HttpStatus.NOT_FOUND, null);
            }
            return ResponseHandler.generateResponse("success", HttpStatus.OK, data);
            
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }                
    }
}
