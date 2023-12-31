package com.khj.exam.demo.vo;

import lombok.Getter;

public class ResultData {
	@Getter
	private String resultCode;
	@Getter
	private String msg;
	@Getter
	private Object data1;
	
	private ResultData() {
		
	}
	
	public static ResultData from(String reslutCode, Srting msg, Object data1) {
		ResultData rd = new ResultData();
		rd.resultCode = reslutCode;
		rd.msg = msg;
		rd.data1 = data1;
		
		return rd;
	}
	
	public boolean isSuccess() {
		return resultCode.startsWith("S-");
		
	}
	
	public boolean isFail() {
		return isSuccess() == false;
	}
}
