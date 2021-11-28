package com.samiral.school.controllers.guardController;

import com.samiral.school.dto.postItem.CoursePostItem;
import com.samiral.school.dto.postItem.GuardPostItem;
import com.samiral.school.dto.returnItem.CourseReturnItem;
import com.samiral.school.dto.returnItem.GuardReturnItem;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author SamiraAfshar
 * created on 28/11/2021
 */
@RequestMapping("/api/guard")
public interface GuardApi {

    @GetMapping
    ResponseEntity<List<GuardReturnItem>> GuardService();

    @GetMapping("/{id}")
    ResponseEntity<GuardReturnItem> getGuardItem(@PathVariable int id);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteGuardItem(@PathVariable int id);

    @PutMapping
    ResponseEntity<Void> editGuardItem(@RequestBody GuardReturnItem guardReturnItem);

    @PostMapping
    ResponseEntity<Void> saveGuardItem(@RequestBody GuardPostItem guardPostItem);

}
