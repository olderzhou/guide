package com.klaus.iv.stockapi.dto;

import com.klaus.iv.commonbase.model.dto.BaseDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "用户分组DTO")
public class UserGroupDto extends BaseDto {
    @ApiModelProperty(name = "name", dataType = "Long", value = "1")
    private Long userId;
    @ApiModelProperty(name = "code", dataType = "Long", value = "1")
    private Long groupId;
    @ApiModelProperty(name = "addComments", dataType = "String", value = "消费股票池， 消费行业龙头")
    private String addComments;
}
