package com.zubairmazumder.resumegenerator.aibasedresumecoverlettergenerator.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserProfileDto {

    private String fullName;

    private String email;

    private String phone;

    private String jobTitle;

    private String summary;

    private String skills;

    private String experience;

    private String education;


}
