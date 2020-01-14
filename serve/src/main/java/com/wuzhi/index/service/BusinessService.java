package com.wuzhi.index.service;

import com.wuzhi.index.bean.*;

import java.util.List;
import java.util.Map;

public interface BusinessService {

    List<Company> getCompanies();

    List<Job> getJobs(Map<String, String> params);

    List<Resume> getPersonals(Map<String, String> params);

    Job getJobById(String id);

    Boolean deleteJobById(String id);

    List<Job> getJobByCompanyId(String id);

    Company getCompanyById(String id);

    Resume getResumeById(String id);

    Boolean updateResume(Map<String, String> params);

    Boolean updateCompany(Map<String, String> params);

    Boolean updateJob(Map<String, String> params);

    Boolean sendResume(Map<String, String> params);

    List<ResumeSend> getResumeSend(String user_id, String status, String company_id);

    Boolean updateResumeSendStatus(String id, String status);

    Boolean updateJobIsuse(String id, String is_use);

    List<New> getAllNews(Map<String, String> params);

    Boolean addNewTag(Map<String, String> params);

    Boolean pushMsg(Map<String, String> params);

    List<Company> getInnerMsg(String id);

    List<Resume> getInnerMsg2(String id);

    List<PushMsg> getPushMsg(Map<String, String> params);
}
