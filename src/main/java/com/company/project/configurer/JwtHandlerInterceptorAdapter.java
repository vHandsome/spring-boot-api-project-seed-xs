package com.company.project.configurer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class JwtHandlerInterceptorAdapter extends HandlerInterceptorAdapter {

	private static final Logger log = LoggerFactory.getLogger(JwtHandlerInterceptorAdapter.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		log.info(request.getServletPath());
		return true;
	}
}
