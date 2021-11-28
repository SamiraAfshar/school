package com.samiral.school.services.teacherService;

import com.samiral.school.dto.postItem.TeacherPostItem;
import com.samiral.school.dto.returnItem.TeacherReturnItem;
import com.samiral.school.entities.TeacherEntity;
import com.samiral.school.repositories.teacherRepository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * @author SamiraAfshar
 * created on 21/11/2021
 */
@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public List<TeacherReturnItem> getTeacherItem() {
        try {
            List<TeacherReturnItem> teacherReturnItem=new ArrayList<>();
            List<TeacherEntity> teacherEntities=teacherRepository.findAll();
            for (TeacherEntity teacherEntity:teacherEntities) {
                teacherReturnItem.add(
                        TeacherReturnItem.builder()
                                .id(teacherEntity.getId())
                                .firstName(teacherEntity.getFirstName())
                                .lastName(teacherEntity.getLastName())
                                .build()
                );
            }
            return teacherReturnItem;
        }
        catch (Exception e) {
            log.error(e.getMessage());
            return null;
        }
    }

    @Override
    public TeacherReturnItem getTeacherItem(int id) {
        try{
            TeacherEntity teacherEntity = new TeacherEntity();
            teacherEntity = teacherRepository.getById(id);
            TeacherReturnItem teacherReturnItem =new TeacherReturnItem();
            teacherReturnItem.setId(teacherEntity.getId());
            teacherReturnItem.setFirstName(teacherEntity.getFirstName());
            teacherReturnItem.setLastName(teacherEntity.getLastName());
            return teacherReturnItem;

        }
        catch (Exception e)
        {
            log.error(e.getMessage());
            return null;
        }

    }

    @Override
    public void deleteTeacherItem(int id) {
        try {
            teacherRepository.deleteById(id);
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
        }

    }

    @Override
    public void editTeacherItem(TeacherReturnItem teacherReturnItem) {
        try{
            TeacherEntity teacherEntity = new TeacherEntity();
            teacherEntity.setId(teacherReturnItem.getId());
            teacherEntity.setFirstName(teacherReturnItem.getFirstName());
            teacherEntity.setLastName(teacherReturnItem.getLastName());
            teacherRepository.save(teacherEntity);
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
        }
    }

    @Override
    public void saveTeacherItem(TeacherPostItem postItem) {
        try{
            TeacherEntity teacherEntity =new TeacherEntity();
            teacherEntity.setFirstName(postItem.getFirstName());
            teacherEntity.setLastName(postItem.getLastName());
            teacherRepository.save(teacherEntity);
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
        }
    }
}
