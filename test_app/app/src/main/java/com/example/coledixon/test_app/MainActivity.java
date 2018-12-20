package com.example.coledixon.test_app;

// classes
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

// This is the main activity (the entry point for your app).
// When you build and run the app, the system launches an instance of this Activity and loads its layout.

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.test_app.MESSAGE"; // const

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // called when the user taps the SEND button
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class); // start another activity
        EditText editText = (EditText) findViewById(R.id.txtMess);
        String mess = editText.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, mess);
        startActivity(intent);
    }
}
