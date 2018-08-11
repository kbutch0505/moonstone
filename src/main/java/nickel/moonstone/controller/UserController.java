package nickel.moonstone.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import nickel.moonstone.domain.service.QiitaService;

@Controller
public class UserController {

    @Autowired
    QiitaService qiitaservice;    

    @RequestMapping("/user")
    public String user(Model model, @RequestParam("user") String user) {
        model.addAttribute("user", qiitaservice.getUser(user));
        return "user";
    }

}