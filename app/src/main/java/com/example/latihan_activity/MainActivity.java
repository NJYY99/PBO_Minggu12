package com.example.latihan_activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{
    Button btnClose, btnStartActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClose = (Button) findViewById(R.id.btn_close);
        btnStartActivity = (Button) findViewById(R.id.btn_start_activity);

        btnClose.setOnClickListener(this);
        btnStartActivity.setOnClickListener(this);

        Toast.makeText(this, "Activity: onCreate()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart(){
        super.onStart();

        Toast.makeText(this, "Activitiy: onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "Activity: onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "Activity: onPause()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "Activity: onStop()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if(id == R.id.btn_start_activity){
            Intent petanikkodeActivity = new Intent(Intent.ACTION_VIEW);
            petanikkodeActivity.setData(Uri.parse("http://petanikode.com"));
            startActivity(petanikkodeActivity);
        }else {
            finish();
        }
    }
}