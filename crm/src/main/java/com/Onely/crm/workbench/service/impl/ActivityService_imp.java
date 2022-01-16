package com.Onely.crm.workbench.service.impl;

import com.Onely.crm.setting.dao.Userdao;
import com.Onely.crm.setting.domain.User;
import com.Onely.crm.utils.SqlSessionUtil;
import com.Onely.crm.workbench.dao.Activitydao;
import com.Onely.crm.workbench.service.ActivityService;

import java.util.List;

public class ActivityService_imp implements ActivityService {
    private static Activitydao activitydao = SqlSessionUtil.getSqlSession().getMapper(Activitydao.class);

    @Override
    public List<User> getUserList() {
        List<User> list = activitydao.getUserList();
        return list;
    }
}
