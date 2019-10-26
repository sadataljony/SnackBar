package com.sadataljony.app.android.demo.snackbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    LinearLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initialize Linear Layout
        mLayout = findViewById(R.id.layout);
        // initialize Button
        Button mBtn = findViewById(R.id.btnShowSnackBar);
        // apply onClickListener to Button
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar
                        .make(mLayout, "Hi, I am a Snack Bar", Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });
    }
}
