package com.example.sameer.navigationapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Sameer on 7/13/2015.
 */
public class FragmentThree extends Fragment {

    TextView tvItemName;
    ImageView ivIcon;

    public final static String Image_resource_id_3="iconResourceId";
    public final static String Item_Name_3 = "itemName";

    public FragmentThree() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_layout3,container,false);

        tvItemName = (TextView) view.findViewById(R.id.frag3_text);
        ivIcon = (ImageView) view.findViewById(R.id.frag3_icon);

        tvItemName.setText(getArguments().getString(Item_Name_3));
        ivIcon.setImageDrawable(view.getResources().getDrawable(getArguments().getInt(Image_resource_id_3)));

        return view;


    }
}
