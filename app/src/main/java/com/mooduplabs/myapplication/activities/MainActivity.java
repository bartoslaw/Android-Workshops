package com.mooduplabs.myapplication.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

import com.mooduplabs.myapplication.R;

public class MainActivity extends AppCompatActivity {

    EditText idInput;
    private Button clickMeButton;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickMeButton = (Button) findViewById(R.id.click_me_button);
        clickMeButton.setOnClickListener(buttonClick());
        idInput = (EditText)findViewById(R.id.input_id);
        webView = (WebView) findViewById(R.id.webview);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
    }



    private View.OnClickListener buttonClick() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Tutaj dodaj przejście do nowu utworzonej aktywności
            }
        };
    }

    public void onClick(View view) {
        loadPage();
    }

    private void loadPage() {
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://mooduplabs.com/");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
