package com.example.admin.the_wildo_admin.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.admin.the_wildo_admin.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class JobsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Jobs");

        myRef.setValue("Jobs");
    }
}
