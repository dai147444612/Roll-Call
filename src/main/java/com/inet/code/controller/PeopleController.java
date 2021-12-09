package com.inet.code.controller;


import com.inet.code.entity.dto.File;
import com.inet.code.entity.dto.StudentHit;
import com.inet.code.result.Result;
import com.inet.code.service.IPeopleService;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author drh
 * @since 2021-12-03
 */
@RestController
@CrossOrigin
@RequestMapping("/people")
public class PeopleController {
    @Resource
    private IPeopleService peopleService;

    @GetMapping("/getPeople")
    public Result getPeople(@RequestParam(value = "classes")String classes){
        return peopleService.getPeople(classes,"getPeople");
    }

    @GetMapping("/getClasses")
    public Result getClasses(){
        return peopleService.getClasses("getClasses");
    }

    @PostMapping("/hit")
    public Result hit(@RequestBody StudentHit studentHit){
        return peopleService.hit(studentHit,"hit");
    }
}
