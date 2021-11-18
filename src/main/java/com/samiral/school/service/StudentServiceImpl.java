package com.samiral.school.service;

import com.samiral.school.dto.postItem.StudentPostItem;
import com.samiral.school.dto.returnItem.StudentReturnItem;
import com.samiral.school.entity.StudentEntity;
import com.samiral.school.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * @author SamiraAfshar
 * created on 17/11/2021
 */
@Service("StudentService")
@Transactional
public class StudentServiceImpl implements StudentService {

//    private final StudentRepository repository;
    @Autowired
    private StudentRepository repository;


    @Override
    public List<StudentReturnItem> getStudentItems() {
        List<StudentReturnItem> studentReturnItems=new ArrayList<>();
        List<StudentEntity> studentEntities=repository.findAll();
        for (StudentEntity studentEntity:studentEntities) {
            studentReturnItems.add(
                    StudentReturnItem.builder()
                            .id(studentEntity.getId())
                            .firstName(studentEntity.getFirstName())
                            .lastName(studentEntity.getLastName())
                            .build()
            );
        }
        return studentReturnItems;
    }

    @Override
    public StudentReturnItem getStudentItem(int id) {
        return null;
    }

    @Override
    public void deleteStudentItem(int id) {

    }

    @Override
    public void editStudentItem(StudentReturnItem studentItem) {

    }

    @Override
    public void saveStudentItem(StudentPostItem postItem) {
        StudentEntity studentEntity=new StudentEntity();
        studentEntity.setFirstName(postItem.getFirstName());
        studentEntity.setLastName(postItem.getLastName());
        repository.save(studentEntity);
    }
}
