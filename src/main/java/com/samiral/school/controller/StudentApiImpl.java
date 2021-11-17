package com.samiral.school.controller;

import com.samiral.school.dto.postItem.StudentPostItem;
import com.samiral.school.dto.returnItem.StudentReturnItem;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @author SamiraAfshar
 * created on 17/11/2021
 */
public class StudentApiImpl implements StudentApi {
    @Override
    public ResponseEntity<List<StudentReturnItem>> getStudentItems() {
        return null;
    }

    @Override
    public ResponseEntity<StudentReturnItem> getStudentItem(int id) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteStudentItem(int id) {
        return null;
    }

    @Override
    public ResponseEntity<Void> editStudentItem(StudentReturnItem studentItem) {
        return null;
    }

    @Override
    public ResponseEntity<StudentReturnItem> saveStudentItem(StudentPostItem postItem) {
        return null;
    }
}
