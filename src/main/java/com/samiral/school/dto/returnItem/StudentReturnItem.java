package com.samiral.school.dto.returnItem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author SamiraAfshar
 * created on 17/11/2021
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class StudentReturnItem {
    private int id;
    private String firstName;
    private String lastName;
    private AddressReturnItem address;
}
