package com.atguigu.gulimall.sms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 秒杀活动场次
 * 
 * @author Jesse
 * @email Jesse@atguigu.com
 * @date 2019-08-06 22:41:57
 */
@ApiModel
@Data
@TableName("sms_seckill_session")
public class SeckillSessionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "id")
	private Long id;
	/**
	 * 场次名称
	 */
	@ApiModelProperty(name = "name",value = "场次名称")
	private String name;
	/**
	 * 每日开始时间
	 */
	@ApiModelProperty(name = "startTime",value = "每日开始时间")
	private Date startTime;
	/**
	 * 每日结束时间
	 */
	@ApiModelProperty(name = "endTime",value = "每日结束时间")
	private Date endTime;
	/**
	 * 启用状态
	 */
	@ApiModelProperty(name = "status",value = "启用状态")
	private Integer status;
	/**
	 * 创建时间
	 */
	@ApiModelProperty(name = "createTime",value = "创建时间")
	private Date createTime;

}
