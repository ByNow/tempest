package cn.bynow.tempest.web.modular.system.model;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;


/**
 * 通知表
 * 
 * @author bynow
 * @date 2020-06-19 02:06:18
 */
@Data
public class Notice implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Integer id;
	//标题
	private String title;
	//类型
	private Integer type;
	//内容
	private String content;
	//创建时间
	private Date createtime;
	//创建人
	private Integer creater;


}
