package com.wuzhi.index.mapper;

import com.wuzhi.index.bean.Company;
import com.wuzhi.index.bean.Job;
import com.wuzhi.index.bean.Personal;
import com.wuzhi.index.bean.Resume;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface BusinessMapper {

    List<Company> getCompanies();

    List<Job> getJobs(Map<String, String> params);

    List<Personal> getPersonals(Map<String, String> params);

    Job getJobById(@Param("id") String id);

    Company getCompanyById(@Param("id") String id);

    Resume getResumeById(@Param("id") String id);

    int updateResume(Map<String, String> params);
}
