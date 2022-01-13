package com.Onely.crm.setting.dao;

import com.Onely.crm.setting.domain.User;

import java.util.Map;

public interface Userdao {

    User login(Map<String, Object> map);
}
