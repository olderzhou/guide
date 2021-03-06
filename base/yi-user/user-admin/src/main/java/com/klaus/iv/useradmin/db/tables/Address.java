/*
 * This file is generated by jOOQ.
 */
package com.klaus.iv.useradmin.db.tables;


import com.klaus.iv.useradmin.db.Keys;
import com.klaus.iv.useradmin.db.UserCenter;
import com.klaus.iv.useradmin.db.tables.records.AddressRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row15;
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
public class Address extends TableImpl<AddressRecord> {

    private static final long serialVersionUID = -1146638578;

    /**
     * The reference instance of <code>user_center.address</code>
     */
    public static final Address ADDRESS = new Address();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AddressRecord> getRecordType() {
        return AddressRecord.class;
    }

    /**
     * The column <code>user_center.address.id</code>.
     */
    public final TableField<AddressRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>user_center.address.create_by</code>.
     */
    public final TableField<AddressRecord, Long> CREATE_BY = createField(DSL.name("create_by"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>user_center.address.create_dt</code>.
     */
    public final TableField<AddressRecord, LocalDateTime> CREATE_DT = createField(DSL.name("create_dt"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>user_center.address.is_delete</code>.
     */
    public final TableField<AddressRecord, Integer> IS_DELETE = createField(DSL.name("is_delete"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>user_center.address.update_by</code>.
     */
    public final TableField<AddressRecord, Long> UPDATE_BY = createField(DSL.name("update_by"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>user_center.address.update_dt</code>.
     */
    public final TableField<AddressRecord, LocalDateTime> UPDATE_DT = createField(DSL.name("update_dt"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>user_center.address.city</code>.
     */
    public final TableField<AddressRecord, String> CITY = createField(DSL.name("city"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>user_center.address.country</code>.
     */
    public final TableField<AddressRecord, String> COUNTRY = createField(DSL.name("country"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>user_center.address.detail</code>.
     */
    public final TableField<AddressRecord, String> DETAIL = createField(DSL.name("detail"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>user_center.address.fix_telephone</code>.
     */
    public final TableField<AddressRecord, String> FIX_TELEPHONE = createField(DSL.name("fix_telephone"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>user_center.address.mobile</code>.
     */
    public final TableField<AddressRecord, String> MOBILE = createField(DSL.name("mobile"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>user_center.address.province</code>.
     */
    public final TableField<AddressRecord, String> PROVINCE = createField(DSL.name("province"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>user_center.address.street</code>.
     */
    public final TableField<AddressRecord, String> STREET = createField(DSL.name("street"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>user_center.address.type</code>.
     */
    public final TableField<AddressRecord, Integer> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>user_center.address.zip_code</code>.
     */
    public final TableField<AddressRecord, String> ZIP_CODE = createField(DSL.name("zip_code"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>user_center.address</code> table reference
     */
    public Address() {
        this(DSL.name("address"), null);
    }

    /**
     * Create an aliased <code>user_center.address</code> table reference
     */
    public Address(String alias) {
        this(DSL.name(alias), ADDRESS);
    }

    /**
     * Create an aliased <code>user_center.address</code> table reference
     */
    public Address(Name alias) {
        this(alias, ADDRESS);
    }

    private Address(Name alias, Table<AddressRecord> aliased) {
        this(alias, aliased, null);
    }

    private Address(Name alias, Table<AddressRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Address(Table<O> child, ForeignKey<O, AddressRecord> key) {
        super(child, key, ADDRESS);
    }

    @Override
    public Schema getSchema() {
        return UserCenter.USER_CENTER;
    }

    @Override
    public Identity<AddressRecord, Long> getIdentity() {
        return Keys.IDENTITY_ADDRESS;
    }

    @Override
    public UniqueKey<AddressRecord> getPrimaryKey() {
        return Keys.KEY_ADDRESS_PRIMARY;
    }

    @Override
    public List<UniqueKey<AddressRecord>> getKeys() {
        return Arrays.<UniqueKey<AddressRecord>>asList(Keys.KEY_ADDRESS_PRIMARY);
    }

    @Override
    public Address as(String alias) {
        return new Address(DSL.name(alias), this);
    }

    @Override
    public Address as(Name alias) {
        return new Address(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Address rename(String name) {
        return new Address(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Address rename(Name name) {
        return new Address(name, null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<Long, Long, LocalDateTime, Integer, Long, LocalDateTime, String, String, String, String, String, String, String, Integer, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }
}
