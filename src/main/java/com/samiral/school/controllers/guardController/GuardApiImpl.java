package com.samiral.school.controllers.guardController;

import com.samiral.school.dto.postItem.GuardPostItem;
import com.samiral.school.dto.returnItem.GuardReturnItem;
import com.samiral.school.services.guardService.GuardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author SamiraAfshar
 * created on 28/11/2021
 */
@RestController
public class GuardApiImpl implements GuardApi {
    @Autowired
    private GuardService guardService;

    @Override
    public ResponseEntity<List<GuardReturnItem>> GuardService() {
        return new ResponseEntity(guardService.getGuardItems(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<GuardReturnItem> getGuardItem(int id) {
        return new ResponseEntity( guardService.getGuardItem(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteGuardItem(int id) {
        guardService.deleteGuardItem(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> editGuardItem(GuardReturnItem guardReturnItem) {
        guardService.editGuardItem(guardReturnItem);
        return new ResponseEntity(HttpStatus.OK);

    }

    @Override
    public ResponseEntity<Void> saveGuardItem(GuardPostItem guardPostItem) {
        guardService.saveGuardItem(guardPostItem);
        return new ResponseEntity(HttpStatus.OK);

    }
}
