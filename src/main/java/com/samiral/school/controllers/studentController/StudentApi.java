package com.samiral.school.controllers.studentController;

import com.samiral.school.dto.postItem.StudentPostItem;
import com.samiral.school.dto.returnItem.StudentReturnItem;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author SamiraAfshar
 * created on 17/11/2021
 */
@RequestMapping("/api/student")
public interface StudentApi {

    @GetMapping
    ResponseEntity<List<StudentReturnItem>> getStudentItems();

    @GetMapping("/{id}")
    ResponseEntity<StudentReturnItem> getStudentItem(@PathVariable int id);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteStudentItem(@PathVariable int id);

    @PutMapping
    ResponseEntity<Void> editStudentItem(@RequestBody StudentReturnItem studentItem);

    @PostMapping
    ResponseEntity<Void> saveStudentItem(@RequestBody StudentPostItem postItem);
}
