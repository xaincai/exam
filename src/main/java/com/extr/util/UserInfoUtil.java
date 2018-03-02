package com.extr.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.context.SecurityContextHolder;

import com.extr.domain.question.Question;
import com.extr.security.UserInfo;

public class UserInfoUtil {
	public static UserInfo getUserInfo(){
		UserInfo userInfo=(UserInfo)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return userInfo;
	}	
}
