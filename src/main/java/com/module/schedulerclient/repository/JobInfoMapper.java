package com.module.schedulerclient.repository;

import com.module.schedulerclient.model.bo.JobInfoBO;
import com.module.schedulerclient.model.po.JobInfo;
import com.module.schedulerclient.model.query.JobInfoQuery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobInfoMapper extends JpaRepository<JobInfo, Integer> {
    int selectCount(JobInfo jobInfo);
    List<JobInfoBO> selectJobInfo(JobInfoQuery jobInfoQuery);
    JobInfo selectByPrimaryKey(Integer jobInfoId);

    void insertSelective(JobInfo jobInfo);
    void updateByPrimaryKeySelective(JobInfo jobInfo);
}
