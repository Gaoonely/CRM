package com.Onely.crm.workbench.service;

import com.Onely.crm.setting.domain.User;

import java.util.List;

public interface ActivityService {
    List<User> getUserList();

    int creatActivity(String owner, String name, String startDate, String endDate, String cost, String description, String createby);
}
