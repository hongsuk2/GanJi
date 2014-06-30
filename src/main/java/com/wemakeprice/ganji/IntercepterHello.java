package com.wemakeprice.ganji;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class IntercepterHello extends HandlerInterceptorAdapter{
    
    @Override
    public boolean preHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler) throws Exception {
        
        if(handler instanceof HandlerMethod){// 핸들러 메소드 타입인지 체크.. 
            Access access = ((HandlerMethod) handler).getMethodAnnotation(Access.class);// 핸들러 메소드에 달려있는 어노테이션을 가져온다..  여기선  Access 를 넣었다.. 
            
            //@Access  달려있으면  null 이아난 객체가 될것이고.. 
            //@Access 없으면   null
            if(access != null){
                //session 에서 실제로 로그인되어잇는지 체크.. 
                throw new ModelAndViewDefiningException(new ModelAndView("redirect:/login"));
            }
        }
        
        return true;
    }

    public void sayHello() {
        System.out.println("안뇽~ 난 로그인 안해도 되는 티나야  ");
    }
    
}
