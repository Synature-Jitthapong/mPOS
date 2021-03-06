package com.synature.mpos.database.table;

import android.database.sqlite.SQLiteDatabase;

public class OrderDetailTable extends BaseColumn{

	public static final String TABLE_ORDER = "OrderDetail";
	public static final String COLUMN_ORDER_ID = "order_detail_id";
	public static final String COLUMN_ORDER_QTY = "order_qty";
	public static final String COLUMN_TOTAL_RETAIL_PRICE = "total_retail_price";
	public static final String COLUMN_TOTAL_SALE_PRICE = "total_sale_price";
	public static final String COLUMN_TOTAL_VAT = "total_vat_amount";
	public static final String COLUMN_TOTAL_VAT_EXCLUDE = "total_vat_amount_exclude";
	public static final String COLUMN_MEMBER_DISCOUNT = "member_discount_amount";
	public static final String COLUMN_PRICE_DISCOUNT = "price_discount_amount";
	public static final String COLUMN_PRICE_OR_PERCENT = "price_or_percent";
	public static final String COLUMN_DEDUCT_AMOUNT = "deduct_amount";
	public static final String COLUMN_PARENT_ORDER_ID = "parent_order_id";

	private static final String ORDER_SQL_CREATE = 
			" create table " + TABLE_ORDER + " ( " 
			+ COLUMN_ORDER_ID + " integer not null, "
			+ OrderTransTable.COLUMN_TRANS_ID + " integer not null, "
			+ ComputerTable.COLUMN_COMPUTER_ID + " integer not null, "
			+ ProductTable.COLUMN_PRODUCT_ID + " integer not null, "
			+ ProductTable.COLUMN_PRODUCT_TYPE_ID + " integer default 0, "
			+ COLUMN_ORDER_QTY + " real default 1, "
			+ ProductTable.COLUMN_PRODUCT_PRICE + " real default 0, "
			+ COLUMN_PRICE_OR_PERCENT + " integer default 2, "
			+ ProductTable.COLUMN_VAT_TYPE + " integer default 1, "
			+ COLUMN_TOTAL_VAT + " real default 0, "
			+ COLUMN_TOTAL_VAT_EXCLUDE + " real default 0, "
			+ COLUMN_MEMBER_DISCOUNT + " real default 0, "
			+ COLUMN_PRICE_DISCOUNT + " real default 0, "
			+ COLUMN_TOTAL_RETAIL_PRICE + " real default 0, "
			+ COLUMN_TOTAL_SALE_PRICE + " real default 0, "
			+ ProductComponentTable.COLUMN_PGROUP_ID + " integer, "
			+ ProductComponentGroupTable.COLUMN_REQ_AMOUNT + " real default 0, " 
			+ ProductComponentGroupTable.COLUMN_REQ_MIN_AMOUNT + " real default 0, "
			+ COLUMN_DEDUCT_AMOUNT + " real default 0,"
			+ ProductTable.COLUMN_SALE_MODE + " integer default 1, "
			+ PromotionPriceGroupTable.COLUMN_PRICE_GROUP_ID + " integer default 0,"
			+ PromotionPriceGroupTable.COLUMN_PROMOTION_TYPE_ID + " integer default 0,"
			+ PromotionPriceGroupTable.COLUMN_COUPON_HEADER + " text,"
			+ COLUMN_PARENT_ORDER_ID + " integer default 0, "
			+ COLUMN_REMARK + " text, " 
			+ " primary key (" + COLUMN_ORDER_ID + " desc));";

	public static void onCreate(SQLiteDatabase db) {
		db.execSQL(ORDER_SQL_CREATE);
	}

	public static void onUpgrade(SQLiteDatabase db, int oldVersion,
			int newVersion) {
	}
}