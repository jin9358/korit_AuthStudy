package com.korit.authstudy.filter;

import jakarta.servlet.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class StudyFilter implements Filter {        // ctrl + i 로 비어있는 박스(추상메서드) 구현
    @Override   
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("전처리");      // 전처리
        filterChain.doFilter(servletRequest, servletResponse);  // controller라고 생각
        System.out.println("후처리");      // 후처리
    }
}
