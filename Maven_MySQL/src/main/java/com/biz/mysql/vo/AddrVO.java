package com.biz.mysql.vo;

public class AddrVO {
	private long id;
	private String ad_name;
	private String ad_tel;
	private String ad_addr;
	
	public AddrVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddrVO(String ad_name, String ad_tel, String ad_addr) {
		super();
		this.id = 0;
		this.ad_name = ad_name;
		this.ad_tel = ad_tel;
		this.ad_addr = ad_addr;
	}
	
	public AddrVO(long id, String ad_name, String ad_tel, String ad_addr) {
		super();
		this.id = id;
		this.ad_name = ad_name;
		this.ad_tel = ad_tel;
		this.ad_addr = ad_addr;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAd_name() {
		return ad_name;
	}
	public void setAd_name(String ad_name) {
		this.ad_name = ad_name;
	}
	public String getAd_tel() {
		return ad_tel;
	}
	public void setAd_tel(String ad_tel) {
		this.ad_tel = ad_tel;
	}
	public String getAd_addr() {
		return ad_addr;
	}
	public void setAd_addr(String ad_addr) {
		this.ad_addr = ad_addr;
	}
	@Override
	public String toString() {
		return "AddrVO [id=" + id + ", ad_name=" + ad_name + ", ad_tel=" + ad_tel + ", ad_addr=" + ad_addr + "]";
	}

	

}
