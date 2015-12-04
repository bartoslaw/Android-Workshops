package com.mooduplabs.myapplication.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.EditText;

import com.mooduplabs.myapplication.R;

public class FragmentsActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);

    }

    private void addFragment(int id){
        //TODO załaduj odpowiedni fragment
    }

}
