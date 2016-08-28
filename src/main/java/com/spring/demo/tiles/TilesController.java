package com.spring.demo.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ehsy_it on 2016/8/10.
 */
@Controller
public class TilesController {

    @RequestMapping("/body1")
    public String index(Model model) {
        return "body1.page";
    }

    @RequestMapping("/body2")
    public String home(Model model) {
        return "body2.page";
    }

}
