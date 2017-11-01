package com.autumnframework.cms.controller.system;

import com.autumnframework.cms.model.po.LoginInfo;
import com.autumnframework.cms.service.impl.LogManageImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 20:09 2017/10/31.
 */
@Controller
@RequestMapping(value = "/log")
public class LogManageController {
    @Autowired
    private LogManageImpl logManage;
    @RequestMapping(value = "/allLoginLog")
    @ResponseBody
    public List<LoginInfo> getAllLoginInfo(int page, int limit){
        return logManage.selectAllLoginInfo(page, limit);
    }

    @RequestMapping(value = "/userLoginLog")
    @ResponseBody
    public List<LoginInfo> getAllLoginInfo(String username, int page, int limit){
        return logManage.selectLoginInfoByUserName(username, page, limit);
    }

}
