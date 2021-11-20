package com.samiral.school.services.courseService;

import com.samiral.school.dto.postItem.CoursePostItem;
import com.samiral.school.dto.postItem.StudentPostItem;
import com.samiral.school.dto.returnItem.CourseReturnItem;
import com.samiral.school.dto.returnItem.StudentReturnItem;

import java.util.List;

/**
 * @author SamiraAfshar
 * created on 20/11/2021
 */
public interface CourseService {
    List<CourseReturnItem> getCourseItems();
    CourseReturnItem getCourseItem(int id);
    void deleteCourseItem(int id);
    void editCourseItem(CourseReturnItem courseItem);
    void saveCourseItem(CoursePostItem postItem);
}

