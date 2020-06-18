package cn.bynow.tempest.web.modular.system.controller;

import cn.bynow.tempest.web.base.controller.BaseController;
import cn.bynow.tempest.web.modular.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Bynow
 * @version 1.0
 * @date 2020/6/16 23:13
 */
@Controller
public class LoginController extends BaseController {

    @Autowired
    private UserService userService;
    /**
     * 跳转到主页
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("name", userService.getInfo( 1).getName());
        return "/index.html";
    }
}
