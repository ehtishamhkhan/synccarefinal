package com.pafkiet.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    Integer score;
    Button reset,down,up;
    TextView score_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score=0;
        score_tv=findViewById(R.id.score);
        reset=findViewById(R.id.button_reset);
        down=findViewById(R.id.button_down);
        up=findViewById(R.id.button_up);

        reset.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                score=0;
                score_tv.setText(String.valueOf(score));
            }
        });

        up.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                score++;
                score_tv.setText(String.valueOf(score));
            }
        });

        down.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                if(score>0)
                {
                    score--;
                    score_tv.setText(String.valueOf(score));
                }
            }
        });
    }
}