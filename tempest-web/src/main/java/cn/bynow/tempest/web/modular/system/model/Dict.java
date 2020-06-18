package cn.bynow.tempest.web.modular.system.model;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;


/**
 * 字典表
 * 
 * @author bynow
 * @date 2020-06-19 02:07:41
 */
@Data
public class Dict implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键id
	private Integer id;
	//排序
	private Integer num;
	//父级字典
	private Integer pid;
	//名称
	private String name;
	//提示
	private String tips;


}
