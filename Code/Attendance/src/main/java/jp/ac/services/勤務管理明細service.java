package jp.ac.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.ac.mappers.����η��٥�mapper;

@Service
public class ����η��٥�service {
	@Autowired
	private ����η��٥�mapper ����η��٥�mapper;
	
	@Transactional
	public List<����η��٥�model> findall(id){
		return ����η��٥�mapper.findall(id);
	}
}
