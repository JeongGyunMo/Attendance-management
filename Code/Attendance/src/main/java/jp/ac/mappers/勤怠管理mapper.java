package jp.ac.mappers;

import java.util.List;

//import org.apache.ibatis.annotations.Mapper;

import jp.ac.beans.勤怠管理model;

//@Mapper
public interface 勤怠管理mapper {
	List<勤怠管理model> findAII(勤怠管理model id);
}
