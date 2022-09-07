package com.example.demo.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.domain.Persona;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class PrecipitacionRestController {
    
    Persona persona;
    
    @GetMapping("/")
    public String index(){
        return "index";
    }
    
//    @PostMapping("/respuesta")
//    public JSONObject respuesta(@RequestBody JSONObject param){
//        
//        JSONArray cosito = param.getJSONArray("array");
//        
//        for(int i = 0; i<cosito.size(); i++){
//            cosito.set(i, cosito.getIntValue(i)/2);
//        }
//        
//        param.put("array", cosito);
//        
//        System.out.println(param);
//        
//        return param;
//    }
    
    @PostMapping("/respuesta")
    public ResponseEntity<JSONObject> respuesta(@RequestBody JSONObject param){
        
        JSONArray cosito = param.getJSONArray("array");
        
        param.put("arrey", "Palalalala");
        
        System.out.println("Zurdito");
        
        System.out.println(param);
        
        for(int i = 0; i<cosito.size(); i++){
            cosito.set(i, cosito.getIntValue(i)/2);
        }
        
        param.put("array", cosito);
        
        System.out.println(param);
        
        return new ResponseEntity(param, HttpStatus.OK);
    }
}
