package com.service.impl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.common.GenerateUUID;
import com.dao.QuestionDao;
import com.dao.SurveyDao;
import com.dto.QuestionDto;
import com.dto.SurveyDto;
import com.model.Question;
import com.model.Survey;
import com.service.SurveyService;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurveyServiceImpl implements SurveyService{

    @Autowired
    SurveyDao surveyDao;

    @Autowired
    QuestionDao questionDao;

    @Override
    public List<QuestionDto> readFile(byte[] bytes) {
        List<QuestionDto> dto = new ArrayList<>();
        InputStream input = new ByteArrayInputStream(bytes);
        SurveyDto surveyDto = new SurveyDto();
        surveyDto.setTitle("Survey 2023");
        surveyDto.setYear(2023);
        surveyDto.setId(new GenerateUUID().generateUuid()); 

        try (XSSFWorkbook wb = new XSSFWorkbook(input)) {
            Sheet sheet = wb.getSheetAt(0);
            for (Row row : sheet) {
                if(row.getRowNum()==0){
                    continue;
                }
                QuestionDto map =new QuestionDto();
                for (Cell cn : row) {
                    switch (cn.getCellType()) {
                        case STRING:                             
                            if(cn.getColumnIndex()==0){
                                map.setReferenceId(cn.getRichStringCellValue().toString());            
                            }
                            if(cn.getColumnIndex()==1){
                                map.setQuestion(cn.getRichStringCellValue().toString());        
                            }
                            if(cn.getColumnIndex()==2){
                                map.setType(cn.getRichStringCellValue().toString());          
                            }
                            if(cn.getColumnIndex()==3){
                                map.setParentQuestionId(cn.getRichStringCellValue().toString());
                            }
                            if(cn.getColumnIndex()==4){
                                map.setCategory(cn.getRichStringCellValue().toString());
                            }
                        break;
                        case NUMERIC:
                            if(cn.getColumnIndex()==0){
                                map.setReferenceId(String.valueOf(cn.getNumericCellValue()));            
                            }
                            if(cn.getColumnIndex()==3){
                                map.setParentQuestionId(String.valueOf(cn.getNumericCellValue()));
                            }
                        break;
                        case BOOLEAN: 
                        break;
                        case FORMULA: 
                        break;
                        default: ;
                    }
                }
                map.setSurveyId(surveyDto.getId());
                dto.add(map);
            }
            surveyDto.setQuestions(dto);
            createData(surveyDto);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dto;    }

    @Override
    public SurveyDto createData(SurveyDto dto) {
        try {
            Survey survey = new Survey();
            survey = new ModelMapper().map(dto, Survey.class);

            if(dto.getQuestions().size()>0){
                for(int i =0 ; i < dto.getQuestions().size(); i++){
                    Question obj = new Question();
                    obj = new ModelMapper().map(dto.getQuestions().get(i), Question.class);
                    obj.setId(new GenerateUUID().generateUuid());
                    questionDao.save(obj);
                }
            }

            surveyDao.save(survey);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dto;
    }

    @Override
    public List<QuestionDto> initiateQuestion() {

        List<Question> questions = questionDao.initiate();
        List<QuestionDto> dtos = new ArrayList<>();

        for(int i = 0; i < questions.size(); i++){
            QuestionDto dto = new QuestionDto();
            dto = new ModelMapper().map(questions.get(i), QuestionDto.class);
            List<Map<String,Object>> listAnswer = new ArrayList<>();
            if(dto.getType().equalsIgnoreCase("multiple choice")){
                List<Question> options = questionDao.getOptions(dto.getReferenceId());
                if(options.size()>0){
                    for(int j = 0; j < options.size(); j++){
                        Map<String,Object> map = new HashMap<>();
                        map.put("id", options.get(j).getId());
                        map.put("referenceId", options.get(j).getReferenceId());
                        map.put("answer", options.get(j).getQuestion()); 
                        listAnswer.add(map);  
                    }
                }
                dto.setOptions(listAnswer);
            }
            dtos.add(dto);
        }

        return dtos;

    }
    
}
