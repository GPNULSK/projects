package com.lsk.service.impl;

import com.lsk.domain.ProjectDetail;
import com.lsk.domain.Projects;
import com.lsk.domain.User;
import com.lsk.mapper.ProjectDetaiMapper;
import com.lsk.mapper.ProjectsMapper;
import com.lsk.mapper.UserMapper;
import com.lsk.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IuserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ProjectsMapper projectsMapper;

    @Autowired
    private ProjectDetaiMapper projectDetailMapper;

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

    @Override
    public List<Projects> selectAllProjects(String type) {
        return projectsMapper.selectAllProjects(type);
    }

    @Override
    public List<Projects> selectProjectsSbyUid(int uid) {
        return userMapper.selectProjectsSbyUid(uid);
    }

    @Override
    public int selectUid(String username) {
        return userMapper.selectUid(username);
    }

    @Override
    public List<ProjectDetail> selectProjectDetail(int id) {
        return projectDetailMapper.selectProjectDetail(id);
    }

    @Override
    public void addSpeed(ProjectDetail projectDetail) {
        projectDetailMapper.addSpeed(projectDetail);
    }

    @Override
    public void updateSpeed(float projectSpeed, float pid) {
        projectsMapper.updateSpeed(projectSpeed,pid);
    }

    @Override
    public void addProject(Projects projects) {
        projectsMapper.addProject(projects);
    }
}
