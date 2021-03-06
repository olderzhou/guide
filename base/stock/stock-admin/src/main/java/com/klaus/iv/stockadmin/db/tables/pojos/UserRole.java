/*
 * This file is generated by jOOQ.
 */
package com.klaus.iv.stockadmin.db.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRole implements Serializable {

    private static final long serialVersionUID = -548560803;

    private Long          id;
    private Long          createBy;
    private LocalDateTime createDt;
    private Integer       isDelete;
    private Long          updateBy;
    private LocalDateTime updateDt;
    private Long          roleId;
    private Long          userId;

    public UserRole() {}

    public UserRole(UserRole value) {
        this.id = value.id;
        this.createBy = value.createBy;
        this.createDt = value.createDt;
        this.isDelete = value.isDelete;
        this.updateBy = value.updateBy;
        this.updateDt = value.updateDt;
        this.roleId = value.roleId;
        this.userId = value.userId;
    }

    public UserRole(
        Long          id,
        Long          createBy,
        LocalDateTime createDt,
        Integer       isDelete,
        Long          updateBy,
        LocalDateTime updateDt,
        Long          roleId,
        Long          userId
    ) {
        this.id = id;
        this.createBy = createBy;
        this.createDt = createDt;
        this.isDelete = isDelete;
        this.updateBy = updateBy;
        this.updateDt = updateDt;
        this.roleId = roleId;
        this.userId = userId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateBy() {
        return this.createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public LocalDateTime getCreateDt() {
        return this.createDt;
    }

    public void setCreateDt(LocalDateTime createDt) {
        this.createDt = createDt;
    }

    public Integer getIsDelete() {
        return this.isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Long getUpdateBy() {
        return this.updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDateTime getUpdateDt() {
        return this.updateDt;
    }

    public void setUpdateDt(LocalDateTime updateDt) {
        this.updateDt = updateDt;
    }

    public Long getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserRole (");

        sb.append(id);
        sb.append(", ").append(createBy);
        sb.append(", ").append(createDt);
        sb.append(", ").append(isDelete);
        sb.append(", ").append(updateBy);
        sb.append(", ").append(updateDt);
        sb.append(", ").append(roleId);
        sb.append(", ").append(userId);

        sb.append(")");
        return sb.toString();
    }
}
