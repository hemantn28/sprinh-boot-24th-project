package com.example.demo.controller;

import com.example.demo.model.Women;
import com.example.demo.repository.WomenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WomenDBController {

    //Create
    @Autowired
    WomenRepository repository;

    @RequestMapping(value = "add_women_db",method = RequestMethod.POST)
    public String add(@RequestBody Women women){

        repository.save(women);
        return "women added to DB successfully";
    }


    //Get

    @RequestMapping(value = "get_women_db",method = RequestMethod.GET)
    public List<Women> getAll(){
        return repository.findAll();

    }

    //Update

    @RequestMapping(value = "update_women_db",method = RequestMethod.PUT)
    public String update(@RequestParam String name,@RequestParam Integer id){
        Women women=repository.getById(id);
        women.setName("Anandi");
        repository.save(women);
        return "women updated in DB successfully";
    }


    //Delete

    @RequestMapping(value = "women_deleted_db",method = RequestMethod.DELETE)
    public String delete(@RequestParam Integer id){
        repository.deleteById(id);
        return "women deleted in db successfully";
    }






}
