package jp.ac.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.ac.beans.ÐÃ÷½Î·×âÙ¥á¬model;

@Mapper
public interface ÐÃ÷½Î·×âÙ¥á¬mapper {
	List<ÐÃ÷½Î·×âÙ¥á¬model> findAII(id);
}
