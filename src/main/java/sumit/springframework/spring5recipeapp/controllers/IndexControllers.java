package sumit.springframework.spring5recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControllers {

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        return "index";
    }
}
