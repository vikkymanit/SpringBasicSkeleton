/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manit.springbasicskeleton.controller;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author manit
 */
@RestController
@RequestMapping("/api")
public class BasicController {
    
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public ResponseEntity<String> getTestData(@PathVariable String name) {
        
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json; charset=utf-8");
        
        Map<String,String> map = new HashMap<>();
        map.put("name", name);
        
        return new ResponseEntity<>(new Gson().toJson(map), headers, HttpStatus.OK);
        
    }
    
}
