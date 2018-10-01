package com.metorpolitan.dialog;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    CharSequence[] items = {"Fit", "Fakultet za menadzment", "Fakultet digitalnih umetnosti"};
    boolean[] itemsChecked = new boolean [items.length];

    ProgressBar progressDialog;

    final Context context = this;
    private Button button;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btn_dialog1);


     //   showDialog(0);

        // add button listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.dialog);

                Button dialogButton = dialog.findViewById(R.id.btn_ok);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

/*
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.dialog);

                Button dialogButton = dialog.findViewById(R.id.btn_ok);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
            });*/

        }
    }


