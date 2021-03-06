package com.example.LadalicoTest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "start...!";
    }

    @RequestMapping(value = "/hello1")
    public ModelAndView hello1() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("name", "hello~1");
        return mv;
    }

    @RequestMapping(value = "/hello2")
    public String hello2(Model model) {
        model.addAttribute("name", "hello~2");
        return "hello";
    }

    @RequestMapping(value = "/hellotest") // 주소창에 적을 내용?
    public ModelAndView hellotest() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hellotest"); // 띄워줄 jsp파일명
        return mv;
    }

    
}