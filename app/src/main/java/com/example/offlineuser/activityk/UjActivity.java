package com.example.offlineuser.activityk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class UjActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uj);
    }

        public void onClick(final android.view.View v){
        switch (v.getId()){
            case R.id.button2:
                ImageView kep_csere_zold = (ImageView) findViewById(R.id.imageView);
                kep_csere_zold.setImageResource(R.drawable.zold);
                break;
            case R.id.button3:
                ImageView kep_csere_piros = (ImageView) findViewById(R.id.imageView);
                kep_csere_piros.setImageResource(R.drawable.piros);
                break;
        }
    }
}
