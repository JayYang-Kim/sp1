package com.sp.lotto;

import java.util.Random;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service("lotto.lottoService")
public class LottoServiceImpl implements LottoService {

	@Override
	public String lotto(Lotto dto) {
		int num = dto.getCount();
		Random rand = new Random();
		String s = null;
		
		for(int i = 0; i < num; i++) {
			
		}
			
		return null;
	}
	
	

}
