package com.samiral.school.services.studentService;

import com.samiral.school.dto.postItem.StudentPostItem;
import com.samiral.school.dto.returnItem.AddressReturnItem;
import com.samiral.school.dto.returnItem.StudentReturnItem;
import com.samiral.school.entities.AddressEntity;
import com.samiral.school.entities.StudentEntity;
import com.samiral.school.repositories.studentRepository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
@RequiredArgsConstructor
@Slf4j
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    @Override
    public List<StudentReturnItem> getStudentItems() {
        try {
            List<StudentReturnItem> studentReturnItems=new ArrayList<>();
            List<StudentEntity> studentEntities=repository.findAll();
            for (StudentEntity studentEntity:studentEntities) {
                studentReturnItems.add(
                        StudentReturnItem.builder()
                                .id(studentEntity.getId())
                                .firstName(studentEntity.getFirstName())
                                .lastName(studentEntity.getLastName())
                                .address(AddressReturnItem.builder()
                                        .id(studentEntity.getAddress().getId())
                                        .city(studentEntity.getAddress().getCity())
                                        .streetName(studentEntity.getAddress().getStreetName())
                                        .build())
                                .build()
                );
            }
            return studentReturnItems;
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
            return null;
        }
    }

    @Override
    public StudentReturnItem getStudentItem(int id) {
        try {
            StudentEntity studentEntity = repository.getById(id);
            StudentReturnItem studentReturnItem=new StudentReturnItem();
            studentReturnItem.setId(studentEntity.getId());
            studentReturnItem.setFirstName(studentEntity.getFirstName());
            studentReturnItem.setLastName(studentEntity.getLastName());
            studentReturnItem.setAddress(AddressReturnItem.builder()
                    .id(studentEntity.getAddress().getId())
                    .city(studentEntity.getAddress().getCity())
                    .streetName(studentEntity.getAddress().getStreetName())
                    .build());
            return studentReturnItem;
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
            return null;
        }
    }

    @Override
    public void deleteStudentItem(int id) {
        try {
            repository.deleteById(id);
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
        }
    }

    @Override
    public void editStudentItem(StudentReturnItem studentItem) {
        try {
            StudentEntity studentEntity = repository.getById(studentItem.getId());
            studentEntity.setFirstName(studentItem.getFirstName());
            studentEntity.setLastName(studentItem.getLastName());
            AddressEntity addressEntity = AddressEntity.builder()
                    .id(studentItem.getAddress().getId())
                    .city(studentItem.getAddress().getCity())
                    .streetName(studentItem.getAddress().getStreetName())
                    .build();
            studentEntity.setAddress(addressEntity);
            repository.save(studentEntity);
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
        }
    }

    @Override
    public void saveStudentItem(StudentPostItem postItem) {
        try {
            StudentEntity studentEntity=new StudentEntity();
            studentEntity.setFirstName(postItem.getFirstName());
            studentEntity.setLastName(postItem.getLastName());
            AddressEntity addressEntity =new AddressEntity();
            addressEntity.setCity(postItem.getAddress().getCity());
            addressEntity.setStreetName(postItem.getAddress().getStreetName());
            studentEntity.setAddress(addressEntity);
            repository.save(studentEntity);
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
        }
    }
}
