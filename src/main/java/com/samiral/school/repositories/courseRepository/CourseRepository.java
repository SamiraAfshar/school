package com.samiral.school.repositories.courseRepository;

import com.samiral.school.entities.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author SamiraAfshar
 * created on 20/11/2021
 */
@Repository
public interface CourseRepository extends JpaRepository<CourseEntity,Integer> {
}
