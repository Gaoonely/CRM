package com.Onely.crm.workbench.dao;

import com.Onely.crm.setting.domain.User;
import com.Onely.crm.workbench.domain.Activity;

import java.util.List;

public interface Activitydao {
    List<User> getUserList();

    int creatActivity(Activity activity);
}
