package cn.xbmchina.myglobalexception.service;

import cn.xbmchina.myglobalexception.common.Result;

public interface UserService {

    /**
     * 获取用户信息
     * @return
     * @param tel
     */
    Result findUserName(String tel) throws Exception;
}
