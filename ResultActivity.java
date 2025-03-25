package com.example.slip2q1;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class ResultActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        long result = getIntent().getLongExtra("result", 1);
        ((TextView) findViewById(R.id.resultText)).setText("Factorial: " + result);
    }
}
