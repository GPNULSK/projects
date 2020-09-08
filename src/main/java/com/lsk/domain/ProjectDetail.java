package com.lsk.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * t_project_detail
 * @author 
 */
@Data
public class ProjectDetail implements Serializable {
    private Integer pid;

    private String pDescription;

    private Float pSpeed;

    private Integer id;

    private static final long serialVersionUID = 1L;
}