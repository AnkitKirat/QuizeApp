package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView text,text2;
    Button b,b1,b2;
    private  String[] questions = {"1.Enumerations are a special data type in Java that allows for a variable to be set to a predefined variable?",
    "2. int x[] = new int[]{10,20,30};<br><br>Arrays can also be created and initialize as in above statement?",
    "3.Constructor overloading is not possible in Java?",
    "4.Assignment operator is evaluated Left to Right?",
    "5.Variable name can begin with a letter, \"$\", or \"_\"",
     "6.java is invented in 1998?"
    };
    private  boolean [] answer = {true,true,false,false,true,false};
    private  int score=0,index=0,q=questions.length;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textView);
        text2 = findViewById(R.id.textView2);
        b = findViewById(R.id.button);
        b1 = findViewById(R.id.button2);
        b2 = findViewById(R.id.button3);
        text.setText(questions[index]);
        text2.setText(index+1 +"/"+q);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index <= questions.length-1) {
                    if (answer[index]== true) {
                        score++;
                    }

                }
                ++index;
                if (index <= questions.length-1) {
                    text.setText(questions[index]);
                    text2.setText(index+1 +"/"+q);
                }
                else{
                    Toast.makeText(MainActivity.this, "Your Score Is "+ score+"/"+ questions.length, Toast.LENGTH_SHORT).show();
                }

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index <= questions.length-1) {
                    if (answer[index]== false) {
                        score++;
                    }

                }
                ++index;
                if (index <= questions.length-1) {
                    text.setText(questions[index]);
                    text2.setText(index+1 +"/"+q);
                }
                else{
                    Toast.makeText(MainActivity.this, "Your Score Is "+ score+"/"+ questions.length, Toast.LENGTH_SHORT).show();
                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index=0;
                score=0;
                text.setText(questions[index]);
                text2.setText(index+1  +"/"+q);
            }
        });



    }
}