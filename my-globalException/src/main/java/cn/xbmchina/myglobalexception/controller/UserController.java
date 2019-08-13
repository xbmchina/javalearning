package cn.xbmchina.myglobalexception.controller;

import cn.xbmchina.myglobalexception.common.Result;
import cn.xbmchina.myglobalexception.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 访问路径 http://localhost:8080/user/findUserNameByTel?tel=1234567
     * @param tel 手机号
     * @return userName
     */
    @ResponseBody
    @RequestMapping("/findUserNameByTel")
    public Result findUserNameByTel(@RequestParam("tel") String tel) throws Exception {
        return userService.findUserName(tel);
    }
}