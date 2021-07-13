package com.kodilla.kodillaconverter.controller;

import com.kodilla.kodillaconverter.domain.MyOwnConverterClass;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/EURO2020/")
public class MyOwnConverterController {

    @PostMapping(path = "final")
    public void acceptCustomTextType(@RequestBody MyOwnConverterClass customObject) {
        System.out.println(customObject.getFieldOne());
        System.out.println(customObject.getFieldTwo());
    }

}