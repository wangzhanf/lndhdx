package vip.epss.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = "*.do")
public class CrosFilter implements Filter {
    private String charCode;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        charCode = "utf-8";
        System.out.println("CrosFilter filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("CrosFilter filter doFilter");
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        //设置允许跨域
        httpServletResponse.setHeader("Access-Control-Allow-Origin", httpServletRequest.getHeader("Origin"));
//        httpServletResponse.setHeader("Access-Control-Allow-Origin","*");
//        httpServletResponse.setHeader("Cache-Control","no-cache");
        //设置开启Cookie
        httpServletResponse.setHeader("Access-Control-Allow-Credentials", "true");
        //放行
        filterChain.doFilter(httpServletRequest,httpServletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
        System.out.println("CrosFilter filter destroy");
    }
}
