package org.ksmart02.cafe.headClient.model;

public class HeadClient {
	//본사거래처코드
	private String headClientCode;
	//본사 거래처 이름
	private String headClientName;
	//본사 거래처 등록날짜
	private String headClientRegitDate;
	//본사 거래처쪽 담당자
	private String headClientInCharge;
	//본사 거래처 계약상태
	private String headClientContract;
	//본사 거래처 전화번호
	private String headClientPhone;
	//본사 거래처 주소
	private String headClientAddr;
	//본사쪽 거래처 담당 직원
	private String headStaffId;
	
	public String getHeadClientCode() {
		return headClientCode;
	}
	public void setHeadClientCode(String headClientCode) {
		this.headClientCode = headClientCode;
	}
	public String getHeadClientName() {
		return headClientName;
	}
	public void setHeadClientName(String headClientName) {
		this.headClientName = headClientName;
	}
	public String getHeadClientRegitDate() {
		return headClientRegitDate;
	}
	public void setHeadClientRegitDate(String headClientRegitDate) {
		this.headClientRegitDate = headClientRegitDate;
	}
	public String getHeadClientInCharge() {
		return headClientInCharge;
	}
	public void setHeadClientInCharge(String headClientInCharge) {
		this.headClientInCharge = headClientInCharge;
	}
	public String getHeadClientContract() {
		return headClientContract;
	}
	public void setHeadClientContract(String headClientContract) {
		this.headClientContract = headClientContract;
	}
	public String getHeadClientPhone() {
		return headClientPhone;
	}
	public void setHeadClientPhone(String headClientPhone) {
		this.headClientPhone = headClientPhone;
	}
	public String getHeadClientAddr() {
		return headClientAddr;
	}
	public void setHeadClientAddr(String headClientAddr) {
		this.headClientAddr = headClientAddr;
	}
	public String getHeadStaffId() {
		return headStaffId;
	}
	public void setHeadStaffId(String headStaffId) {
		this.headStaffId = headStaffId;
	}
	@Override
	public String toString() {
		return "HeadClient [headClientCode=" + headClientCode + ", headClientName=" + headClientName
				+ ", headClientRegitDate=" + headClientRegitDate + ", headClientInCharge=" + headClientInCharge
				+ ", headClientContract=" + headClientContract + ", headClientPhone=" + headClientPhone
				+ ", headClientAddr=" + headClientAddr + ", headStaffId=" + headStaffId + "]";
	}
	
}
