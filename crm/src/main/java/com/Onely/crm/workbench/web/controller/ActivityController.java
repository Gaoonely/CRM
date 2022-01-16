package com.Onely.crm.workbench.web.controller;

import com.Onely.crm.setting.domain.User;
import com.Onely.crm.utils.PrintJson;
import com.Onely.crm.utils.ServiceFactory;
import com.Onely.crm.workbench.domain.Activity;
import com.Onely.crm.workbench.service.ActivityService;
import com.Onely.crm.workbench.service.impl.ActivityService_imp;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ActivityController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String servletPath = req.getServletPath();
        if (servletPath.equals("/workbench/Activity/getUerList.do")){
            getUserList(req, resp);
        }
        if(servletPath.equals("/workbench/Activity/creatActivity.do")){
            creatActivity(req,resp);
        }


    }

    private void creatActivity(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String owner = req.getParameter("owner");
        String name = req.getParameter("name");
        String startDate = req.getParameter("startDate");
        String endDate = req.getParameter("endDate");
        String cost = req.getParameter("cost");
        String description = req.getParameter("description");
        String createtime;
        User user = (User)req.getSession().getAttribute("user");
        String createby = user.getCreateBy();
        ActivityService activityService = (ActivityService) ServiceFactory.getService(new ActivityService_imp());
        int i = activityService.creatActivity(owner, name, startDate, endDate, cost, description, createby);
        if (i==1){
            PrintJson.printJsonFlag(resp,true);
        }else {
            PrintJson.printJsonFlag(resp,false);
        }
    }

    private void getUserList(HttpServletRequest request, HttpServletResponse response) {
        List<User> list = null;
        try{
            ActivityService activityService = (ActivityService) ServiceFactory.getService(new ActivityService_imp());
            list = activityService.getUserList();
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(list);
            response.getWriter().print(json);
        }catch(Exception e){
           e.printStackTrace();
        }
    }
}
