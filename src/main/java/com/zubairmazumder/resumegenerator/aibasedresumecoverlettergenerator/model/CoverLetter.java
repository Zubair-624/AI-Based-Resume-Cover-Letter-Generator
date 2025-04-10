package com.zubairmazumder.resumegenerator.aibasedresumecoverlettergenerator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoverLetter {

    private String recipientName;

    private String recipientCompany;

    private String body;

    private String closing;
}
