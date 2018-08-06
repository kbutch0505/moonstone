package nickel.moonstone.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import nickel.moonstone.domain.service.QiitaService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    QiitaService qiitaservice;    

    @RequestMapping("/user")
    public String index(Model model, @RequestParam("user") String user) {
        model.addAttribute("user", qiitaservice.getUser(user));
        return "user";
    }

    @RequestMapping("/users")
    public String index(Model model) {
        model.addAttribute("users", qiitaservice.getUserList());
        return "users";
    }

}