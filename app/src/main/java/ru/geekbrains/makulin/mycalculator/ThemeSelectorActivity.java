package ru.geekbrains.makulin.mycalculator;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class ThemeSelectorActivity extends AppCompatActivity implements View.OnClickListener, Constants {


    private RadioButton buttonThemeMain;
    private RadioButton buttonThemeImproved;
    private Button buttonApply;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(getCurrentTheme());
        setContentView(R.layout.activity_theme_selector);
        initButtons();
        initListeners();
        intent = getIntent();

    }

    private int getCurrentTheme() {
        SharedPreferences sp = getSharedPreferences(KEY_SP, MODE_PRIVATE);
        switch (sp.getInt(KEY_CURRENT_THEME, 0)) {
            case THEME_MAIN:
                return R.style.Theme_MyAppStyle;
            case THEME_IMPROVED:
                return R.style.Theme_MyAppStyle_Improved;
        }
        return R.style.Theme_MyAppStyle;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.choose_main_theme_button:
                setCurrentTheme(THEME_MAIN);
                break;
            case R.id.choose_improved_theme_button:
                setCurrentTheme(THEME_IMPROVED);
                break;
            case R.id.apply_theme_button:
                int currentTheme = getCurrentTheme();
                intent.putExtra(KEY_INTENT,currentTheme);
                setResult(RESULT_CODE,intent);
                finish();
                break;
        }
        recreate();

    }

    private void setCurrentTheme(int themeID) {
        SharedPreferences sharedPreferences = getSharedPreferences(KEY_SP, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(KEY_CURRENT_THEME, themeID);
        editor.apply();
    }


    private void initButtons() {
        buttonApply = findViewById(R.id.apply_theme_button);
        buttonThemeMain = findViewById(R.id.choose_main_theme_button);
        buttonThemeImproved = findViewById(R.id.choose_improved_theme_button);
    }

    private void initListeners() {
        buttonApply.setOnClickListener(this);
        buttonThemeMain.setOnClickListener(this);
        buttonThemeImproved.setOnClickListener(this);
    }
}