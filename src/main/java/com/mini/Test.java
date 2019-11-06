package com.mini;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/test")
public class Test {

    @RequestMapping("/testView")
    public String testView(ModelMap map, HttpServletRequest request){
        map.put("name","我是后台传过来的值：小程序InternalViewResource模板");
        request.setAttribute("msg","哈哈哈InternalViewResource模板");
        return "InternalViewResource";
    }

    @RequestMapping("/testFreeMark")
    public String testFreeMark(ModelMap map){
        map.put("name","我是后台传过来的值：小程序FreeMark模板");
        return "TestFreeMark";
    }

    //@RequestMapping(value = "/test",produces = "text/html;charset=utf-8")
    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(String id){
        System.out.println(id);
        return "hello"+id;
    }
}
