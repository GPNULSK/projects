package com.lsk.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data

public class Projects {
    private Integer id;

    private Integer uid;

    private String projectName;

    private String projectType;

    private String projectCharger;

    private String projectLevel;

    private Float projectSpeed;


}