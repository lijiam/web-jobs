package com.wuzhi.index.service.impl;

import com.wuzhi.index.bean.*;
import com.wuzhi.index.mapper.BusinessMapper;
import com.wuzhi.index.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private BusinessMapper businessMapper;

    @Override
    public List<Company> getCompanies() {
        return businessMapper.getCompanies();
    }

    @Override
    public List<Job> getJobs(Map<String, String> params) {
        return businessMapper.getJobs(params);
    }

    @Override
    public List<Resume> getPersonals(Map<String, String> params) {
        return businessMapper.getPersonals(params);
    }

    @Override
    public Job getJobById(String id) {
        return businessMapper.getJobById(id);
    }

    @Override
    public Boolean deleteJobById(String id) {
        return businessMapper.deleteJobById(id) > 0;
    }

    @Override
    public List<Job> getJobByCompanyId(String id) {
        return businessMapper.getJobByCompanyId(id);
    }

    @Override
    public Company getCompanyById(String id) {
        return businessMapper.getCompanyById(id);
    }

    @Override
    public Resume getResumeById(String id) {
        return businessMapper.getResumeById(id);
    }

    @Override
    public Boolean updateResume(Map<String, String> params) {
        int count = businessMapper.updateResume(params);
        return count > 0;
    }

    @Override
    public Boolean updateCompany(Map<String, String> params) {
        int count = businessMapper.updateCompany(params);
        return count > 0;
    }

    @Override
    public Boolean updateJob(Map<String, String> params) {
        int count = businessMapper.updateJob(params);
        return count > 0;
    }

    @Override
    public Boolean sendResume(Map<String, String> params) {
        int count = businessMapper.sendResume(params);
        return count > 0;
    }

    @Override
    public List<ResumeSend> getResumeSend(String user_id, String status, String company_id) {
        return businessMapper.getResumeSend(user_id, status, company_id);
    }

    @Override
    public Boolean updateResumeSendStatus(String id, String status) {
        int count = businessMapper.updateResumeSendStatus(id, status);
        return count > 0;
    }

    @Override
    public Boolean updateJobIsuse(String id, String is_use) {
        return businessMapper.updateJobIsuse(id, is_use) > 0;
    }

    @Override
    public List<New> getAllNews(Map<String, String> params) {
        return businessMapper.getAllNews(params);
    }

    @Override
    public Boolean addNewTag(Map<String, String> params) {
        return businessMapper.addNewTag(params);
    }
}
