package com.example.activitystatesavetwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.annotation.NonNull;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private CheckBox checkBox;
    private static final String EDIT_TEXT_STATE_KEY = "edit_text_state";
    private static final String CHECKBOX_STATE_KEY = "checkbox_state";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        checkBox = findViewById(R.id.checkBox);


        if (savedInstanceState != null) {
            // Állapot visszaállítása
            String editTextState = savedInstanceState.getString(EDIT_TEXT_STATE_KEY);
            boolean checkBoxState = savedInstanceState.getBoolean(CHECKBOX_STATE_KEY);

            editText.setText(editTextState);
            checkBox.setChecked(checkBoxState);
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        String editTextState = editText.getText().toString();
        boolean checkBoxState = checkBox.isChecked();

        outState.putString(EDIT_TEXT_STATE_KEY, editTextState);
        outState.putBoolean(CHECKBOX_STATE_KEY, checkBoxState);
    }
}
