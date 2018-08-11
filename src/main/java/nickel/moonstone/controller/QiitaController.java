package nickel.moonstone.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import nickel.moonstone.domain.service.QiitaService;

@Controller
public class QiitaController {

    @Autowired
    QiitaService qiitaservice;    

    @RequestMapping("/user")
    public String users(Model model) {
        model.addAttribute("users", qiitaservice.getUserList());
        return "user";
    }

    @RequestMapping("/item")
    public String item(Model model, @RequestParam("user") String user) {

        if(user == null || user.isEmpty()) {
            model.addAttribute("users", qiitaservice.getUserList());
            return "user";
        }

        model.addAttribute("items", qiitaservice.getItemList(user));
        return "item";
    }

}