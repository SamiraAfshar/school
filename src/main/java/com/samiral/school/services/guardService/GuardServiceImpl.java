package com.samiral.school.services.guardService;

import com.samiral.school.dto.postItem.GuardPostItem;
import com.samiral.school.dto.returnItem.GuardReturnItem;
import com.samiral.school.entities.GuardEntity;
import com.samiral.school.repositories.guardRepository.GuardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * @author SamiraAfshar
 * created on 28/11/2021
 */
@Service
@Transactional
@Slf4j
public class GuardServiceImpl implements GuardService {
    @Autowired
    private GuardRepository guardRepository;

    @Override
    public List<GuardReturnItem> getGuardItems() {
        try{
            List<GuardReturnItem>guardReturnItems=new ArrayList<>();
            List<GuardEntity>guardEntities=guardRepository.findAll();
            for(GuardEntity guardEntity: guardEntities) {
                guardReturnItems.add(
                        GuardReturnItem.builder()
                                .id(guardEntity.getId())
                                .firstName(guardEntity.getFirstName())
                                .lastName(guardEntity.getLastName())
                                .fullName(guardEntity.getFirstName() +" "+ guardEntity.getLastName())
                        .build()
                );
            }
            return guardReturnItems;
        }
        catch(Exception e)
        {
            log.error(e.getMessage());
            return null;
        }

    }

    @Override
    public GuardReturnItem getGuardItem(int id) {
        try{
            GuardEntity guardEntity = guardRepository.getById(id);
            GuardReturnItem guardReturnItem = GuardReturnItem.builder()
                    .id(guardEntity.getId())
                    .firstName(guardEntity.getFirstName())
                    .lastName(guardEntity.getLastName())
                    .fullName(guardEntity.getFirstName() +" "+ guardEntity.getLastName())
                    .build();
            return guardReturnItem;

        }
        catch(Exception e)
        {
            log.error(e.getMessage());
            return null;
        }

    }

    @Override
    public void deleteGuardItem(int id) {
        try {
            guardRepository.deleteById(id);
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
        }
    }

    @Override
    public void editGuardItem(GuardReturnItem guardReturnItem) {
        try{
            GuardEntity guardEntity = guardRepository.getById(guardReturnItem.getId());
            guardEntity.setFirstName(guardReturnItem.getFirstName());
            guardEntity.setLastName(guardReturnItem.getLastName());
            guardRepository.save(guardEntity);
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
        }
    }

    @Override
    public void saveGuardItem(GuardPostItem guardPostItem) {
        try {
            GuardEntity guardEntity =GuardEntity.builder()
                    .firstName(guardPostItem.getFirstName())
                    .lastName(guardPostItem.getLastName())
                    .build();
            guardRepository.save(guardEntity);
        }
        catch (Exception e){
            log.error(e.getMessage());
        }

    }
}
