package com.example.offlineuser.activityk;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void onClick(final android.view.View v){
            switch (v.getId()){
                case R.id.button:
                    Intent UJ_ACTIVITY = new Intent(MainActivity.this, UjActivity.class);
                    startActivity(UJ_ACTIVITY);
                    break;
            }
        }

}
