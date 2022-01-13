package com.Onely.crm.setting.service.impl;

import com.Onely.crm.setting.dao.Userdao;
import com.Onely.crm.setting.service.UserService;
import com.Onely.crm.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UserService_imp implements UserService {
    private Userdao userdao = SqlSessionUtil.getSqlSession().getMapper(Userdao.class);
}
