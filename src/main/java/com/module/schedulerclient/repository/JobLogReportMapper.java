package com.module.schedulerclient.repository;

import com.module.schedulerclient.model.po.JobLogReport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobLogReportMapper extends JpaRepository<JobLogReport, Integer> {
    void increaseRunningCount(int reportId);
    void increaseSuccessCount(int reportId);
    void increaseFailCount(int reportId);

    JobLogReport selectOne(JobLogReport jobLogReport);
    List<JobLogReport> selectByExample(JobLogReport jobLogReport);
    void insertSelective(JobLogReport jobLogReport);
}
