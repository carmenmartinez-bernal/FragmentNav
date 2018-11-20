package com.example.carmen.fragmentnav.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.carmen.fragmentnav.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ManageFragment extends Fragment {

private TextView txtManage;
private Button btnManage;
private ImageView ivImage;
private  Context contexto;

    public ManageFragment() {
        // Required empty public constructor
        contexto=getActivity();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_manage, container, false);
        //Codigo frame fn
        txtManage=rootView.findViewById(R.id.lblManage);
        btnManage=rootView.findViewById(R.id.btnManage);
        ivImage= rootView.findViewById(R.id.ivImagen);

        btnManage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(contexto,"HOLA MUNDO",Toast.LENGTH_LONG).show();
            }
        });
        return  rootView;
    }

}
