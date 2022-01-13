package com.Onely.crm.setting.service.impl;

import com.Onely.crm.excepton.LoginException;
import com.Onely.crm.setting.dao.Userdao;
import com.Onely.crm.setting.domain.User;
import com.Onely.crm.setting.service.UserService;
import com.Onely.crm.utils.DateTimeUtil;
import com.Onely.crm.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.xml.crypto.Data;
import java.util.HashMap;
import java.util.Map;

public class UserService_imp implements UserService {
    private static Userdao userdao = SqlSessionUtil.getSqlSession().getMapper(Userdao.class);

    @Override
    public User login(String loginAct, String loginPwd, String ip) throws LoginException {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("loginAct",loginAct);
        map.put("loginPwd",loginPwd);
        User u = userdao.login(map);
        if(u==null){
            LoginException loginException = new LoginException("登录失败，用户密码错误！");
            throw loginException;
        }
        String expireTime = u.getExpireTime();
        String now = DateTimeUtil.getSysTime();
        int i =now.compareTo(expireTime);
        if (i>0){
            LoginException loginException = new LoginException("账号已失效！");
            throw loginException;
        }
        String allowIps = u.getAllowIps();
        if(!allowIps.contains(ip)){
            LoginException loginException = new LoginException("请用公司网络登录！");
            throw loginException;
        }
        return u;
    }
}
