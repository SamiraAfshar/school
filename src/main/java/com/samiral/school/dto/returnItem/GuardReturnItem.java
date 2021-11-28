package com.samiral.school.dto.returnItem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author SamiraAfshar
 * created on 24/11/2021
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class GuardReturnItem {
    private int id;
    private String firstName;
    private String lastName;
    private String fullName;

}
