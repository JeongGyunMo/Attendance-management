package jp.ac.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.ac.beans.����η��model;
import jp.ac.beans.����η��٥�model;
import jp.ac.mappers.����η��mapper;

@Service
public class ����η��service {
	@Autowired
	private ����η��mapper ����η��mapper;
	
	@Transactional
	public List<����η��model> findall(����η��model id){
		return ����η��mapper.findAII(id);
	}
}
