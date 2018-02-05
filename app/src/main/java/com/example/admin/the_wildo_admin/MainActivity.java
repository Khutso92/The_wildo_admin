package com.example.admin.the_wildo_admin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.admin.the_wildo_admin.activities.ArticleActivity;
import com.example.admin.the_wildo_admin.activities.EventActivity;
import com.example.admin.the_wildo_admin.activities.JobsActivity;
import com.example.admin.the_wildo_admin.activities.StudyActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void GotoJobs(View view) {
        startActivity(new Intent(getApplicationContext(), JobsActivity.class));
    }

    public void GotoArticles(View view) {
        startActivity(new Intent(getApplicationContext(), ArticleActivity.class));
    }

    public void GotoEvent(View view) {
        startActivity(new Intent(getApplicationContext(), EventActivity.class));
    }

    public void GotoStudy(View view) {
        startActivity(new Intent(getApplicationContext(), StudyActivity.class));
    }




}
