package jp.ac.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.ac.beans.Test;
import jp.ac.mappers.TestMapper;

@Service
public class TestService {

	@Autowired
	TestMapper testMapper;
	
	public List<Test> getAll() throws Exception{
		return testMapper.getAll();
	}
}
