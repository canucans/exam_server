package com.canu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Date 2022/10/20 8:57
 * @created by canu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("用户实体")
@TableName(value = "user")
public class User implements Serializable {

    //  对应数据库的主键(uuid,自增id,雪花算法, redis,zookeeper)
    @TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "主键 用户id", example = "1")
    private Integer id;

    @ApiModelProperty(value = "用户角色id", example = "1(学生) 2(教师) 3(管理员)")
    private Integer roleId;

    @ApiModelProperty(value = "登录用户名", example = "canu")
    private String username;

    @ApiModelProperty(value = "真实姓名", example = "canu")
    private String trueName;

    @ApiModelProperty(value = "密码", example = "canuzz")
    private String password;

    @ApiModelProperty(value = "加密盐值", example = "afada")
    private String salt;

    @ApiModelProperty(value = "用户状态",example = "1正常 2禁用")
    private Integer status;

    @ApiModelProperty(value = "用户创建时间",example = "2020-10-22 10:35:44")
    private Date createDate;
}
