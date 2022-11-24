package vip.epss.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("登录过滤...........");
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;

        //判断可以放行的条件   index.jsp ,   login.do
        String[] urls = {"index.jsp","login.do"};
        String url = httpServletRequest.getRequestURI();
        for (int i = 0; i < urls.length; i++) {
            if(url.indexOf(urls[i]) > -1){//存在
                filterChain.doFilter(httpServletRequest, httpServletResponse);
            }else{
                HttpSession session = httpServletRequest.getSession();
                if(session.getAttribute("sta")!=null && (Boolean) session.getAttribute("sta")){//正常访问
                    filterChain.doFilter(httpServletRequest, httpServletResponse);
                }else{
                    String contextPath = httpServletRequest.getContextPath();
                    httpServletResponse.sendRedirect(contextPath +"/index.jsp?msg=1111");
                }
            }
        }


    }
}
