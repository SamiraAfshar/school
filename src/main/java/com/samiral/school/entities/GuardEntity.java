package com.samiral.school.entities;

import lombok.Builder;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author SamiraAfshar
 * created on 24/11/2021
 */
@Builder
@Entity
@Table(name= "guard")
public class GuardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "guard_id")
    private int id;
    private String firstName;
    private String lastName;

    public GuardEntity(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public GuardEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GuardEntity that = (GuardEntity) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "GuardEntity{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}





