package com.klaus.iv.commonweb.exception;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class DbException extends RuntimeException {
    private String msg;
    private String code;

    public DbException(String code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }


}
