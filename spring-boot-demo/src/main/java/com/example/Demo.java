/**
 *
 */
package com.example;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 这是一个测试实体类
 * @author GB
 *
 */
public class Demo {
	private int id;
	private String name;

	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	/**
	 * 如果不想返回remarks属性。则过滤
	 * serialize：是否需要序列化
	 */
	@JSONField(serialize=false)
	private String remarks;

	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date date) {
		this.createTime = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
