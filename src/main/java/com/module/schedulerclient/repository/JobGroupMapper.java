package com.module.schedulerclient.repository;

import com.module.schedulerclient.model.po.JobGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobGroupMapper extends JpaRepository<JobGroup, Integer> {
    int selectCount(JobGroup jobGroup);
    void insertSelective(JobGroup jobGroup);
}
