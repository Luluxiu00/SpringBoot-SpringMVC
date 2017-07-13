package com.example.service.impl;

import com.example.mapper.PersonMapper;
import com.example.pojo.Person;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 326944 on 2017/7/12.
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public List<Person> show() {
        return personMapper.show();
    }
}
