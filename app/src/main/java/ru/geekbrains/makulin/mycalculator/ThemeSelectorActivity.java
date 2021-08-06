package ru.geekbrains.makulin.mycalculator;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class ThemeSelectorActivity extends AppCompatActivity implements View.OnClickListener {

    private static final int THEME_MAIN = 0;
    private static final int THEME_IMPROVED = 1;
    private static final String KEY_SP = "SP Key";
    private static final String KEY_CURRENT_THEME = "Current theme";
    private RadioButton buttonThemeMain;
    private RadioButton buttonThemeImproved;
    private Button buttonApply;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(getCurrentTheme());
        setContentView(R.layout.activity_theme_selector);
        initButtons();
        initListeners();
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
//            case R.id.apply_theme_button:
//
//                break;
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