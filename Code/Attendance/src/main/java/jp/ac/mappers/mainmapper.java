package jp.ac.mappers;

import org.apache.ibatis.annotations.Mapper;

import jp.ac.beans.joinbean;

@Mapper
public interface mainmapper {
	void join(joinbean bean);
}
