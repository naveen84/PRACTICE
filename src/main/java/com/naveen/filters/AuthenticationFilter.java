package com.naveen.filters;

import java.io.IOException;
import java.util.Base64;
import java.util.StringTokenizer;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class AuthenticationFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("AuthenticationFilter init() called..");
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		String auth = req.getHeader("Authorization");
		
			if(auth !=null && !"".equals(auth)){
			System.out.println("Authorization user " + auth);
			auth = auth.replace("Basic ", "");
			
			byte[] arr = Base64.getDecoder().decode(auth.getBytes());
			auth = new String(arr);
			System.out.println("3--->"+auth);
			StringTokenizer token = new StringTokenizer(auth,":");
			String username = token.nextToken();
			String password = token.nextToken();
			System.out.println("username "+username+" password"+password);
			if("krishna".equals(username) && "radha".equals(password)){
				chain.doFilter(request, response);
			  }
			else{
				request.getRequestDispatcher("/erroremp").forward(request, response);
			}
		}
	}

	@Override
	public void destroy() {
		
		System.out.println("AuthenticationFilter destroy() called..");
		
	}

}
