package jp.ac.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jp.ac.beans.HolidayApplyModel;

class HolidayApplyServiceTest {

	private HolidayApplyService holidayApplyService = null;

	@BeforeEach
	void setUp() throws Exception {
		holidayApplyService = new HolidayApplyService();
	}

	@Test
	void testGetEmpName() {

		try {
			String exName = holidayApplyService.getEmpName("1");
			assertEquals("盧周利", exName);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Test
	void testGetMaxSeriesNum() {
		try {
			int MaxNm = holidayApplyService.getMaxSeriesNum();
			assertEquals(2, MaxNm);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	void testHolidayInsert() {

		HolidayApplyModel HdModel = new HolidayApplyModel();

		// holidayApplyView.jspでデータを受け取ってbeansファイルに保存
		HdModel.setSeriesNum(2);
		HdModel.setEmployeeId(1);
		HdModel.setEmployeeName("盧周利");
		HdModel.setYearTimeCode(1005);
		HdModel.setFromDate("2021-01-18 오전 12:00:00");
		HdModel.setToDate("2021-01-22 오전 12:00:00");
		HdModel.setGrounds("健康診断");
		HdModel.setRegistred("1");

		try {
			holidayApplyService.holidayInsert(HdModel);
			int empId = 1;
			String year = "2021";
			String month = "01";

			List<HolidayApplyModel> holidayList = holidayApplyService.holidayList(empId, year, month);

			assertEquals(2, holidayList.get(0).getSeriesNum());
			assertEquals(1, holidayList.get(0).getEmployeeId());
			assertEquals("盧周利", holidayList.get(0).getEmployeeName());
			assertEquals(1005, holidayList.get(0).getYearTimeCode());
			assertEquals("2021-01-18 오전 12:00:00", holidayList.get(0).getFromDate());
			assertEquals("2021-01-22 오전 12:00:00", holidayList.get(0).getToDate());
			assertEquals("健康診断", holidayList.get(0).getGrounds());
			assertEquals("1", holidayList.get(0).getRegistred());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	void testHolidayType() {

	}

	@Test
	void testHolidayDelete() {
		// delete
		// select
		// assertNull(holidayList.get(0).getSeriesNum());
		try {
			int n = holidayApplyService.holidayDelete(2);
			System.out.print(n);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
