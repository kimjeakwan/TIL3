package spring4.spring4.controller;
import spring4.spring4.Spring4Application;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {

    @GetMapping("kimjaekwan")
    public String hello(Model model){
        model.addAttribute("data","kimjaekwan's github");
        return "redirect:https://github.com/kimjeakwan";
    }
    @GetMapping("kimjaekwan2")
    public String hello1(Model model){

        return "redirect:https://www.instagram.com";
    }













}
