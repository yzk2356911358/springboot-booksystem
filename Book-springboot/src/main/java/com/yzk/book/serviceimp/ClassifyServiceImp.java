package com.yzk.book.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yzk.book.dao.ClassifyDao;
import com.yzk.book.model.Classify;
import com.yzk.book.service.ClassifyService;
@Service("ClassifyServiceImp")
public class ClassifyServiceImp implements ClassifyService {
	@Autowired
	private ClassifyDao classifydao;
	@Override
	public void add(Classify classify) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(Classify temp) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Classify> findall() {
		return classifydao.findAll();
	}

}
