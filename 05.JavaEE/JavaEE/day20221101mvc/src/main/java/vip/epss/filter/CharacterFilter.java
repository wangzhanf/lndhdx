package vip.epss.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = "*.do")
public class CharacterFilter implements Filter {
    private String charCode;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        charCode = "utf-8";
        System.out.println("CharacterFilter filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("CharacterFilter filter doFilter");
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        httpServletRequest.setCharacterEncoding(this.charCode);
        httpServletResponse.setCharacterEncoding(this.charCode);
        httpServletResponse.setContentType("application/json;charset=utf-8");
        //放行
        filterChain.doFilter(httpServletRequest,httpServletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
        System.out.println("CharacterFilter filter destroy");
    }
}
