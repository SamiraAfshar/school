package com.samiral.school.services.guardService;

import com.samiral.school.dto.postItem.GuardPostItem;
import com.samiral.school.dto.returnItem.GuardReturnItem;

import java.util.List;

/**
 * @author SamiraAfshar
 * created on 25/11/2021
 */
public interface GuardService {
    List<GuardReturnItem> getGuardItems();
    GuardReturnItem getGuardItem(int id);
    void deleteGuardItem(int id);
    void editGuardItem(GuardReturnItem guardReturnItem);
    void saveGuardItem(GuardPostItem guardPostItem);

}
