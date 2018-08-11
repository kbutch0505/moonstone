package nickel.moonstone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import nickel.moonstone.domain.service.QiitaService;

@Controller
public class LoginController {

    @Autowired
    QiitaService qiitaservice;

    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("hello", "Hello World !");
        return "login";
    }

    @RequestMapping("/home")
    public String users(Model model) {
        model.addAttribute("users", qiitaservice.getUserList());
        return "user";
    }
}
