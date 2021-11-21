package com.samiral.school.dto.returnItem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author SamiraAfshar
 * created on 21/11/2021
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TeacherReturnItem {
    private int id;
    private String firstName;
    private String lastName;
}
