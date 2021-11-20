package com.samiral.school.repositories.studentRepository;

import com.samiral.school.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author SamiraAfshar
 * created on 17/11/2021
 */
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Integer> {

}
