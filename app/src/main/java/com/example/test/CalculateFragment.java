package com.example.test;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;


public class CalculateFragment extends Fragment {

    Button btnsgp;
    Button btncgp;
    Button logout;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_calculate, container, false);

        btnsgp=(Button) view.findViewById(R.id.btnsgp);
        btncgp=(Button)  view.findViewById(R.id.btncgp);
        logout=(Button) view.findViewById(R.id.logout);

        btnsgp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(getContext(),sgpa.class);
                startActivity(intent);

            }
        }); btncgp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(getContext(),cgpa.class);
                startActivity(intent);

            }
        });
       logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();

                Intent intent =new Intent(getContext(),register.class);
                startActivity(intent);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);


                getActivity().finish();
            }
        });

        // Inflate the layout for this fragment
        return view;
    }
}