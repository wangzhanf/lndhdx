package vip.epss.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import vip.epss.utils.MessageAndData;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(urlPatterns = "*.do")
public class LogCheckFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("LogCheckFilter   dowork.....");
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpSession session = httpServletRequest.getSession();
        //System.out.println((boolean)session.getAttribute("lStatus"));
        System.out.println(session.getId());//
        if(session.getAttribute("lStatus") == null){
            System.out.println("========================");
        }
        if(session.getAttribute("lStatus") != null || httpServletRequest.getServletPath().indexOf("login.do") >= 0
                || httpServletRequest.getServletPath().indexOf("vcode.do") >=0
                || httpServletRequest.getServletPath().indexOf("loginCheck.do") >=0){
            filterChain.doFilter(servletRequest, servletResponse);
        }else{
            MessageAndData mad = null;
            mad = MessageAndData.error("index.html");
            //转换为JSON
            ObjectMapper objectMapper = new ObjectMapper();
            String ret = objectMapper.writeValueAsString(mad);
            //返回给view,因为是前后端分离，交互JSON数据，需要告知客户端
            PrintWriter writer = servletResponse.getWriter();
            writer.print(ret);
            writer.flush();
            writer.close();
            return;//阻止   //课间休息：   10：35
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
