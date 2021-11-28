package com.samiral.school.repositories.AddressRepository;

import com.samiral.school.entities.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author SamiraAfshar
 * created on 22/11/2021
 */
@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Integer> {
}
