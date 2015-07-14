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
public class FragmentTwo extends Fragment{

    ImageView ivIcon;
    TextView tvItText;


    public final static String Image_resource_id = "iconResourceId";
    public final static String Item_name ="itemName";

    public FragmentTwo() {

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_layout2,container,false);

        ivIcon = (ImageView) view.findViewById(R.id.frag2_icon);
        tvItText = (TextView) view.findViewById(R.id.frag2_text);

        tvItText.setText(getArguments().getString(Item_name));
        ivIcon.setImageDrawable(view.getResources().getDrawable(getArguments().getInt(Image_resource_id)));
        return view;

    }
}
