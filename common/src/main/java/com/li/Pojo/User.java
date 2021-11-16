package com.li.Pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @title: User
 * @Author Tian
 * @Date: 2021/11/16 10:11
 */
@Data
@ApiModel
public class User {
    @ApiModelProperty("用户ID")
    private Integer id;
    @ApiModelProperty("用户姓名")
    private String name;
    @ApiModelProperty("用户性别")
    private Integer gender;
    @ApiModelProperty("用户年龄")
    private Integer age;
    @ApiModelProperty("用户地址")
    private String address;
    @ApiModelProperty("用户消费能力")
    private String powerOfConsumption;
    @ApiModelProperty("用户冗余字段")
    private String redundancyChar;
}
