package com.wuzhi.index.controller;

import com.wuzhi.index.bean.*;
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

    /**
     * 获取所有公司列表
     *
     * @return
     */
    @RequestMapping("/getCompanies")
    public List<Company> getCompanies() {
        return businessService.getCompanies();
    }

    /**
     * 获取所有职位列表
     *
     * @param params
     * @return
     */
    @RequestMapping("/getJobs")
    public List<Job> getJobs(@RequestBody Map<String, String> params) {
        return businessService.getJobs(params);
    }

    /**
     * 获取所有简历列表
     *
     * @param params
     * @return
     */
    @RequestMapping("/getPersonals")
    public List<Resume> getPersonals(@RequestBody Map<String, String> params) {
        return businessService.getPersonals(params);
    }

    /**
     * 依据职位ID查询该职位信息
     *
     * @param id
     * @return
     */
    @RequestMapping("/getJobById")
    public Job getJobById(String id) {
        return businessService.getJobById(id);
    }

    /**
     * 依据职位ID删除该职位信息
     *
     * @param id
     * @return
     */
    @RequestMapping("/deleteJobById")
    public Boolean deleteJobById(String id) {
        return businessService.deleteJobById(id);
    }

    /**
     * 根据公司ID获取职位列表
     *
     * @param id
     * @return
     */
    @RequestMapping("/getJobByCompanyId")
    public List<Job> getJobByCompanyId(String id) {
        return businessService.getJobByCompanyId(id);
    }

    /**
     * 根据公司ID获取公司信息
     *
     * @param id
     * @return
     */
    @RequestMapping("/getCompanyById")
    public Company getCompanyById(String id) {
        return businessService.getCompanyById(id);
    }

    /**
     * 根据用户ID获取简历
     *
     * @param id
     * @return
     */
    @RequestMapping("/getResumeById")
    public Resume getResumeById(String id) {
        return businessService.getResumeById(id);
    }

    /**
     * 更新简历信息
     *
     * @param params
     * @return
     */
    @RequestMapping("/updateResume")
    public Boolean updateResume(@RequestBody Map<String, String> params) {
        return businessService.updateResume(params);
    }

    /**
     * 更新公司信息
     *
     * @param params
     * @return
     */
    @RequestMapping("/updateCompany")
    public Boolean updateCompany(@RequestBody Map<String, String> params) {
        return businessService.updateCompany(params);
    }

    /**
     * 更新职位信息
     *
     * @param params
     * @return
     */
    @RequestMapping("/updateJob")
    public Boolean updateJob(@RequestBody Map<String, String> params) {
        return businessService.updateJob(params);
    }

    /**
     * 发送简历
     *
     * @param params
     * @return
     */
    @RequestMapping("/sendResume")
    public Boolean sendResume(@RequestBody Map<String, String> params) {
        return businessService.sendResume(params);
    }

    /**
     * 投递进展列表
     *
     * @param status
     * @return
     */
    @RequestMapping("/getResumeSend")
    public List<ResumeSend> getResumeSend(String user_id, String status, String company_id) {
        return businessService.getResumeSend(user_id, status, company_id);
    }

    @RequestMapping("/updateResumeSendStatus")
    public Boolean updateResumeSendStatus(String id, String status) {
        return businessService.updateResumeSendStatus(id, status);
    }

    @RequestMapping("/updateJobIsuse")
    public Boolean updateJobIsuse(String id, String is_use) {
        return businessService.updateJobIsuse(id, is_use);
    }

    @RequestMapping("/getAllNews")
    public List<New> getAllNews(@RequestBody Map<String, String> params) {
        return businessService.getAllNews(params);
    }

    @RequestMapping("/addNewTag")
    public Boolean addNewTag(@RequestBody Map<String, String> params) {
        return businessService.addNewTag(params);
    }
}
