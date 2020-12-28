/*
 * This file is generated by jOOQ.
 */
package com.klaus.iv.stockadmin.db.tables;


import com.klaus.iv.stockadmin.db.Guide;
import com.klaus.iv.stockadmin.db.Keys;
import com.klaus.iv.stockadmin.db.tables.records.UserRoleRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRole extends TableImpl<UserRoleRecord> {

    private static final long serialVersionUID = 930944846;

    /**
     * The reference instance of <code>guide.user_role</code>
     */
    public static final UserRole USER_ROLE = new UserRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRoleRecord> getRecordType() {
        return UserRoleRecord.class;
    }

    /**
     * The column <code>guide.user_role.id</code>.
     */
    public final TableField<UserRoleRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>guide.user_role.create_by</code>.
     */
    public final TableField<UserRoleRecord, Long> CREATE_BY = createField(DSL.name("create_by"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>guide.user_role.create_dt</code>.
     */
    public final TableField<UserRoleRecord, LocalDateTime> CREATE_DT = createField(DSL.name("create_dt"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>guide.user_role.is_delete</code>.
     */
    public final TableField<UserRoleRecord, Integer> IS_DELETE = createField(DSL.name("is_delete"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>guide.user_role.update_by</code>.
     */
    public final TableField<UserRoleRecord, Long> UPDATE_BY = createField(DSL.name("update_by"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>guide.user_role.update_dt</code>.
     */
    public final TableField<UserRoleRecord, LocalDateTime> UPDATE_DT = createField(DSL.name("update_dt"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>guide.user_role.role_id</code>.
     */
    public final TableField<UserRoleRecord, Long> ROLE_ID = createField(DSL.name("role_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>guide.user_role.user_id</code>.
     */
    public final TableField<UserRoleRecord, Long> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>guide.user_role</code> table reference
     */
    public UserRole() {
        this(DSL.name("user_role"), null);
    }

    /**
     * Create an aliased <code>guide.user_role</code> table reference
     */
    public UserRole(String alias) {
        this(DSL.name(alias), USER_ROLE);
    }

    /**
     * Create an aliased <code>guide.user_role</code> table reference
     */
    public UserRole(Name alias) {
        this(alias, USER_ROLE);
    }

    private UserRole(Name alias, Table<UserRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserRole(Name alias, Table<UserRoleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> UserRole(Table<O> child, ForeignKey<O, UserRoleRecord> key) {
        super(child, key, USER_ROLE);
    }

    @Override
    public Schema getSchema() {
        return Guide.GUIDE;
    }

    @Override
    public Identity<UserRoleRecord, Long> getIdentity() {
        return Keys.IDENTITY_USER_ROLE;
    }

    @Override
    public UniqueKey<UserRoleRecord> getPrimaryKey() {
        return Keys.KEY_USER_ROLE_PRIMARY;
    }

    @Override
    public List<UniqueKey<UserRoleRecord>> getKeys() {
        return Arrays.<UniqueKey<UserRoleRecord>>asList(Keys.KEY_USER_ROLE_PRIMARY);
    }

    @Override
    public UserRole as(String alias) {
        return new UserRole(DSL.name(alias), this);
    }

    @Override
    public UserRole as(Name alias) {
        return new UserRole(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserRole rename(String name) {
        return new UserRole(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserRole rename(Name name) {
        return new UserRole(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, Long, LocalDateTime, Integer, Long, LocalDateTime, Long, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}