package ru.geekbrains.makulin.mycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static String TAG = "textViews";
    private TextView resultView;
    private TextView userActionsView;
    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;
    private Button buttonFour;
    private Button buttonFive;
    private Button buttonSix;
    private Button buttonSeven;
    private Button buttonEight;
    private Button buttonNine;
    private Button buttonZero;
    private Button buttonDot;
    private Button buttonCalculate;
    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonMultiply;
    private Button buttonDivide;
    private Button buttonDelete;
    private Button buttonClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        resultView = findViewById(R.id.result_screen);
        userActionsView = findViewById(R.id.actions_screen);
        buttonOne = findViewById(R.id.button_1);
        buttonTwo = findViewById(R.id.button_2);
        buttonThree = findViewById(R.id.button_3);
        buttonFour = findViewById(R.id.button_4);
        buttonFive = findViewById(R.id.button_5);
        buttonSix = findViewById(R.id.button_6);
        buttonSeven = findViewById(R.id.button_7);
        buttonEight = findViewById(R.id.button_8);
        buttonNine = findViewById(R.id.button_9);
        buttonZero = findViewById(R.id.button_0);
        buttonDot = findViewById(R.id.button_dot);
        buttonCalculate = findViewById(R.id.button_calc);
        buttonPlus = findViewById(R.id.button_plus);
        buttonMinus = findViewById(R.id.button_minus);
        buttonMultiply = findViewById(R.id.button_multiply);
        buttonDivide = findViewById(R.id.button_divide);
        buttonDelete = findViewById(R.id.button_delete);
        buttonClear = findViewById(R.id.button_clear);
    }


    @Override
    public void onClick(View v) {

    }
}