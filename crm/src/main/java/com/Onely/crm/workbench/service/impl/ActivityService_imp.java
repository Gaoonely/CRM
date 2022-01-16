package com.Onely.crm.workbench.service.impl;

import com.Onely.crm.setting.domain.User;
import com.Onely.crm.utils.DateTimeUtil;
import com.Onely.crm.utils.SqlSessionUtil;
import com.Onely.crm.utils.UUIDUtil;
import com.Onely.crm.workbench.dao.Activitydao;
import com.Onely.crm.workbench.domain.Activity;
import com.Onely.crm.workbench.service.ActivityService;

import java.util.List;

public class ActivityService_imp implements ActivityService {
    private static Activitydao activitydao;

    @Override
    public List<User> getUserList() {
        activitydao = SqlSessionUtil.getSqlSession().getMapper(Activitydao.class);
        List<User> list = activitydao.getUserList();
        return list;
    }

    @Override
    public int creatActivity(String owner, String name, String startDate, String endDate, String cost, String description, String createby) {
        Activity activity = new Activity();
        activity.setId(UUIDUtil.getUUID());
        activity.setOwner(owner);
        activity.setName(name);
        activity.setStartDate(startDate);
        activity.setEndDate(endDate);
        activity.setCost(cost);
        activity.setDescription(description);
        activity.setCreateTime(DateTimeUtil.getSysTime());
        activity.setCreateBy (createby);
        activitydao = SqlSessionUtil.getSqlSession().getMapper(Activitydao.class);
        int count = activitydao.creatActivity(activity);
        return count;
    }
}
