package com.samiral.school.services.courseService;

import com.samiral.school.dto.postItem.CoursePostItem;
import com.samiral.school.dto.returnItem.CourseReturnItem;
import com.samiral.school.entities.CourseEntity;
import com.samiral.school.repositories.courseRepository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * @author SamiraAfshar
 * created on 20/11/2021
 */
@Service("CourseService")
@Transactional
@RequiredArgsConstructor
@Slf4j
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;


    @Override
    public List<CourseReturnItem> getCourseItems() {
        try {
            List<CourseReturnItem> courseReturnItems=new ArrayList<>();
            List<CourseEntity> courseEntities=courseRepository.findAll();
            for(CourseEntity courseEntity :courseEntities){
                courseReturnItems.add(
                        CourseReturnItem.builder()
                                .id(courseEntity.getId())
                                .courseName(courseEntity.getCourseName())
                                .build()
                );
            }

            return courseReturnItems;
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
            return null;
        }
    }

    @Override
    public CourseReturnItem getCourseItem(int id) {
        try {
            CourseEntity courseEntity = courseRepository.getById(id);
            CourseReturnItem courseReturnItem=new CourseReturnItem();
            courseReturnItem.setId(courseEntity.getId());
            courseReturnItem.setCourseName(courseEntity.getCourseName());
            return courseReturnItem;
        }
        catch (Exception e)
        {
            log.error((e.getMessage()));
            return null;
        }
    }

    @Override
    public void deleteCourseItem(int id) {
        try {
            courseRepository.deleteById(id);
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
        }
    }

    @Override
    public void editCourseItem(CourseReturnItem courseItem) {
        try {
            CourseEntity courseEntity = courseRepository.getById(courseItem.getId());
            courseEntity.setCourseName(courseItem.getCourseName());
            courseRepository.save(courseEntity);
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
        }

    }

    @Override
    public void saveCourseItem(CoursePostItem postItem) {
        try {
            CourseEntity courseEntity =new CourseEntity();
            courseEntity.setCourseName(postItem.getCourseName());
            courseRepository.save(courseEntity);
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
        }

    }
}
