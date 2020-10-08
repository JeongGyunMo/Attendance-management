package jp.ac.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.ac.beans.ÐÃ÷½Î·×âmodel;
import jp.ac.beans.ÐÃ÷½Î·×âÙ¥á¬model;
import jp.ac.mappers.ÐÃ÷½Î·×âmapper;

@Service
public class ÐÃ÷½Î·×âservice {
	@Autowired
	private ÐÃ÷½Î·×âmapper ÐÃ÷½Î·×âmapper;
	
	@Transactional
	public List<ÐÃ÷½Î·×âmodel> findall(ÐÃ÷½Î·×âmodel id){
		return ÐÃ÷½Î·×âmapper.findAII(id);
	}
}
