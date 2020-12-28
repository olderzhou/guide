/*
 * This file is generated by jOOQ.
 */
package com.klaus.iv.stockadmin.db.tables;


import com.klaus.iv.stockadmin.db.Guide;
import com.klaus.iv.stockadmin.db.Keys;
import com.klaus.iv.stockadmin.db.tables.records.YiGroupRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
public class YiGroup extends TableImpl<YiGroupRecord> {

    private static final long serialVersionUID = 711428392;

    /**
     * The reference instance of <code>guide.yi_group</code>
     */
    public static final YiGroup YI_GROUP = new YiGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<YiGroupRecord> getRecordType() {
        return YiGroupRecord.class;
    }

    /**
     * The column <code>guide.yi_group.id</code>.
     */
    public final TableField<YiGroupRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>guide.yi_group.create_by</code>.
     */
    public final TableField<YiGroupRecord, Long> CREATE_BY = createField(DSL.name("create_by"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>guide.yi_group.create_dt</code>.
     */
    public final TableField<YiGroupRecord, LocalDateTime> CREATE_DT = createField(DSL.name("create_dt"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>guide.yi_group.is_delete</code>.
     */
    public final TableField<YiGroupRecord, Integer> IS_DELETE = createField(DSL.name("is_delete"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>guide.yi_group.update_by</code>.
     */
    public final TableField<YiGroupRecord, Long> UPDATE_BY = createField(DSL.name("update_by"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>guide.yi_group.update_dt</code>.
     */
    public final TableField<YiGroupRecord, LocalDateTime> UPDATE_DT = createField(DSL.name("update_dt"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>guide.yi_group.code</code>.
     */
    public final TableField<YiGroupRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>guide.yi_group.group_desc</code>.
     */
    public final TableField<YiGroupRecord, String> GROUP_DESC = createField(DSL.name("group_desc"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>guide.yi_group.name</code>.
     */
    public final TableField<YiGroupRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>guide.yi_group</code> table reference
     */
    public YiGroup() {
        this(DSL.name("yi_group"), null);
    }

    /**
     * Create an aliased <code>guide.yi_group</code> table reference
     */
    public YiGroup(String alias) {
        this(DSL.name(alias), YI_GROUP);
    }

    /**
     * Create an aliased <code>guide.yi_group</code> table reference
     */
    public YiGroup(Name alias) {
        this(alias, YI_GROUP);
    }

    private YiGroup(Name alias, Table<YiGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private YiGroup(Name alias, Table<YiGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> YiGroup(Table<O> child, ForeignKey<O, YiGroupRecord> key) {
        super(child, key, YI_GROUP);
    }

    @Override
    public Schema getSchema() {
        return Guide.GUIDE;
    }

    @Override
    public Identity<YiGroupRecord, Long> getIdentity() {
        return Keys.IDENTITY_YI_GROUP;
    }

    @Override
    public UniqueKey<YiGroupRecord> getPrimaryKey() {
        return Keys.KEY_YI_GROUP_PRIMARY;
    }

    @Override
    public List<UniqueKey<YiGroupRecord>> getKeys() {
        return Arrays.<UniqueKey<YiGroupRecord>>asList(Keys.KEY_YI_GROUP_PRIMARY);
    }

    @Override
    public YiGroup as(String alias) {
        return new YiGroup(DSL.name(alias), this);
    }

    @Override
    public YiGroup as(Name alias) {
        return new YiGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public YiGroup rename(String name) {
        return new YiGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public YiGroup rename(Name name) {
        return new YiGroup(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Long, LocalDateTime, Integer, Long, LocalDateTime, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}