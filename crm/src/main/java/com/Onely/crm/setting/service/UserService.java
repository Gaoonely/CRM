package com.Onely.crm.setting.service;

import com.Onely.crm.excepton.LoginException;
import com.Onely.crm.setting.domain.User;

public interface UserService {
    User login(String loginAct, String loginPwd, String ip) throws LoginException;
}
