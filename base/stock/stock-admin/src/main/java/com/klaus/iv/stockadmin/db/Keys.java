/*
 * This file is generated by jOOQ.
 */
package com.klaus.iv.stockadmin.db;


import com.klaus.iv.stockadmin.db.tables.Address;
import com.klaus.iv.stockadmin.db.tables.Resource;
import com.klaus.iv.stockadmin.db.tables.Role;
import com.klaus.iv.stockadmin.db.tables.RoleResource;
import com.klaus.iv.stockadmin.db.tables.Stock;
import com.klaus.iv.stockadmin.db.tables.StockGroup;
import com.klaus.iv.stockadmin.db.tables.StockPo;
import com.klaus.iv.stockadmin.db.tables.User;
import com.klaus.iv.stockadmin.db.tables.UserAddress;
import com.klaus.iv.stockadmin.db.tables.UserExt;
import com.klaus.iv.stockadmin.db.tables.UserGroup;
import com.klaus.iv.stockadmin.db.tables.UserRole;
import com.klaus.iv.stockadmin.db.tables.YiGroup;
import com.klaus.iv.stockadmin.db.tables.YiStock;
import com.klaus.iv.stockadmin.db.tables.records.AddressRecord;
import com.klaus.iv.stockadmin.db.tables.records.ResourceRecord;
import com.klaus.iv.stockadmin.db.tables.records.RoleRecord;
import com.klaus.iv.stockadmin.db.tables.records.RoleResourceRecord;
import com.klaus.iv.stockadmin.db.tables.records.StockGroupRecord;
import com.klaus.iv.stockadmin.db.tables.records.StockPoRecord;
import com.klaus.iv.stockadmin.db.tables.records.StockRecord;
import com.klaus.iv.stockadmin.db.tables.records.UserAddressRecord;
import com.klaus.iv.stockadmin.db.tables.records.UserExtRecord;
import com.klaus.iv.stockadmin.db.tables.records.UserGroupRecord;
import com.klaus.iv.stockadmin.db.tables.records.UserRecord;
import com.klaus.iv.stockadmin.db.tables.records.UserRoleRecord;
import com.klaus.iv.stockadmin.db.tables.records.YiGroupRecord;
import com.klaus.iv.stockadmin.db.tables.records.YiStockRecord;

