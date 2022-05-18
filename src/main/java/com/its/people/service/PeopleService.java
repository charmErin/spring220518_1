package com.its.people.service;

import com.its.people.dto.PeopleDTO;
import com.its.people.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleService {

    @Autowired
    private PeopleRepository peopleRepository;

    public void save(String name, int age) {
        System.out.println("PeopleService.save");
        peopleRepository.save(name, age);
    }

    public boolean save1(PeopleDTO peopleDTO) {
        int saveResult = peopleRepository.save1(peopleDTO);
        if(saveResult > 0) {
            return true;
        } else {
            return false;
        }
    }
}
