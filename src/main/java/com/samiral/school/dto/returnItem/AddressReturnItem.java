package com.samiral.school.dto.returnItem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author SamiraAfshar
 * created on 20/11/2021
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AddressReturnItem {
    private int id;
    private String city;
    private String streetName;
}
