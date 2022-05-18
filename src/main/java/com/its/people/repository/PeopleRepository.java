package com.its.people.repository;

import com.its.people.dto.PeopleDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PeopleRepository {
    @Autowired
    private SqlSessionTemplate sql;

    public void save(String name, int age) {
        System.out.println("name = " + name + ", age = " + age);

        PeopleDTO peopleDTO = new PeopleDTO();
        peopleDTO.setName(name);
        peopleDTO.setAge(age);
        sql.insert("People.save", peopleDTO);
    }

    public void save1(PeopleDTO peopleDTO) {
        sql.insert("People.save", peopleDTO);
    }
}
