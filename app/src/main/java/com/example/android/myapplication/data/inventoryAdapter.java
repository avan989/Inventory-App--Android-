package com.example.android.myapplication.data;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;

import com.example.android.inventory.R;


/**
 * Created by anh on 3/27/17.
 */

public class inventoryAdapter extends CursorAdapter{

    public inventoryAdapter(Context context, Cursor cursor){
        super(context, cursor, 0);
    }


//inflate view
    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.listview, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor curso

    }
}