package com.samiral.school.repository;

import com.samiral.school.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author SamiraAfshar
 * created on 17/11/2021
 */
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Integer> {

}
