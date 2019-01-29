package com.von.spaction.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

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

    @RequestMapping(value = "spi", method = RequestMethod.GET)
    public String spi(@Valid Spittle spittle, Errors error) {
        if (error.hasErrors()) {
            List<FieldError> fieldErrors = error.getFieldErrors();
            FieldError item = fieldErrors.get(0);
            throw new MyException(item.getDefaultMessage());
        }
        System.out.println(spittle);
        return "home";
    }
}
