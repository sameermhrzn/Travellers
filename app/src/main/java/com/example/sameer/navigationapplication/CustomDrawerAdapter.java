package com.example.sameer.navigationapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sameer on 7/13/2015.
 */
public class CustomDrawerAdapter extends ArrayAdapter<Drawer_Item> {

    Context context;
    List<Drawer_Item> arrayList;
    int layoutResourceId;

    public CustomDrawerAdapter(Context context, int layoutResourceId, List<Drawer_Item> listItem) {
        super(context, layoutResourceId, listItem);
        this.context = context;
        this.arrayList = listItem;
        this.layoutResourceId = layoutResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        DrawerItemHolder drawerHolder;
        View view = convertView;

        if (view == null){

            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            drawerHolder = new DrawerItemHolder();

            view= inflater.inflate(layoutResourceId, parent, false);
            drawerHolder.icon =(ImageView) view.findViewById(R.id.drawer_icon);
            drawerHolder.ItemName = (TextView) view.findViewById(R.id.drawer_text);
            view.setTag(drawerHolder);


        }
        else {
            drawerHolder= (DrawerItemHolder)view.getTag();
        }

        Drawer_Item dItem = (Drawer_Item) this.arrayList.get(position);

        drawerHolder.icon.setImageDrawable(view.getResources().getDrawable(dItem.getIvIcon()));
        drawerHolder.ItemName.setText(dItem.getTvItemName());

        return view;
    }

    private static class DrawerItemHolder {
        TextView ItemName;
        ImageView icon;


    }

    }

