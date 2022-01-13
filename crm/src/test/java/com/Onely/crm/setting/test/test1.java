package com.Onely.crm.setting.test;

import com.Onely.crm.excepton.LoginException;
import com.Onely.crm.utils.DateTimeUtil;
import com.Onely.crm.utils.MD5Util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test1 {
    public static void main(String[] args) {
        String T = "2020-12-12 00:00:00";
//        Date D = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String t = simpleDateFormat.format(D);
        String t = DateTimeUtil.getSysTime();
        int i = t.compareTo(T);
        if(i>0){
            System.out.println("账号超过有效期限");
        }
        String p = "134";
        String pm = MD5Util.getMD5(p);
        String p2 = "134";
        String pm2 = MD5Util.getMD5(p2);
        System.out.println(pm+"="+pm2+":"+pm.equals(pm2));

    }
}
