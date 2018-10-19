package edu.android.teamproject_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private TextView textKim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        textView.setText("훈식아 PPT 만들어 // 최소한 선택권은 주세요....!!!");

        textKim = findViewById(R.id.textKim);
        textKim.setText("롤 똥쟁이 오훈식");

    }
}
