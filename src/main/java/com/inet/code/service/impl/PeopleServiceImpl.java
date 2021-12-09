package com.inet.code.service.impl;

import com.inet.code.entity.dto.File;
import com.inet.code.entity.dto.StudentHit;
import com.inet.code.entity.po.People;
import com.inet.code.mapper.PeopleMapper;
import com.inet.code.result.Result;
import com.inet.code.service.IPeopleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.inet.code.util.PoiUtil;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author drh
 * @since 2021-12-03
 */
@Service
public class PeopleServiceImpl extends ServiceImpl<PeopleMapper, People> implements IPeopleService {
    @Resource
    private PeopleMapper peopleMapper;

    @Override
    public Result getPeople(String classes, String path) {
        List<People> people = peopleMapper.getPeople(classes);
        return new Result().result200(people,path);
    }

    @Override
    public Result getClasses(String path) {
        List<String> classes = peopleMapper.getClasses();
        System.out.println(classes);
        return new Result().result200(classes,path);
    }

    @Override
    public Result hit(StudentHit studentHit, String path) {
        peopleMapper.hit(studentHit.getStudentId());
        return new Result().result200("成功",path);
    }


}
