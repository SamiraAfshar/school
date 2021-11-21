package com.samiral.school.controllers.techerController;

import com.samiral.school.dto.postItem.TeacherPostItem;
import com.samiral.school.dto.returnItem.TeacherReturnItem;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author SamiraAfshar
 * created on 21/11/2021
 */
@RequestMapping("/api/teacher")
public interface TeacherApi {

    @GetMapping
    ResponseEntity<List<TeacherReturnItem>> getTeacherItem();

    @GetMapping("/{id}")
    ResponseEntity<TeacherReturnItem> getTeacherItem(@PathVariable int id);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteTeacherItem(@PathVariable int id);

    @PutMapping
    ResponseEntity<Void> editTeacherItem(@RequestBody TeacherReturnItem teacherReturnItem);

    @PostMapping
    ResponseEntity<Void> saveTeacherItem(@RequestBody TeacherPostItem postItem);
}
