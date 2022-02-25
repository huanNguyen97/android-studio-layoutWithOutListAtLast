package com.example.imageandswipe;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageButton imageButtonName, imageButtonEmail, imageButtonDoB, imageButtonAddress, imageButtonPhone, imageButtonPassword;
    TextView textView;
    ArrayList<ImageButton> arrayList = new ArrayList<ImageButton>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize data
        imageButtonName = (ImageButton) findViewById(R.id.imageButtonName);
        imageButtonEmail = (ImageButton) findViewById(R.id.imageButtonEmail);
        imageButtonDoB = (ImageButton) findViewById(R.id.imageButtonDoB);
        imageButtonAddress = (ImageButton) findViewById(R.id.imageButtonAddress);
        imageButtonPhone = (ImageButton) findViewById(R.id.imageButtonPhone);
        imageButtonPassword = (ImageButton) findViewById(R.id.imageButtonPassword);
        // End

        arrayList.add(imageButtonName);
        arrayList.add(imageButtonEmail);
        arrayList.add(imageButtonDoB);
        arrayList.add(imageButtonAddress);
        arrayList.add(imageButtonPhone);
        arrayList.add(imageButtonPassword);
    }

    // Worked, but not like pro dev
    public void testBtn(View v) {
        for (ImageButton imageButton : arrayList) {
            if (imageButton.getId() == v.getId()) {
                imageButton.setBackgroundColor(Color.parseColor("#83ba43"));
            } else {
                imageButton.setBackgroundColor(Color.WHITE);
            }
        }
    }
}