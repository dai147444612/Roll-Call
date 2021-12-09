package com.inet.code.service;

import com.inet.code.entity.dto.File;
import com.inet.code.entity.dto.StudentHit;
import com.inet.code.entity.po.People;
import com.baomidou.mybatisplus.extension.service.IService;
import com.inet.code.result.Result;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author drh
 * @since 2021-12-03
 */
public interface IPeopleService extends IService<People> {

    Result getPeople(String classes, String path);

    Result getClasses(String path);

    Result hit(StudentHit studentHit, String path);
}
