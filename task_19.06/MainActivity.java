package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button trueBtn;
    private Button falseBtn;
    private TextView questionTextView;
    private Question[] questionBank = new Question[]{
            new Question(R.string.question_text,true),
            new Question(R.string.question_text1,false),
            new Question(R.string.question_text2,false),
            new Question(R.string.question_text3,false),
            new Question(R.string.question_text4,true)
    };
    private int currentIndex = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        trueBtn = (Button) findViewById(R.id.true_btn);
        falseBtn = (Button) findViewById(R.id.false_btn);
        questionTextView = (TextView) findViewById(R.id.question_text_view);
        int question = questionBank[currentIndex].getTextResId();
        questionTextView.setText(question);

        trueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (questionBank[currentIndex].isAnswerTrue())
                    Toast.makeText(MainActivity.this,R.string.correct_toast,Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,R.string.incorrect_toast,Toast.LENGTH_SHORT).show();

                currentIndex = currentIndex + 1; //подумать как избежать ошибки выход за пределы массива
                int question = questionBank[currentIndex].getTextResId();
                questionTextView.setText(question);
            }
        });
        falseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (questionBank[currentIndex].isAnswerTrue())
                    Toast.makeText(MainActivity.this,R.string.incorrect_toast,Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,R.string.correct_toast,Toast.LENGTH_SHORT).show();

                currentIndex = currentIndex + 1; //подумать как избежать ошибки выход за пределы массива
                int question = questionBank[currentIndex].getTextResId();
                questionTextView.setText(question);
            }
        });
    }
}
