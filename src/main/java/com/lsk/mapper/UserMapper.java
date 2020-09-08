package com.lsk.mapper;

import com.lsk.domain.Projects;
import com.lsk.domain.User;

import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper {
    User login(User user);

    List<Projects> selectProjectsSbyUid(int uid);

    int selectUid(String username);


}