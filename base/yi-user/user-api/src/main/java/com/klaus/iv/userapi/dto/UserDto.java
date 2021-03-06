package com.klaus.iv.userapi.dto;

import com.klaus.iv.commonbase.model.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto extends BaseDto {

    private String username;
    private String openID;
    private String password;
    private String mobile;
    private String email;
    private int userType;

}
