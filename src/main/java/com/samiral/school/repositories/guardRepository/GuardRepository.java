package com.samiral.school.repositories.guardRepository;

import com.samiral.school.entities.GuardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author SamiraAfshar
 * created on 24/11/2021
 */
@Repository
public interface GuardRepository extends JpaRepository<GuardEntity,Integer> {
}
