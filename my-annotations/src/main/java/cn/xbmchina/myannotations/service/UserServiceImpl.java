package cn.xbmchina.myannotations.service;

import cn.xbmchina.myannotations.annotation.OperationLogDetail;
import cn.xbmchina.myannotations.enums.OperationType;
import cn.xbmchina.myannotations.enums.OperationUnit;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @OperationLogDetail(detail = "通过手机号[{{tel}}]获取用户名",level = 3,operationUnit = OperationUnit.USER,operationType = OperationType.SELECT)
    @Override
    public String findUserName(String tel) {
        System.out.println("tel:" + tel);
        return "zhangsan";
    }
}