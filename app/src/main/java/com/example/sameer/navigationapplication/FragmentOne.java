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
public class FragmentOne extends Fragment {

    ImageView ivIcon;
    TextView tvItemName;

    public static final String Image_resourceId = "iconResouceId";
    public static final String Item_name = "item_name";

    public FragmentOne() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_layout1,container,false);

        ivIcon = (ImageView) view.findViewById(R.id.frag1_icon);
        tvItemName = (TextView) view.findViewById(R.id.frag1_text);

        tvItemName.setText(getArguments().getString(Item_name));
        ivIcon.setImageDrawable(view.getResources().getDrawable(getArguments().getInt(Image_resourceId)));

    return view;


    }
}
