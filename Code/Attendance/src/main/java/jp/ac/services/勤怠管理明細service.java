package jp.ac.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.ac.beans.����η��model;
import jp.ac.beans.����η��٥�model;
import jp.ac.mappers.����η��٥�mapper;

@Service
public class ����η��٥�service {
	@Autowired
	private ����η��٥�mapper ����η��٥�mapper;
	
	@Transactional
	public List<����η��٥�model> findall(����η��model id){
		return ����η��٥�mapper.findall(id);
	}
}
