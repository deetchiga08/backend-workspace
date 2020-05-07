package com.briller.Controller;

import com.briller.Model.general;
import com.briller.Repository.generalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class testController {

    @Autowired
    generalRepository GeneralRepository;

    @PostMapping("/addtest")
    public general add(@RequestBody general General)
    {
        GeneralRepository.save(General);
        return  General;
    }

    @GetMapping("/getdata")
    public List<general> getdata()
    {
        List<general> s=GeneralRepository.findAll();

        System.out.println(s);
        return s;
    }
}
