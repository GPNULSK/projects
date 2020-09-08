package com.lsk.mapper;

import com.lsk.domain.Projects;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProjectsMapper {

    List<Projects> selectAllProjects(String projectType);

    void updateSpeed(float projectSpeed,float pid);

    void addProject(Projects projects);


}