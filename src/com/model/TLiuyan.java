package com.model;

/**
 * TLiuyan generated by MyEclipse Persistence Tools
 */

public class TLiuyan implements java.io.Serializable
{

	// Fields

	private Integer liuyanId;

	private String liuyanTitle;

	private String liuyanContent;
	
	private String liuyanDate;
	
	private String liuyanUser;
	
	private String liuyan_huifu;
	private String huifu_user;
	private String huifu_date;
	

	// Constructors

	/** default constructor */
	public TLiuyan()
	{
	}

	/** full constructor */
	public TLiuyan(String liuyanTitle, String liuyanContent)
	{
		this.liuyanTitle = liuyanTitle;
		this.liuyanContent = liuyanContent;
	}

	// Property accessors

	public Integer getLiuyanId()
	{
		return this.liuyanId;
	}

	public void setLiuyanId(Integer liuyanId)
	{
		this.liuyanId = liuyanId;
	}

	public String getLiuyanTitle()
	{
		return this.liuyanTitle;
	}

	public String getLiuyanUser()
	{
		return liuyanUser;
	}

	public void setLiuyanUser(String liuyanUser)
	{
		this.liuyanUser = liuyanUser;
	}

	public String getLiuyanDate()
	{
		return liuyanDate;
	}

	public void setLiuyanDate(String liuyanDate)
	{
		this.liuyanDate = liuyanDate;
	}

	public void setLiuyanTitle(String liuyanTitle)
	{
		this.liuyanTitle = liuyanTitle;
	}

	public String getLiuyanContent()
	{
		return this.liuyanContent;
	}

	public void setLiuyanContent(String liuyanContent)
	{
		this.liuyanContent = liuyanContent;
	}

	public String getLiuyan_huifu() {
		return liuyan_huifu;
	}

	public void setLiuyan_huifu(String liuyanHuifu) {
		liuyan_huifu = liuyanHuifu;
	}

	public String getHuifu_user() {
		return huifu_user;
	}

	public void setHuifu_user(String huifuUser) {
		huifu_user = huifuUser;
	}

	public String getHuifu_date() {
		return huifu_date;
	}

	public void setHuifu_date(String huifuDate) {
		huifu_date = huifuDate;
	}

}