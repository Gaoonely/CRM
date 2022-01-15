package com.Onely.crm.web.filers;

import com.Onely.crm.setting.domain.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        String servletPath = req.getServletPath();
        if (servletPath.contains("login")) {
            chain.doFilter(request, response);
        } else {
            System.out.println("防止恶意登录过滤器");
            HttpSession session = req.getSession();
            User u = (User) session.getAttribute("user");
            if (u != null) {
                chain.doFilter(request, response);
            } else {
                //重定向到登录界面，里面填绝对路径"/crm/login.jsp",这里项目根路径也就是/crm通过req.getContextPath()动态获取
                resp.sendRedirect(req.getContextPath() + "/login.jsp");
            }

        }
    }

}
