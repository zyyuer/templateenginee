package cn.tangue.templateenginee.controller;

import cn.tangue.templateenginee.exception.AjaxResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/test")
public class ListenerTestController {
    @GetMapping("/listener")
    public AjaxResponse hello(HttpServletRequest request, HttpSession session) {
        //操作attribute
        request.setAttribute("a", "a");
        request.setAttribute("a", "b");
        request.getAttribute("a");
        request.removeAttribute("a");

        //session
        session.setAttribute("a", "a");
        session.getAttribute("a");
        session.invalidate(); //s手动销毁session一般不需要手动
        return AjaxResponse.success("test listener");

    }
}
