package jp.ac.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.ac.beans.����η��model;

@Mapper
public interface ����η��mapper {
	List<����η��model> findAII(����η��model id);
}
