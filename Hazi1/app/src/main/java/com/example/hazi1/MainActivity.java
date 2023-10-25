        package com.example.hazi1;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText number1EditText, number2EditText;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1EditText = findViewById(R.id.szam1);
        number2EditText = findViewById(R.id.szam2);
        resultTextView = findViewById(R.id.eredmeny);

        Button addButton = findViewById(R.id.osszeadas);
        Button subtractButton = findViewById(R.id.kivonas);
        Button multiplyButton = findViewById(R.id.szorzas);
        Button divideButton = findViewById(R.id.osztas);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateAndDisplayResult('+');
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateAndDisplayResult('-');
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateAndDisplayResult('*');
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateAndDisplayResult('/');
            }
        });
    }

    private void calculateAndDisplayResult(char operation) {
        try {
            double num1 = Double.parseDouble(number1EditText.getText().toString());
            double num2 = Double.parseDouble(number2EditText.getText().toString());
            double result = 0;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        resultTextView.setText("Hiba: Nullával való osztás!");
                        return;
                    }
                    break;
            }

            resultTextView.setText("Eredmény: " + result);
        } catch (NumberFormatException e) {
            resultTextView.setText("Hiba: Érvénytelen bemenet!");
        }
    }
}
