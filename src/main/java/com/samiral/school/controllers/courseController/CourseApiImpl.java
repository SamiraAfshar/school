package com.samiral.school.controllers.courseController;

import com.samiral.school.dto.postItem.CoursePostItem;
import com.samiral.school.dto.returnItem.CourseReturnItem;
import com.samiral.school.services.courseService.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author SamiraAfshasr
 * created on 20/11/2021
 */
@RestController
public class CourseApiImpl implements CourseApi {
    @Autowired
    private CourseService courseService;

    @Override
    public ResponseEntity<List<CourseReturnItem>> getCourseItems() {
        return new ResponseEntity(courseService.getCourseItems(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<CourseReturnItem> getCourseItem(int id) {
        return new ResponseEntity( courseService.getCourseItem(id),HttpStatus.OK);

    }

    @Override
    public ResponseEntity<Void> deleteCourseItem(int id) {
        courseService.deleteCourseItem(id);
        return new ResponseEntity(HttpStatus.OK);

    }

    @Override
    public ResponseEntity<Void> editCourseItem(CourseReturnItem courseItem) {
        courseService.editCourseItem(courseItem);
        return new ResponseEntity(HttpStatus.OK);
    }


    @Override
    public ResponseEntity<Void> saveCourseItem(CoursePostItem postItem) {
        courseService.saveCourseItem(postItem);
        return new ResponseEntity(HttpStatus.OK);
    }
}
