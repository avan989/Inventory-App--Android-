package com.example.android.myapplication.data;

import android.provider.BaseColumns;

/**
 * Created by anh on 3/27/17.
 */

public class inventoryContract {

        private inventoryContract(){}

    //constant for the column

        public static final class entry implements BaseColumns {

            public final static String _ID=BaseColumns._ID;
            public final static String TABLE_NAME = "Inventory";
            public final static String COLUMN_PRODUCT_NAME="Product Name";
            public final static String COLUMN_PRODUCT_PRICE="Product Price";
            public final static String COLUMN_SUPPLIER_NAME="Supplier's Name";
            public final static String COLUMN_SUPPLIER_CONTACT="Supplier's Contact";
            public final static String COLUMN_NUMBER_IN_STOCK="Number in Stock";
            public final static String COLUMN_NUMBER_IN_SHIPMENT="Number in shipment";
            public final static String COLUMN_PICTURE="Picture";

        }
    }


