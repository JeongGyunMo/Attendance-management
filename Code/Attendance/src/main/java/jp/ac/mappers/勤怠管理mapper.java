package jp.ac.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.ac.beans.ÐÃ÷½Î·×âmodel;

@Mapper
public interface ÐÃ÷½Î·×âmapper {
	List<ÐÃ÷½Î·×âmodel> findAII(ÐÃ÷½Î·×âmodel id);
}
