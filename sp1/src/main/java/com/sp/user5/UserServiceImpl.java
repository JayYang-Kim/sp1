package com.sp.user5;

import org.springframework.stereotype.Service;

@Service("user5.userService")
public class UserServiceImpl implements UserService {

	@Override
	public String calculator(User dto) {
		String s = null;
		
		switch (dto.getOper()) {
			case "+" : s = String.format("%d + %d = %d", dto.getNum1(), dto.getNum2(), dto.getNum1() + dto.getNum2()); break;
			case "-" : s = String.format("%d - %d = %d", dto.getNum1(), dto.getNum2(), dto.getNum1() - dto.getNum2()); break;
			case "*" : s = String.format("%d * %d = %d", dto.getNum1(), dto.getNum2(), dto.getNum1() * dto.getNum2()); break;
			case "/" : s = String.format("%d / %d = %d", dto.getNum1(), dto.getNum2(), dto.getNum1() / dto.getNum2()); break;
		}
		
		return s;
	}

}
