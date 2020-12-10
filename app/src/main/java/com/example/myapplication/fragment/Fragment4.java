package com.example.myapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;


public class Fragment4 extends Fragment {

    TextView texttitle;
    ImageView cacle;
    ImageView tag;
    TextView pwd;
    ImageView caclex;
    ImageView qqlogin;
    Button zxuser;
    View view;




    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment4, null);
        //设置公共布局
        texttitle=(TextView)view.findViewById(R.id.texttitle);
        pwd=(TextView)view.findViewById(R.id.pwdlogin);
        cacle=(ImageView)view.findViewById(R.id.cacle);
        caclex=(ImageView)view.findViewById(R.id.caclex);
        tag=(ImageView) view.findViewById(R.id.tag);
        tag.setVisibility(View.GONE);
        cacle.setVisibility(View.GONE);
        texttitle.setText("我的");
        return view;
    }
}
