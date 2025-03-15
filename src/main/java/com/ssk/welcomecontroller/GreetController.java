package com.ssk.welcomecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {

    @GetMapping("/greet")
    public String getGreetMsg(Model model){

        String stringTxt = "Greetings From Nandhamuri Balakrishna";


        model.addAttribute("msg",stringTxt);

        return "greet";
    }
}
