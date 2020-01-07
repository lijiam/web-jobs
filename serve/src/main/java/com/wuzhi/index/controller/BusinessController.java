package com.wuzhi.index.controller;

import com.wuzhi.index.bean.Company;
import com.wuzhi.index.bean.Job;
import com.wuzhi.index.bean.Personal;
import com.wuzhi.index.bean.Resume;
import com.wuzhi.index.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class BusinessController {

    @Autowired
    BusinessService businessService;

    @RequestMapping("/getCompanies")
    public List<Company> getCompanies() {
        return businessService.getCompanies();
    }

    @RequestMapping("/getJobs")
    public List<Job> getJobs(@RequestBody Map<String, String> params) {
        return businessService.getJobs(params);
    }

    @RequestMapping("/getPersonals")
    public List<Resume> getPersonals(@RequestBody Map<String, String> params) {
        return businessService.getPersonals(params);
    }

    @RequestMapping("/getJobById")
    public Job getJobById(String id) {
        return businessService.getJobById(id);
    }

    @RequestMapping("/deleteJobById")
    public Boolean deleteJobById(String id) {
        return businessService.deleteJobById(id);
    }

    @RequestMapping("/getJobByCompanyId")
    public List<Job> getJobByCompanyId(String id) {
        return businessService.getJobByCompanyId(id);
    }

    @RequestMapping("/getCompanyById")
    public Company getCompanyById(String id) {
        return businessService.getCompanyById(id);
    }

    @RequestMapping("/getResumeById")
    public Resume getResumeById(String id) {
        return businessService.getResumeById(id);
    }

    @RequestMapping("/updateResume")
    public Boolean updateResume(@RequestBody Map<String, String> params) {
        return businessService.updateResume(params);
    }

    @RequestMapping("/updateCompany")
    public Boolean updateCompany(@RequestBody Map<String, String> params) {
        return businessService.updateCompany(params);
    }

    @RequestMapping("/updateJob")
    public Boolean updateJob(@RequestBody Map<String, String> params) {
        return businessService.updateJob(params);
    }
}
