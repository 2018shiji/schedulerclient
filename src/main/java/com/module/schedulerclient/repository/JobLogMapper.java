package com.module.schedulerclient.repository;

import com.module.schedulerclient.model.bo.JobLogBO;
import com.module.schedulerclient.model.po.JobLog;
import com.module.schedulerclient.model.query.JobLogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface JobLogMapper extends PagingAndSortingRepository<JobLog, Integer> {
    Page<JobLogBO> selectJobLogPage(Pageable pageable);
    List<JobLogBO> selectJobLog(JobLogQuery jobLogQuery);
    void insertSelective(JobLog jobLog);
}
