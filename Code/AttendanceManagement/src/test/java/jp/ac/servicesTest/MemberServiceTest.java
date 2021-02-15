package jp.ac.servicesTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import jp.ac.beans.MemberModel;
import jp.ac.mappers.MemberMapper;

@RunWith(SpringRunner.class)
public class MemberServiceTest {
	// given 準備
	@MockBean
	MemberMapper MemberMapper;
	private MemberModel initData;
	@Before
    public void setup() {
        initData = new MemberModel();
        //initData.setEmployeeId(1);
        initData.setDepartCode("12");
        initData.setEmployName("jgm");
        initData.setLoginId("q");
        initData.setLoginPass("qwe");
        initData.setPhonetic("jgm");
        initData.setZipCode("125");
        initData.setAddress1("qwe");
        initData.setAddress2("qwe");
        initData.setPhoneNum("090");
        initData.setMobileNum("2767");
        initData.setEmail("gamil");
    }
	// when 実行
	@Test
	public void create() throws Exception {
		MemberMapper.save(initData);
		// then 結果
		System.out.println("비교 시작");
		assertEquals("비교","jgm",initData.getEmployName());
		assertEquals("12",initData.getDepartCode());
	}
	
	
	
}
