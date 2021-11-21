package com.samiral.school.services.teacherService;

import com.samiral.school.dto.postItem.StudentPostItem;
import com.samiral.school.dto.postItem.TeacherPostItem;
import com.samiral.school.dto.returnItem.StudentReturnItem;
import com.samiral.school.dto.returnItem.TeacherReturnItem;

import java.util.List;

/**
 * @author SamiraAfshar
 * created on 21/11/2021
 */
public interface TeacherService {
    List<TeacherReturnItem> getTeacherItem();
    TeacherReturnItem getTeacherItem(int id);
    void deleteTeacherItem(int id);
    void editTeacherItem(TeacherReturnItem teacherReturnItem);
    void saveTeacherItem(TeacherPostItem postItem);
}
