package com.Onely.crm.setting.web.controller;


import com.Onely.crm.setting.domain.User;
import com.Onely.crm.setting.service.UserService;
import com.Onely.crm.setting.service.impl.UserService_imp;
import com.Onely.crm.utils.MD5Util;
import com.Onely.crm.utils.PrintJson;
import com.Onely.crm.utils.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UserController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String servletPath = request.getServletPath();
        if ("/setting/User/login.do".equals(servletPath)){
            login(request,response);
        }else {

        }
    }



    private void login(HttpServletRequest request, HttpServletResponse response) {
        String loginAct = request.getParameter("loginAct");
        String loginPwd = MD5Util.getMD5(request.getParameter("loginPwd"));
        //获取发送请求用户的ip地址
        String ip = request.getRemoteAddr();
        //用UserService_imp的代理类为其添加事务机制
        try{
            UserService us = (UserService) ServiceFactory.getService(new UserService_imp());
            User rs = us.login(loginAct, loginPwd, ip);
            PrintJson.printJsonFlag(response,true);

        }catch (Exception e){
            e.printStackTrace();
            //System.out.println(e);
        }



    }
}
