/*
 * This file is generated by jOOQ.
 */
package com.klaus.iv.useradmin.db.tables.records;


import com.klaus.iv.useradmin.db.tables.User;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record12<Long, Long, LocalDateTime, Integer, Long, LocalDateTime, String, String, String, String, Integer, String> {

    private static final long serialVersionUID = 2067198054;

    /**
     * Setter for <code>user_center.user.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>user_center.user.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>user_center.user.create_by</code>.
     */
    public void setCreateBy(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>user_center.user.create_by</code>.
     */
    public Long getCreateBy() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>user_center.user.create_dt</code>.
     */
    public void setCreateDt(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>user_center.user.create_dt</code>.
     */
    public LocalDateTime getCreateDt() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>user_center.user.is_delete</code>.
     */
    public void setIsDelete(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>user_center.user.is_delete</code>.
     */
    public Integer getIsDelete() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>user_center.user.update_by</code>.
     */
    public void setUpdateBy(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>user_center.user.update_by</code>.
     */
    public Long getUpdateBy() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>user_center.user.update_dt</code>.
     */
    public void setUpdateDt(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>user_center.user.update_dt</code>.
     */
    public LocalDateTime getUpdateDt() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>user_center.user.email</code>.
     */
    public void setEmail(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>user_center.user.email</code>.
     */
    public String getEmail() {
        return (String) get(6);
    }

    /**
     * Setter for <code>user_center.user.mobile</code>.
     */
    public void setMobile(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>user_center.user.mobile</code>.
     */
    public String getMobile() {
        return (String) get(7);
    }

    /**
     * Setter for <code>user_center.user.openid</code>.
     */
    public void setOpenid(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>user_center.user.openid</code>.
     */
    public String getOpenid() {
        return (String) get(8);
    }

    /**
     * Setter for <code>user_center.user.password</code>.
     */
    public void setPassword(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>user_center.user.password</code>.
     */
    public String getPassword() {
        return (String) get(9);
    }

    /**
     * Setter for <code>user_center.user.user_type</code>.
     */
    public void setUserType(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>user_center.user.user_type</code>.
     */
    public Integer getUserType() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>user_center.user.username</code>.
     */
    public void setUsername(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>user_center.user.username</code>.
     */
    public String getUsername() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, Long, LocalDateTime, Integer, Long, LocalDateTime, String, String, String, String, Integer, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Long, Long, LocalDateTime, Integer, Long, LocalDateTime, String, String, String, String, Integer, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return User.USER.ID;
    }

    @Override
    public Field<Long> field2() {
        return User.USER.CREATE_BY;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return User.USER.CREATE_DT;
    }

    @Override
    public Field<Integer> field4() {
        return User.USER.IS_DELETE;
    }

    @Override
    public Field<Long> field5() {
        return User.USER.UPDATE_BY;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return User.USER.UPDATE_DT;
    }

    @Override
    public Field<String> field7() {
        return User.USER.EMAIL;
    }

    @Override
    public Field<String> field8() {
        return User.USER.MOBILE;
    }

    @Override
    public Field<String> field9() {
        return User.USER.OPENID;
    }

    @Override
    public Field<String> field10() {
        return User.USER.PASSWORD;
    }

    @Override
    public Field<Integer> field11() {
        return User.USER.USER_TYPE;
    }

    @Override
    public Field<String> field12() {
        return User.USER.USERNAME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getCreateBy();
    }

    @Override
    public LocalDateTime component3() {
        return getCreateDt();
    }

    @Override
    public Integer component4() {
        return getIsDelete();
    }

    @Override
    public Long component5() {
        return getUpdateBy();
    }

    @Override
    public LocalDateTime component6() {
        return getUpdateDt();
    }

    @Override
    public String component7() {
        return getEmail();
    }

    @Override
    public String component8() {
        return getMobile();
    }

    @Override
    public String component9() {
        return getOpenid();
    }

    @Override
    public String component10() {
        return getPassword();
    }

    @Override
    public Integer component11() {
        return getUserType();
    }

    @Override
    public String component12() {
        return getUsername();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getCreateBy();
    }

    @Override
    public LocalDateTime value3() {
        return getCreateDt();
    }

    @Override
    public Integer value4() {
        return getIsDelete();
    }

    @Override
    public Long value5() {
        return getUpdateBy();
    }

    @Override
    public LocalDateTime value6() {
        return getUpdateDt();
    }

    @Override
    public String value7() {
        return getEmail();
    }

    @Override
    public String value8() {
        return getMobile();
    }

    @Override
    public String value9() {
        return getOpenid();
    }

    @Override
    public String value10() {
        return getPassword();
    }

    @Override
    public Integer value11() {
        return getUserType();
    }

    @Override
    public String value12() {
        return getUsername();
    }

    @Override
    public UserRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public UserRecord value2(Long value) {
        setCreateBy(value);
        return this;
    }

    @Override
    public UserRecord value3(LocalDateTime value) {
        setCreateDt(value);
        return this;
    }

    @Override
    public UserRecord value4(Integer value) {
        setIsDelete(value);
        return this;
    }

    @Override
    public UserRecord value5(Long value) {
        setUpdateBy(value);
        return this;
    }

    @Override
    public UserRecord value6(LocalDateTime value) {
        setUpdateDt(value);
        return this;
    }

    @Override
    public UserRecord value7(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public UserRecord value8(String value) {
        setMobile(value);
        return this;
    }

    @Override
    public UserRecord value9(String value) {
        setOpenid(value);
        return this;
    }

    @Override
    public UserRecord value10(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public UserRecord value11(Integer value) {
        setUserType(value);
        return this;
    }

    @Override
    public UserRecord value12(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public UserRecord values(Long value1, Long value2, LocalDateTime value3, Integer value4, Long value5, LocalDateTime value6, String value7, String value8, String value9, String value10, Integer value11, String value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(Long id, Long createBy, LocalDateTime createDt, Integer isDelete, Long updateBy, LocalDateTime updateDt, String email, String mobile, String openid, String password, Integer userType, String username) {
        super(User.USER);

        set(0, id);
        set(1, createBy);
        set(2, createDt);
        set(3, isDelete);
        set(4, updateBy);
        set(5, updateDt);
        set(6, email);
        set(7, mobile);
        set(8, openid);
        set(9, password);
        set(10, userType);
        set(11, username);
    }
}
