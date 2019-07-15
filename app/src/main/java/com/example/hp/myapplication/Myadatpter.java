package com.example.hp.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.hp.myapplication.data.SKU;

public class Myadatpter extends BaseAdapter {

    SKU[] skus;
    Context context;

    public Myadatpter(SKU[] skus, Context context) {
        this.skus = skus;
        this.context = context;
    }

    @Override
    public int getCount() {
        return skus.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return skus.length;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       SKU sku = skus[position];
       LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView =  layoutInflater.inflate(R.layout.custum_view,null);

        TextView textView = convertView.findViewById(R.id.tv1);

        textView.setText(sku.getSKUDescription());
        return convertView;
    }
}
