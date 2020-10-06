package jp.ac.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.ac.beans.ÐÃ÷½Î·×âmodel;
import jp.ac.beans.ÐÃ÷½Î·×âÙ¥á¬model;
import jp.ac.mappers.ÐÃ÷½Î·×âÙ¥á¬mapper;

@Service
public class ÐÃ÷½Î·×âÙ¥á¬service {
	@Autowired
	private ÐÃ÷½Î·×âÙ¥á¬mapper ÐÃ÷½Î·×âÙ¥á¬mapper;
	
	@Transactional
	public List<ÐÃ÷½Î·×âÙ¥á¬model> findall(ÐÃ÷½Î·×âmodel id){
		return ÐÃ÷½Î·×âÙ¥á¬mapper.findall(id);
	}
}
