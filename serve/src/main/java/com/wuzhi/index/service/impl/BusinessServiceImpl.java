package com.wuzhi.index.service.impl;

import com.wuzhi.index.bean.*;
import com.wuzhi.index.mapper.BusinessMapper;
import com.wuzhi.index.mapper.UserMapper;
import com.wuzhi.index.service.BusinessService;
import com.wuzhi.index.websocket.WebSocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.*;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private BusinessMapper businessMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private WebSocketService webSocketService;

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
        if(count > 0) userMapper.updateUsernameById(params.get("user_id"), params.get("name"));
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

    @Override
    public Boolean pushMsg(Map<String, String> params) {
        String ids = params.get("userids");
        List<String> idArr = Arrays.asList(ids.split(","));
        String push_type = params.get("push_type");
        String push_name = params.get("push_name");
        String touserid = params.get("touserid");
        ArrayList<Map> arrayList = new ArrayList<>();
        if ("0".equals(push_type)) { //企业推至人才
            for (int i = 0; i < idArr.size(); i++) {
                Map<String, String> map = new HashMap<>();
                map.put("rcuser_id", idArr.get(i));
                map.put("qyuser_id", touserid);
                map.put("push_type", push_type);
                map.put("push_name", push_name);
                arrayList.add(map);
            }
        } else if ("1".equals(push_type)) { //人才推至企业
            for (int i = 0; i < idArr.size(); i++) {
                Map<String, String> map = new HashMap<>();
                map.put("rcuser_id", touserid);
                map.put("qyuser_id", idArr.get(i));
                map.put("push_type", push_type);
                map.put("push_name", push_name);
                arrayList.add(map);
            }
        }
        Boolean tag = businessMapper.pushMsg(arrayList) == idArr.size();
        if (tag) webSocketService.sendMessage(touserid, idArr);
        return tag;
    }

    @Override
    public List<Company> getInnerMsg(String id) {
        return businessMapper.getInnerMsg(id);
    }

    @Override
    public List<Resume> getInnerMsg2(String id) {
        return businessMapper.getInnerMsg2(id);
    }

    @Override
    public List<PushMsg> getPushMsg(Map<String, String> params) {
        return businessMapper.getPushMsg(params);
    }
}
