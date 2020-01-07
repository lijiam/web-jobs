package com.wuzhi.index.service;

import com.wuzhi.index.bean.Company;
import com.wuzhi.index.bean.Job;
import com.wuzhi.index.bean.Resume;

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
}
