package com.lizhizhao.db.SpringBootJdbcTemplate.controller;

import com.lizhizhao.db.SpringBootJdbcTemplate.entity.PersonDO;
import com.lizhizhao.db.SpringBootJdbcTemplate.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lizhizhao
 * @since 2020-07-22 18:26
 */
@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<PersonDO> list(){
        return personService.findPersonList();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public PersonDO get(@PathVariable("id") int id){
        return personService.findPersonById(id);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public  String update(@PathVariable("id")Long id , @RequestParam(value = "name",required = true)String name,
                                 @RequestParam(value = "age" ,required = true)int age){
        PersonDO PersonDO = new PersonDO();
        PersonDO.setAge(age);
        PersonDO.setName(name);
        PersonDO.setId(id);
        int t=personService.update(PersonDO);
        if(t==1){
            return PersonDO.toString();
        }else {
            return "fail";
        }
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String insert(@RequestBody PersonDO personDO){
        int t = personService.add(personDO);
        return t==1 ? "true" : "fail";
    }

}
