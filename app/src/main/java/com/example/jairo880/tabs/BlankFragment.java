package com.example.jairo880.tabs;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class BlankFragment extends Fragment{


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    TextView textView;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view2 = inflater.inflate(R.layout.fragment_blank, container, false);

         textView = (TextView) view2.findViewById(R.id.txt1);
        button = (Button) view2.findViewById(R.id.Button1);

        textView.setText("Tu tia la coja 1");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        mostrar();
                    }
                });
            }
        });

        return view2;

    }

    private void mostrar() {
        Toast.makeText(getActivity(), "Tu tia la coja desde el mètodo asyncrono", Toast.LENGTH_SHORT).show();
    }


}