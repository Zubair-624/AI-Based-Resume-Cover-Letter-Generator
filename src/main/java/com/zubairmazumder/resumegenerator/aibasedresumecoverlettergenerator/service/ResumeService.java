package com.zubairmazumder.resumegenerator.aibasedresumecoverlettergenerator.service;

import com.zubairmazumder.resumegenerator.aibasedresumecoverlettergenerator.dto.UserProfileDto;
import com.zubairmazumder.resumegenerator.aibasedresumecoverlettergenerator.model.UserProfile;
import com.zubairmazumder.resumegenerator.aibasedresumecoverlettergenerator.repository.UserProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
@RequiredArgsConstructor
public class ResumeService {

    private final UserProfileRepository userProfileRepository;

    //--------------------CRUD Operation---------------//

    /** Create Operation **/
    public UserProfileDto createUserProfile(UserProfileDto userProfileDto){
        if(userProfileRepository.exitByEmail(userProfileDto.getEmail())){
            throw new RuntimeException(("User with this email already exits"))
        }

        UserProfile savedUserProfile = userProfileRepository.save(toEntity(userProfileDto));
        return toUs
    }

    public UserProfileDto createUserProfile(UserProfileDto dto) {
        if (userProfileRepository.existsByEmail(dto.getEmail())) {
            throw new RuntimeException("User with this email already exists.");
        }

        UserProfile entity = toEntity(dto);                     // Map DTO → Entity
        UserProfile saved = userProfileRepository.save(entity); // Save to DB
        return toDto(saved);                                    // Map Entity → DTO
    }


    private UserProfile toEntity(UserProfileDto dto) {
        UserProfile entity = new UserProfile();
        entity.setFullName(dto.getFullName());
        entity.setEmail(dto.getEmail());
        entity.setPhone(dto.getPhone());
        entity.setJobTitle(dto.getJobTitle());
        entity.setSummary(dto.getSummary());
        entity.setSkills(dto.getSkills());
        entity.setExperience(dto.getExperience());
        entity.setEducation(dto.getEducation());
        return entity;
    }

    private UserProfileDto toDto(UserProfile entity) {
        UserProfileDto dto = new UserProfileDto();
        dto.setId(null); // or set if you use ID field
        dto.setFullName(entity.getFullName());
        dto.setEmail(entity.getEmail());
        dto.setPhone(entity.getPhone());
        dto.setJobTitle(entity.getJobTitle());
        dto.setSummary(entity.getSummary());
        dto.setSkills(entity.getSkills());
        dto.setExperience(entity.getExperience());
        dto.setEducation(entity.getEducation());
        return dto;
    }



}

