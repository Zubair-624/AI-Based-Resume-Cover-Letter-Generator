package com.zubairmazumder.resumegenerator.aibasedresumecoverlettergenerator.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResumeDto {

    private String header;

    private String contactInfo;

    private String summary;

    private String skills;

    private String experience;

    private String education;

    private String footer;
}