import org.jooq.Identity;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>guide</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AddressRecord, Long> IDENTITY_ADDRESS = Identities0.IDENTITY_ADDRESS;
    public static final Identity<ResourceRecord, Long> IDENTITY_RESOURCE = Identities0.IDENTITY_RESOURCE;
    public static final Identity<RoleRecord, Long> IDENTITY_ROLE = Identities0.IDENTITY_ROLE;
    public static final Identity<RoleResourceRecord, Long> IDENTITY_ROLE_RESOURCE = Identities0.IDENTITY_ROLE_RESOURCE;
    public static final Identity<StockRecord, Long> IDENTITY_STOCK = Identities0.IDENTITY_STOCK;
    public static final Identity<StockGroupRecord, Long> IDENTITY_STOCK_GROUP = Identities0.IDENTITY_STOCK_GROUP;
    public static final Identity<StockPoRecord, Long> IDENTITY_STOCK_PO = Identities0.IDENTITY_STOCK_PO;
    public static final Identity<UserRecord, Long> IDENTITY_USER = Identities0.IDENTITY_USER;
    public static final Identity<UserAddressRecord, Long> IDENTITY_USER_ADDRESS = Identities0.IDENTITY_USER_ADDRESS;
    public static final Identity<UserExtRecord, Long> IDENTITY_USER_EXT = Identities0.IDENTITY_USER_EXT;
    public static final Identity<UserGroupRecord, Long> IDENTITY_USER_GROUP = Identities0.IDENTITY_USER_GROUP;
    public static final Identity<UserRoleRecord, Long> IDENTITY_USER_ROLE = Identities0.IDENTITY_USER_ROLE;
    public static final Identity<YiGroupRecord, Long> IDENTITY_YI_GROUP = Identities0.IDENTITY_YI_GROUP;
    public static final Identity<YiStockRecord, Long> IDENTITY_YI_STOCK = Identities0.IDENTITY_YI_STOCK;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AddressRecord> KEY_ADDRESS_PRIMARY = UniqueKeys0.KEY_ADDRESS_PRIMARY;
    public static final UniqueKey<ResourceRecord> KEY_RESOURCE_PRIMARY = UniqueKeys0.KEY_RESOURCE_PRIMARY;
    public static final UniqueKey<RoleRecord> KEY_ROLE_PRIMARY = UniqueKeys0.KEY_ROLE_PRIMARY;
    public static final UniqueKey<RoleResourceRecord> KEY_ROLE_RESOURCE_PRIMARY = UniqueKeys0.KEY_ROLE_RESOURCE_PRIMARY;
    public static final UniqueKey<StockRecord> KEY_STOCK_PRIMARY = UniqueKeys0.KEY_STOCK_PRIMARY;
    public static final UniqueKey<StockGroupRecord> KEY_STOCK_GROUP_PRIMARY = UniqueKeys0.KEY_STOCK_GROUP_PRIMARY;
    public static final UniqueKey<StockPoRecord> KEY_STOCK_PO_PRIMARY = UniqueKeys0.KEY_STOCK_PO_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;
    public static final UniqueKey<UserAddressRecord> KEY_USER_ADDRESS_PRIMARY = UniqueKeys0.KEY_USER_ADDRESS_PRIMARY;
    public static final UniqueKey<UserExtRecord> KEY_USER_EXT_PRIMARY = UniqueKeys0.KEY_USER_EXT_PRIMARY;
    public static final UniqueKey<UserGroupRecord> KEY_USER_GROUP_PRIMARY = UniqueKeys0.KEY_USER_GROUP_PRIMARY;
    public static final UniqueKey<UserRoleRecord> KEY_USER_ROLE_PRIMARY = UniqueKeys0.KEY_USER_ROLE_PRIMARY;
    public static final UniqueKey<YiGroupRecord> KEY_YI_GROUP_PRIMARY = UniqueKeys0.KEY_YI_GROUP_PRIMARY;
    public static final UniqueKey<YiStockRecord> KEY_YI_STOCK_PRIMARY = UniqueKeys0.KEY_YI_STOCK_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<AddressRecord, Long> IDENTITY_ADDRESS = Internal.createIdentity(Address.ADDRESS, Address.ADDRESS.ID);
        public static Identity<ResourceRecord, Long> IDENTITY_RESOURCE = Internal.createIdentity(Resource.RESOURCE, Resource.RESOURCE.ID);
        public static Identity<RoleRecord, Long> IDENTITY_ROLE = Internal.createIdentity(Role.ROLE, Role.ROLE.ID);
        public static Identity<RoleResourceRecord, Long> IDENTITY_ROLE_RESOURCE = Internal.createIdentity(RoleResource.ROLE_RESOURCE, RoleResource.ROLE_RESOURCE.ID);
        public static Identity<StockRecord, Long> IDENTITY_STOCK = Internal.createIdentity(Stock.STOCK, Stock.STOCK.ID);
        public static Identity<StockGroupRecord, Long> IDENTITY_STOCK_GROUP = Internal.createIdentity(StockGroup.STOCK_GROUP, StockGroup.STOCK_GROUP.ID);
        public static Identity<StockPoRecord, Long> IDENTITY_STOCK_PO = Internal.createIdentity(StockPo.STOCK_PO, StockPo.STOCK_PO.ID);
        public static Identity<UserRecord, Long> IDENTITY_USER = Internal.createIdentity(User.USER, User.USER.ID);
        public static Identity<UserAddressRecord, Long> IDENTITY_USER_ADDRESS = Internal.createIdentity(UserAddress.USER_ADDRESS, UserAddress.USER_ADDRESS.ID);
        public static Identity<UserExtRecord, Long> IDENTITY_USER_EXT = Internal.createIdentity(UserExt.USER_EXT, UserExt.USER_EXT.ID);
        public static Identity<UserGroupRecord, Long> IDENTITY_USER_GROUP = Internal.createIdentity(UserGroup.USER_GROUP, UserGroup.USER_GROUP.ID);
        public static Identity<UserRoleRecord, Long> IDENTITY_USER_ROLE = Internal.createIdentity(UserRole.USER_ROLE, UserRole.USER_ROLE.ID);
        public static Identity<YiGroupRecord, Long> IDENTITY_YI_GROUP = Internal.createIdentity(YiGroup.YI_GROUP, YiGroup.YI_GROUP.ID);
        public static Identity<YiStockRecord, Long> IDENTITY_YI_STOCK = Internal.createIdentity(YiStock.YI_STOCK, YiStock.YI_STOCK.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<AddressRecord> KEY_ADDRESS_PRIMARY = Internal.createUniqueKey(Address.ADDRESS, "KEY_address_PRIMARY", new TableField[] { Address.ADDRESS.ID }, true);
        public static final UniqueKey<ResourceRecord> KEY_RESOURCE_PRIMARY = Internal.createUniqueKey(Resource.RESOURCE, "KEY_resource_PRIMARY", new TableField[] { Resource.RESOURCE.ID }, true);
        public static final UniqueKey<RoleRecord> KEY_ROLE_PRIMARY = Internal.createUniqueKey(Role.ROLE, "KEY_role_PRIMARY", new TableField[] { Role.ROLE.ID }, true);
        public static final UniqueKey<RoleResourceRecord> KEY_ROLE_RESOURCE_PRIMARY = Internal.createUniqueKey(RoleResource.ROLE_RESOURCE, "KEY_role_resource_PRIMARY", new TableField[] { RoleResource.ROLE_RESOURCE.ID }, true);
        public static final UniqueKey<StockRecord> KEY_STOCK_PRIMARY = Internal.createUniqueKey(Stock.STOCK, "KEY_stock_PRIMARY", new TableField[] { Stock.STOCK.ID }, true);
        public static final UniqueKey<StockGroupRecord> KEY_STOCK_GROUP_PRIMARY = Internal.createUniqueKey(StockGroup.STOCK_GROUP, "KEY_stock_group_PRIMARY", new TableField[] { StockGroup.STOCK_GROUP.ID }, true);
        public static final UniqueKey<StockPoRecord> KEY_STOCK_PO_PRIMARY = Internal.createUniqueKey(StockPo.STOCK_PO, "KEY_stock_po_PRIMARY", new TableField[] { StockPo.STOCK_PO.ID }, true);
        public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = Internal.createUniqueKey(User.USER, "KEY_user_PRIMARY", new TableField[] { User.USER.ID }, true);
        public static final UniqueKey<UserAddressRecord> KEY_USER_ADDRESS_PRIMARY = Internal.createUniqueKey(UserAddress.USER_ADDRESS, "KEY_user_address_PRIMARY", new TableField[] { UserAddress.USER_ADDRESS.ID }, true);
        public static final UniqueKey<UserExtRecord> KEY_USER_EXT_PRIMARY = Internal.createUniqueKey(UserExt.USER_EXT, "KEY_user_ext_PRIMARY", new TableField[] { UserExt.USER_EXT.ID }, true);
        public static final UniqueKey<UserGroupRecord> KEY_USER_GROUP_PRIMARY = Internal.createUniqueKey(UserGroup.USER_GROUP, "KEY_user_group_PRIMARY", new TableField[] { UserGroup.USER_GROUP.ID }, true);
        public static final UniqueKey<UserRoleRecord> KEY_USER_ROLE_PRIMARY = Internal.createUniqueKey(UserRole.USER_ROLE, "KEY_user_role_PRIMARY", new TableField[] { UserRole.USER_ROLE.ID }, true);
        public static final UniqueKey<YiGroupRecord> KEY_YI_GROUP_PRIMARY = Internal.createUniqueKey(YiGroup.YI_GROUP, "KEY_yi_group_PRIMARY", new TableField[] { YiGroup.YI_GROUP.ID }, true);
        public static final UniqueKey<YiStockRecord> KEY_YI_STOCK_PRIMARY = Internal.createUniqueKey(YiStock.YI_STOCK, "KEY_yi_stock_PRIMARY", new TableField[] { YiStock.YI_STOCK.ID }, true);
    }
}
