package com.example.slip2q1;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText inputNumber = findViewById(R.id.inputNumber);
        Button calculateButton = findViewById(R.id.calculateButton);
        calculateButton.setOnClickListener(v -> {
            int num = Integer.parseInt(inputNumber.getText().toString());
            long fact = 1;
            for (int i = 1; i <= num; i++) fact *= i;
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("result", fact);
            startActivity(intent);
        });
    }
}
