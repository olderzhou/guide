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
@ApiModel(value = "股票分组实体DTO")
public class StockGroupDto extends BaseDto {
    @ApiModelProperty(name = "id", dataType = "Long", value = "1")
    private Long id;
    @ApiModelProperty(name = "groupCode", dataType = "String", value = "中金股份")
    private String groupCode;
    @ApiModelProperty(name = "stockCode", dataType = "String", value = "600787")
    private String stockCode;
    @ApiModelProperty(name = "addComments", dataType = "String", value = "中金公司, A股市场第一的券商")
    private String addComments;
    @ApiModelProperty(name = "price", dataType = "Long", value = "1100, 实际代表11元")
    private Long price;
}
