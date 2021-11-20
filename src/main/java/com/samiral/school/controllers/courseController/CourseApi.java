package com.samiral.school.controllers.courseController;

import com.samiral.school.dto.postItem.CoursePostItem;
import com.samiral.school.dto.postItem.StudentPostItem;
import com.samiral.school.dto.returnItem.CourseReturnItem;
import com.samiral.school.dto.returnItem.StudentReturnItem;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author SamiraAfshar
 * created on 20/11/2021
 */
@RequestMapping("/api/course")
public interface CourseApi {

    @GetMapping
    ResponseEntity<List<CourseReturnItem>> getCourseItems();

    @GetMapping("/{id}")
    ResponseEntity<CourseReturnItem> getCourseItem(@PathVariable int id);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteCourseItem(@PathVariable int id);

    @PutMapping
    ResponseEntity<Void> editCourseItem(@RequestBody CourseReturnItem courseItem);

    @PostMapping
    ResponseEntity<Void> saveCourseItem(@RequestBody CoursePostItem postItem);
}
