package com.inet.code.mapper;

import com.inet.code.entity.po.People;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author drh
 * @since 2021-12-03
 */
public interface PeopleMapper extends BaseMapper<People> {

    List<People> getPeople(String classes);

    List<String> getClasses();

    void hit(Integer studentId);
}
