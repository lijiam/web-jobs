package com.wuzhi.index.mapper;

import com.wuzhi.index.bean.Company;
import com.wuzhi.index.bean.Job;
import com.wuzhi.index.bean.Resume;
import com.wuzhi.index.bean.ResumeSend;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface BusinessMapper {

    List<Company> getCompanies();

    List<Job> getJobs(Map<String, String> params);

    List<Resume> getPersonals(Map<String, String> params);

    Job getJobById(@Param("id") String id);

    int deleteJobById(@Param("id") String id);

    List<Job> getJobByCompanyId(@Param("id") String id);

    Company getCompanyById(@Param("id") String id);

    Resume getResumeById(@Param("id") String id);

    int updateResume(Map<String, String> params);

    int updateCompany(Map<String, String> params);

    int updateJob(Map<String, String> params);

    int sendResume(Map<String, String> params);

    List<ResumeSend> getResumeSend(@Param("user_id") String user_id, @Param("status") String status, @Param("company_id") String company_id);

    int updateResumeSendStatus(@Param("id") String id, @Param("status") String status);
}
