package ru.geekbrains.makulin.mycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "textViews";
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
    private Calculator calculator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListeners();
        calculator = new Calculator();
        setContent();


    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable(TAG, calculator);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        calculator = savedInstanceState.getParcelable(TAG);
        setContent();
    }

    private void setContent() {
        resultView.setText(String.valueOf(calculator.getResultView()));
        userActionsView.setText(String.valueOf(calculator.getUserActionsText()));
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

    private void onToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void initListeners() {
        resultView.setOnClickListener(this);
        userActionsView.setOnClickListener(this);
        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
        buttonFour.setOnClickListener(this);
        buttonFive.setOnClickListener(this);
        buttonSix.setOnClickListener(this);
        buttonSeven.setOnClickListener(this);
        buttonEight.setOnClickListener(this);
        buttonNine.setOnClickListener(this);
        buttonZero.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
        buttonCalculate.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonDelete.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_0:
                onToast("Zero");

                setContent();
                break;
            case R.id.button_1:
                onToast("One");

                setContent();
                break;
            case R.id.button_2:
                onToast("Two");

                setContent();
                break;
            case R.id.button_3:
                onToast("Three");

                setContent();
                break;
            case R.id.button_4:
                onToast("Four");

                setContent();
                break;
            case R.id.button_5:
                onToast("Five");

                setContent();
                break;
            case R.id.button_6:
                onToast("Six");

                setContent();
                break;
            case R.id.button_7:
                onToast("Seven");

                setContent();
                break;
            case R.id.button_8:
                onToast("Eight");

                setContent();
                break;
            case R.id.button_9:
                onToast("Nine");

                setContent();
                break;
            case R.id.button_calc:
                onToast("Calculation");

                setContent();
                break;
            case R.id.button_clear:
                onToast("Clear");

                setContent();
                break;
            case R.id.button_delete:
                onToast("Delete");

                setContent();
                break;
            case R.id.button_divide:
                onToast("Divide");

                setContent();
                break;
            case R.id.button_dot:
                onToast("Dot");

                setContent();
                break;
            case R.id.button_minus:
                onToast("Minus");

                setContent();
                break;
            case R.id.button_multiply:
                onToast("Multiply");

                setContent();
                break;
            case R.id.button_plus:
                onToast("Plus");

                setContent();
                break;
            default:
                break;
        }

    }
}