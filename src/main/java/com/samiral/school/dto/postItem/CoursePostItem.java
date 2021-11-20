package com.samiral.school.dto.postItem;

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
public class CoursePostItem {
    private String courseName;
}
