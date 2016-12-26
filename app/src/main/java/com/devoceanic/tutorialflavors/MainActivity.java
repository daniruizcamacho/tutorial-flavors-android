package com.devoceanic.tutorialflavors;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String FLAVOR_STANDARD = "standard";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (BuildConfig.FLAVOR == FLAVOR_STANDARD) {
            AlertDialog alertDialog = new AlertDialog.Builder(
                    MainActivity.this).create();
            alertDialog.setTitle("Alert Dialog");
            alertDialog.setMessage("Go to pro version");
            alertDialog.show();
        }
    }

    /**
     * @param v View
     */
    public void buttonClick (View v) {
        AlertDialog alertDialog = new AlertDialog.Builder(
                MainActivity.this).create();
        alertDialog.setTitle("Alert Dialog");
        alertDialog.setMessage("You are in Pro Version");
        alertDialog.show();
    }
}
