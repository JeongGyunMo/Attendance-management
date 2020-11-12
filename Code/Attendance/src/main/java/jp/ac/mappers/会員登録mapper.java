package jp.ac.mappers;

import java.util.List;
import jp.ac.beans.会員登録model;

public interface 会員登録mapper {

	public List<会員登録model> save(会員登録model Account) throws Exception;
	
}
