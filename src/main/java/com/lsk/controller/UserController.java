package com.lsk.controller;

import com.lsk.domain.ProjectDetail;
import com.lsk.domain.Projects;
import com.lsk.domain.User;
import com.lsk.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
public class UserController {

    @Autowired
    private IuserService userService;

    @RequestMapping("/login")
    public int UserLogin(String username,String password){
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        System.out.println(username);
        if (userService.login(user)!=null){
           int id= userService.selectUid(username);
            System.out.println(id);
           return id;
        }else {
            return -1;
        }
    }

    @RequestMapping("/projects")
    public List<Projects> selectProjectByType(String type){
        System.out.println(type);
        return userService.selectAllProjects(type);
    }

    @RequestMapping("/selectByUid")
    public List<Projects> selectProjectsByUid(int uid){
        List<Projects> list=userService.selectProjectsSbyUid(uid);
        System.out.println(list);
        return list;
    }

    @RequestMapping("detail")
    public List<ProjectDetail> selectDetail(int id){
        List<ProjectDetail> list=userService.selectProjectDetail(id);
        return list;
    }

    @RequestMapping("/add")
    public String addSpeed(int pid,String description,float percentage){
        if(description!=null ) {
            ProjectDetail p = new ProjectDetail();
            p.setPid(pid);
            p.setPDescription(description);
            p.setPSpeed(percentage);

            userService.addSpeed(p);

            userService.updateSpeed(percentage,pid);
            return "success";
        }else {
            return null;
        }
    }

    @RequestMapping("/addProject")
    public String addProject(int uid,String projectName,
                             String projectType,String projectCharger,
                             String projectLevel){
        float speed=0;
        Projects p1=new Projects();
        p1.setUid(uid);
        p1.setProjectName(projectName);
        p1.setProjectCharger(projectCharger);
        p1.setProjectLevel(projectLevel);
        p1.setProjectType(projectType);
        p1.setProjectSpeed(speed);
        userService.addProject(p1);
        return "success";
    }
}
