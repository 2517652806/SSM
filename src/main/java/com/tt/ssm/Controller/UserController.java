package com.tt.ssm.Controller;

import com.tt.ssm.Service.impl.UserServiceimpl;
import com.tt.ssm.pojo.Response;
import com.tt.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    public UserServiceimpl userService;
    @GetMapping("/get_user")
    @ResponseBody
    public Response get_user() {
        User user = userService.get_user();
        return new Response("成功",user,"200");
    }
}
