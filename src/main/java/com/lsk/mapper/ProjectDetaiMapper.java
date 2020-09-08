package com.lsk.mapper;

import com.lsk.domain.ProjectDetail;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectDetaiMapper {

    List<ProjectDetail> selectProjectDetail(int id);

    void addSpeed(ProjectDetail projectDetail);
}