package vip.epss.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import vip.epss.domain.Admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //
        boolean flag = true;
        System.out.println("LoginInterceptor running............");
        //开启登录验证
        //1 首先应该获取当前请求的地址
//        String uri = request.getRequestURI();
//        //2 何种情况需要放行 [访问登录的handler，已经登录的用户也需要放行]
//        if(uri.indexOf("/adminar/login") >= 0 || uri.indexOf("/checkCode") >= 0){
//            flag = true;//如果访问的是登录的handler，则放行 ,  验证码也需要放行
//        }
//        //对session处理
//        HttpSession session = request.getSession();
//        Boolean loginStatus = (Boolean)session.getAttribute("loginStatus");
//        Admin admin = (Admin) session.getAttribute("ADMIN_SESSION");
//        if(loginStatus && admin != null){
//            flag = true;//如果用户已经登录并存在session则放行
//        }
//
//        //如果不是前后端分离的项目，转发到登录页面
////        request.setAttribute("msg","请您先登录");
////        request.getRequestDispatcher("../index").forward(request,response);
//
//        //如果是前后端分离项目，  重定向到登录页面
////        request.//获取拼接原始地址
//        response.sendRedirect("http://127.0.0.1:5500/ajaxJsonRequestDemo.html");


        return flag;//阻止通行
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
