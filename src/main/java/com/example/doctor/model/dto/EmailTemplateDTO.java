package com.example.doctor.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class EmailTemplateDTO {

    // email template
    private String[] to;
    private String[] cc;
    private String[] bcc;
    private String subject;
    private String content;
    private Map<String, Object> properties;

}
