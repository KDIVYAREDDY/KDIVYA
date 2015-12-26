package com.example.jyothi.registrationapplication;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by jyothi on 09-Dec-15.
 */
public class Signin extends android.support.v4.app.Fragment {

    EditText firstname,Lastname,email,password,cnfpwd;
    Button submit;
    TextView fp1;

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.fragmentsignin, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        final Context context = getContext();
        super.onActivityCreated(savedInstanceState);
        fp1 = (TextView) getActivity().findViewById(R.id.fp);
        fp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(context);
                dialog.setTitle("Forgot Password");
                dialog.setContentView(R.layout.forgetpassword);
                EditText edittext=(EditText)dialog.findViewById(R.id.fpet);
                Button button=(Button)dialog.findViewById(R.id.btn);
                dialog.show();
            }
        });
    }
}
