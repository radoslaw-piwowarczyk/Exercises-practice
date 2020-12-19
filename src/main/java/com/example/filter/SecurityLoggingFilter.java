package com.example.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

@WebFilter("/*")
public class SecurityLoggingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        log(request);
        filterChain.doFilter(request, response);
    }

    private void log(ServletRequest request) {
        String ip = request.getRemoteAddr();
        String userAgent = ((HttpServletRequest) request).getHeader("user-agent");
        System.out.println(ip + ">>" + userAgent);
    }
}
