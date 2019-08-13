package cn.xbmchina.myglobalexception.service;

import cn.xbmchina.myglobalexception.common.Result;
import cn.xbmchina.myglobalexception.enums.ResultEnum;
import cn.xbmchina.myglobalexception.exception.CommonException;
import cn.xbmchina.myglobalexception.utils.ResultUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public Result findUserName(String tel) throws Exception{
        if (StringUtils.isEmpty(tel)) {
            throw new CommonException(ResultEnum.NOT_NULL.getCode(),ResultEnum.NOT_NULL.getMsg());
        }
        if (tel.length() != 11) {
            throw new CommonException(ResultEnum.PARAMS_INVALID.getCode(),ResultEnum.PARAMS_INVALID.getMsg());
        }
        System.out.println("tel:" + tel);
        return ResultUtil.success(tel);
    }
}