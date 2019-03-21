package com.springboot.mybatis.service;

import com.springboot.mybatis.entity.Course;
import com.springboot.mybatis.entity.CourseVO;

import java.util.List;

public interface CourseService {
    List<Course> selectAll();

    Course getOne(long courseId);

    void delete(long courseId);

    Course  insert(Course course);

    void updata(Course course);

    List<CourseVO> selectCurrenCourses();

    List<CourseVO> selectCurrenCourses2();
}
