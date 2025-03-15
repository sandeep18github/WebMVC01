package com.ssk.welcomecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public ModelAndView getWelcomeMsg() {

        ModelAndView mav = new ModelAndView();

        mav.addObject("msg", "Welcome to DAAKU_MAHA_RAJ  --Lion is Waiting for you.....");

        mav.setViewName("welcome");
        return mav;
    }
}
