package com.samiral.school.controller;

import com.samiral.school.dto.postItem.StudentPostItem;
import com.samiral.school.dto.returnItem.StudentReturnItem;
import com.samiral.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author SamiraAfshar
 * created on 17/11/2021
 */
@RestController
public class StudentApiImpl implements StudentApi {

    @Autowired
    private StudentService studentService;

    @Override
    public ResponseEntity<List<StudentReturnItem>> getStudentItems() {
        return new ResponseEntity( studentService.getStudentItems(),HttpStatus.OK);
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
    public ResponseEntity<Void> saveStudentItem(StudentPostItem postItem) {
        studentService.saveStudentItem(postItem);

        return new ResponseEntity(HttpStatus.OK);
    }
}
