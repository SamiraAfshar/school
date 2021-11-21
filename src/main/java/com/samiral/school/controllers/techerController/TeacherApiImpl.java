package com.samiral.school.controllers.techerController;

import com.samiral.school.dto.postItem.TeacherPostItem;
import com.samiral.school.dto.returnItem.TeacherReturnItem;
import com.samiral.school.services.teacherService.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author SamiraAfshar
 * created on 21/11/2021
 */
@RestController
public class TeacherApiImpl implements TeacherApi {
    @Autowired
    private TeacherService teacherService;

    @Override
    public ResponseEntity<List<TeacherReturnItem>> getTeacherItem() {
        return new ResponseEntity( teacherService.getTeacherItem(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<TeacherReturnItem> getTeacherItem(int id) {
        return new ResponseEntity(teacherService.getTeacherItem(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteTeacherItem(int id) {
        teacherService.deleteTeacherItem(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> editTeacherItem(TeacherReturnItem teacherReturnItem) {
        teacherService.editTeacherItem(teacherReturnItem);
        return new ResponseEntity(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> saveTeacherItem(TeacherPostItem postItem) {
        teacherService.saveTeacherItem(postItem);
        return new ResponseEntity(HttpStatus.OK);
    }
}
