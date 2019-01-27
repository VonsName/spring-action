package com.von.spaction.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/1/27 19:17
 */
@Controller
@RequestMapping(value = {"/", "homePage"})
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "home";
    }
}
