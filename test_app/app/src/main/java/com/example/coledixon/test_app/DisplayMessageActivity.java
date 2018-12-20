package com.example.coledixon.test_app;

// classes
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // get the Intent that started the activity and extract the string
        Intent intent = getIntent();
        String mess = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(mess);
    }
}
