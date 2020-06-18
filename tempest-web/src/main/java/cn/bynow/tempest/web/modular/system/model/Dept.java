package cn.bynow.tempest.web.modular.system.model;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;


/**
 * 部门表
 * 
 * @author bynow
 * @date 2020-06-19 02:06:50
 */
@Data
public class Dept implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键id
	private Integer id;
	//排序
	private Integer num;
	//父部门id
	private Integer pid;
	//父级ids
	private String pids;
	//简称
	private String simplename;
	//全称
	private String fullname;
	//提示
	private String tips;
	//版本（乐观锁保留字段）
	private Integer version;


}
