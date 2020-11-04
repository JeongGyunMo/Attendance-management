package jp.ac.mappers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

//import org.apache.ibatis.annotations.Mapper;
import jp.ac.beans.勤怠管理model;
import jp.ac.entities.社員マスタ;
import jp.ac.entities.社員マスタRepository;

//@Mapper
public class 勤怠管理mapper {
	
	@Autowired
	社員マスタRepository 社員マスタRepository;
	
	public List<勤怠管理model> findAII(勤怠管理model Account) {
		社員マスタ 社員マスタ= new 社員マスタ();
		社員マスタ.setEmployeeid(Account.getEmployeeid());
		社員マスタ.setDepartcode(Account.getDepartcode());
		社員マスタ.setEmployname(Account.getEmployname());
		社員マスタ.setLoginid(Account.getLoginid());
		社員マスタ.setLoginpass(Account.getLoginpass());
		社員マスタ.setPhonetic(Account.getPhonetic());
		社員マスタ.setZipcode(Account.getZipcode());
		社員マスタ.setAddress1(Account.getAddress1());
		社員マスタ.setAddress2(Account.getAddress2());
		社員マスタ.setPhonenum(Account.getPhonenum());
		社員マスタ.setMobilenum(Account.getMobilenum());
		社員マスタ.setEmail(Account.getEmail());
		社員マスタ.setRegistred(Account.getRegistred());
		社員マスタ.setRegistredtime(Account.getRegistredtime());
		社員マスタ.setUpdated(Account.getUpdated());
		社員マスタ.setUpdatedtime(Account.getUpdatedtime());
		社員マスタRepository.save(社員マスタ);
		return null;
	}
}
