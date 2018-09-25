package test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("/mvc")
public class HelloWorldController {

    @RequestMapping(value = "/hello" ,method = RequestMethod.GET )
    @ResponseBody
    public String hello(String name) throws UnsupportedEncodingException {
        System.out.println(name);
        return "hello:"+new String(name.getBytes("ISO-8859-1"),"UTF-8");
    }
}
