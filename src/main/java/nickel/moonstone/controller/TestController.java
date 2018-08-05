package nickel.moonstone.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import nickel.moonstone.service.QiitaService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class TestController {

    @Autowired
    QiitaService qiitaservice;    

    @RequestMapping("/test")
    public String index(Model model) {

        System.out.println("★★★★★★★");
        List<QiitaService.RandomValue> list = qiitaservice.Service();
        System.out.println("★★★★★★★");
        // System.out.println(qiitaservice.Service());
        return "test";
    }
}