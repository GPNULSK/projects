package com.lsk.service;

import com.lsk.domain.ProjectDetail;
import com.lsk.domain.Projects;
import com.lsk.domain.User;

import java.util.List;

public interface IuserService {

    User login(User user);

    List<Projects> selectAllProjects(String type);

    List<Projects> selectProjectsSbyUid(int uid);

    int selectUid(String username);

    List<ProjectDetail> selectProjectDetail(int id);

    void addSpeed(ProjectDetail projectDetail);

    void updateSpeed(float projectSpeed,float pid);

    void addProject(Projects projects);
}
