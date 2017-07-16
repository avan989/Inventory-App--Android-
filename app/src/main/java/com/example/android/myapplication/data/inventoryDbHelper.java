package com.example.android.myapplication.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class inventoryDbHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = inventoryDbHelper.class.getSimpleName();

    /** Name of the database file */
    private static final String DATABASE_NAME = "inventory.db";

    private static final int DATABASE_VERSION = 1;

    public inventoryDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * This is called when the database is created for the first time.
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create a String that contains the SQL statement to create the pets table
        String SQL_CREATE_INVENTORY_TABLE =  "CREATE TABLE " + inventoryContract.entry.TABLE_NAME + " ("
                + inventoryContract.entry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + inventoryContract.entry.COLUMN_PRODUCT_NAME + " TEST NOT NULL, "
                + inventoryContract.entry.COLUMN_PRODUCT_PRICE + " FLOAT, "
                + inventoryContract.entry.COLUMN_SUPPLIER_CONTACT + " TEXT NOT NULL, "
                + inventoryContract.entry.COLUMN_SUPPLIER_NAME + " TEXT NOT NULL, "
                + inventoryContract.entry.COLUMN_NUMBER_IN_STOCK + " INTEGER, "
                + inventoryContract.entry.COLUMN_NUMBER_IN_SHIPMENT + " INTEGER, "
                + inventoryContract.entry.COLUMN_PICTURE + " TEXT)";

        // Execute the SQL statement
        db.execSQL(SQL_CREATE_INVENTORY_TABLE);
    }
    /**
     * This is called when the database needs to be upgraded.
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // The database is still at version 1, so there's nothing to do be done here.
    }
}

