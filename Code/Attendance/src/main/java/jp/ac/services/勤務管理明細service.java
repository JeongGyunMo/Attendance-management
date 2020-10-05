package jp.ac.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.ac.mappers.ĞÃÙâÎ·×âÙ¥á¬mapper;

@Service
public class ĞÃÙâÎ·×âÙ¥á¬service {
	@Autowired
	private ĞÃÙâÎ·×âÙ¥á¬mapper ĞÃ÷½Î·×âÙ¥á¬mapper;
	
	@Transactional
	public List<ĞÃ÷½Î·×âÙ¥á¬model> findall(id){
		return ĞÃ÷½Î·×âÙ¥á¬mapper.findall(id);
	}
}
