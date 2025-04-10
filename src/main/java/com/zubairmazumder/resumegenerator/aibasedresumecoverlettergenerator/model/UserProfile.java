package com.zubairmazumder.resumegenerator.aibasedresumecoverlettergenerator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserProfile {

    private String fullName;

    private String email;

    private String phone;

    private String jobTitle;

    private String summary;

    private String skills;

    private String experience;

    private String education;

}
