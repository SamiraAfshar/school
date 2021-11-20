package com.samiral.school.controllers.studentController;

import com.samiral.school.dto.postItem.StudentPostItem;
import com.samiral.school.dto.returnItem.StudentReturnItem;
import com.samiral.school.services.studentService.StudentService;
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
        return new ResponseEntity( studentService.getStudentItem(id),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteStudentItem(int id) {
       studentService.deleteStudentItem(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> editStudentItem(StudentReturnItem studentItem) {
        studentService.editStudentItem(studentItem);
        return new ResponseEntity(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> saveStudentItem(StudentPostItem postItem) {
        studentService.saveStudentItem(postItem);

        return new ResponseEntity(HttpStatus.OK);
    }
}
