package com.zubairmazumder.resumegenerator.aibasedresumecoverlettergenerator.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoverLetterDto {

    private String recipientName;

    private String recipientCompany;

    private String body;

    private String closing;
}
