package com.wuzhi.index.service.impl;

import com.wuzhi.index.bean.Company;
import com.wuzhi.index.bean.Job;
import com.wuzhi.index.bean.Personal;
import com.wuzhi.index.bean.Resume;
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
    public List<Personal> getPersonals(Map<String, String> params) {
        return businessMapper.getPersonals(params);
    }

    @Override
    public Job getJobById(String id) {
        return businessMapper.getJobById(id);
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
}
