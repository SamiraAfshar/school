package com.samiral.school.service;

import com.samiral.school.dto.postItem.StudentPostItem;
import com.samiral.school.dto.returnItem.StudentReturnItem;

import java.util.List;

/**
 * @author SamiraAfshar
 * created on 17/11/2021
 */
public interface StudentService {
    List<StudentReturnItem> getStudentItems();
    StudentReturnItem getStudentItem(int id);
    void deleteStudentItem(int id);
    void editStudentItem(StudentReturnItem studentItem);
    void saveStudentItem(StudentPostItem postItem);
}
