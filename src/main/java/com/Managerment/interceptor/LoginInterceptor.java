package com.Managerment.interceptor;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;



public class LoginInterceptor  implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		//如果是登录页面则放行
		if(request.getRequestURI().indexOf("/Login")>=0){
			return true;
		}
		HttpSession session = request.getSession();
		//如果用户已登录也放行
		if(session.getAttribute("username")!=null){
			return true;
		}
		//用户没有登录跳转到登录页面
		request.getRequestDispatcher("/system/login.jsp").forward(request, response);

		return false;

	}

}
