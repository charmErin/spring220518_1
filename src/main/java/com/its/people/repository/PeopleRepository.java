package com.its.people.repository;

import com.its.people.dto.PeopleDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    public int save1(PeopleDTO peopleDTO) {
        return sql.insert("People.save", peopleDTO);
    }

    public List<PeopleDTO> findAll(){
        return sql.selectList("People.findAll");
    }
}
