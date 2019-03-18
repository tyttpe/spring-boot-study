package com.springboot.mybatis.mapper;

import com.springboot.mybatis.entity.Course;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface CourseMapper{
    @Results({@Result(column = "course_id",property = "courseId"),
            @Result(column = "course_name",property = "courseName"),
            @Result(column = "user_id",property = "userId"),
            @Result(column = "course_class",property = "courseClass"),
            @Result(column = "cover",property = "cover"),
            @Result(column = "course_code",property = "courseCode"),
            @Result(column = "finished",property = "finished")
    })

    @Select("SELECT * FROM t_course ")
    List<Course> selectAll();

    @Results({@Result(column = "course_id",property = "courseId"),
            @Result(column = "course_name",property = "courseName"),
            @Result(column = "user_id",property = "userId"),
            @Result(column = "course_class",property = "courseClass"),
            @Result(column = "cover",property = "cover"),
            @Result(column = "course_code",property = "courseCode"),
            @Result(column = "finished",property = "finished")
    })

    @Select("SELECT * FROM t_course WHERE course_id = #{courseId} ")
    Course getOne(Long courseId);

    @Delete("DELETE FROM t_course WHERE course_id =#{courseId} ")
    void delete(Long courseId);

    @Insert("INSERT INTO t_course(course_name,user_id,course_class,cover,course_code,finished)"+
            "VALUES(#{courseName},#{userId},#{courseClass},#{cover},#{courseCode},#{finished}) ")
    void insert(Course course);

    @Update("UPDATE t_course SET cover=#{cover},finished=#{finished} WHERE course_id=#{courseId} ")
    void updata(Course course);
}
