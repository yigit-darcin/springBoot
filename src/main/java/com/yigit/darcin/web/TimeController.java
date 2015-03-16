package com.yigit.darcin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
public class TimeController {

    @RequestMapping("/time")
    public ModelAndView time() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        mav.addObject("someDate", new Date());
        mav.addObject("someText", "text");
        return mav;
    }
}
