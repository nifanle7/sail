package com.uncoverman.sail.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by NFL on 2019/4/12.
 */
@Controller
@RequestMapping("admin")
public class IndexController {
    @RequestMapping("")
    public String index() {
        return "admin/index";
    }

}
