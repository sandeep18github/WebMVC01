package com.ssk.welcomecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WishController {

    @GetMapping("/wish")
    @ResponseBody
    public String getWishMsg() {

        String msg = "Welcome to DAAKU_MAHARAJ Movie njoy the movie jaffa";

        return msg;

    }
}
