package com.example.controller;

import com.example.pojo.Person;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 326944 on 2017/7/12.
 */
@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/show",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public List<Person> show(){
        List<Person> list = personService.show();
        return list;
    }


    @RequestMapping(value = "/redirect",method = RequestMethod.GET)
    public String redirect(){
        return "redirect";
    }

}
