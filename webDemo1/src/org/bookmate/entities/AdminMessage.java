package org.bookmate.entities;

import java.util.Date;

/**
 * 管理员信息实体类
 * @author Administrator
 *
 */
public class AdminMessage {
	
	//管理员通知id
	private Integer adminMessageId;
	//管理员通知标题
	private String adminMessageTitle;
	//管理员通知内容
	private String adminMessageContent;
	//管理员通知发布时间
	private Date adminMessageTime;
	//管理员ID
	private Integer adminId;
	//映射多对一关系 ，发布消息的管理员实体类
	private Admin admin;
	public Integer getAdminMessageId() {
		return adminMessageId;
	}
	public void setAdminMessageId(Integer adminMessageId) {
		this.adminMessageId = adminMessageId;
	}
	public String getAdminMessageTitle() {
		return adminMessageTitle;
	}
	public void setAdminMessageTitle(String adminMessageTitle) {
		this.adminMessageTitle = adminMessageTitle;
	}
	public String getAdminMessageContent() {
		return adminMessageContent;
	}
	public void setAdminMessageContent(String adminMessageContent) {
		this.adminMessageContent = adminMessageContent;
	}
	public Date getAdminMessageTime() {
		return adminMessageTime;
	}
	public void setAdminMessageTime(Date adminMessageTime) {
		this.adminMessageTime = adminMessageTime;
	}
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
}
