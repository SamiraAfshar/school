package com.samiral.school.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author SamiraAfshar
 * created on 21/11/2021
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "address")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String city;
    private String streetName;
    @OneToOne(mappedBy = "address")
    private StudentEntity student;
}
