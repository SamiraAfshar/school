package com.samiral.school.repositories.teacherRepository;

import com.samiral.school.entities.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author SamiraAfshar
 * created on 21/11/2021
 */
@Repository
public interface TeacherRepository extends JpaRepository<TeacherEntity,Integer> {
}
