package jp.ac.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import jp.ac.beans.ログインmodel;
import jp.ac.beans.会員登録model;

public interface ログインmapper{

	public String logincheck(ログインmodel ID) throws Exception;
	
}
