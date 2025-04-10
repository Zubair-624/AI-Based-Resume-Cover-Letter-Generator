package com.zubairmazumder.resumegenerator.aibasedresumecoverlettergenerator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TemplateData {

    private Map<String, String> placeholders;
}
