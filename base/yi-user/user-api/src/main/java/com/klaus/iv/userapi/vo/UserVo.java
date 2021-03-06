package com.klaus.iv.userapi.vo;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.klaus.iv.commonbase.model.vo.BaseVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel("UserVo")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserVo extends BaseVo {
    @ApiModelProperty(name = "username", value = "zhangsan", notes = "名称")
    private String username;
    @ApiModelProperty(name = "openID", value = "zhangsan", notes = "名称")
    private String openID;
    @ApiModelProperty(name = "password", value = "zhangsan", notes = "名称")
    private String password;
    @ApiModelProperty(name = "mobile", value = "zhangsan", notes = "名称")
    private String mobile;
    @ApiModelProperty(name = "email", value = "zhangsan", notes = "名称")
    private String email;
    @ApiModelProperty(name = "userType", value = "zhangsan", notes = "名称")
    private int userType;
    @ApiModelProperty(name = "roles", value = "{}", notes = "角色列表")
    private List<RoleVo> roles;

}
