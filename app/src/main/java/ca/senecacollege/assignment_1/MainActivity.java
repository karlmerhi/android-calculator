package ca.senecacollege.assignment_1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    static boolean advanced = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void ButtonMethod(View v) {
        Button b = (Button) v;
        String buttonText = b.getText().toString();

        TextView textView = (TextView) this.findViewById(R.id.status_text_view);

        textView.setText(textView.getText().toString() + buttonText + " ");
    }

    public void ClearButton(View v) {
        TextView textView = (TextView) this.findViewById(R.id.status_text_view);

        textView.setText("");

        Button btn0 = (Button) findViewById(R.id.button_zero);
        Button btn1 = (Button) findViewById(R.id.button_one);
        Button btn2 = (Button) findViewById(R.id.button_two);
        Button btn3 = (Button) findViewById(R.id.button_three);
        Button btn4 = (Button) findViewById(R.id.button_four);
        Button btn5 = (Button) findViewById(R.id.button_five);
        Button btn6 = (Button) findViewById(R.id.button_six);
        Button btn7 = (Button) findViewById(R.id.button_seven);
        Button btn8 = (Button) findViewById(R.id.button_eight);
        Button btn9 = (Button) findViewById(R.id.button_nine);
        Button btn_equal = (Button) findViewById(R.id.button_equals);
        Button btn_multiply = (Button) findViewById(R.id.button_multiply);
        Button btn_divide = (Button) findViewById(R.id.button_divide);
        Button btn_add = (Button) findViewById(R.id.button_plus);
        Button btn_subtract = (Button) findViewById(R.id.button_minus);
        Button btn_clear = (Button) findViewById(R.id.button_clear);

        btn0.setEnabled(true);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btn_equal.setEnabled(true);
        btn_multiply.setEnabled(true);
        btn_divide.setEnabled(true);
        btn_add.setEnabled(true);
        btn_subtract.setEnabled(true);
    }

    public void EqualButton(View v) {
        TextView textView = (TextView) this.findViewById(R.id.status_text_view);
        TextView history = (TextView) this.findViewById(R.id.history);

        Calculator calculator = new Calculator();

        if (textView.getText().toString() != "") {
            calculator.push(textView.getText().toString().replaceAll("\\s", ""));
            try {
                int result = calculator.calculate();
                textView.setText(textView.getText().toString() + "= " + result);
            } catch (Exception e) {
                textView.setText(textView.getText().toString() + "= Not an Operator");
            }

            Button btn0 = (Button) findViewById(R.id.button_zero);
            Button btn1 = (Button) findViewById(R.id.button_one);
            Button btn2 = (Button) findViewById(R.id.button_two);
            Button btn3 = (Button) findViewById(R.id.button_three);
            Button btn4 = (Button) findViewById(R.id.button_four);
            Button btn5 = (Button) findViewById(R.id.button_five);
            Button btn6 = (Button) findViewById(R.id.button_six);
            Button btn7 = (Button) findViewById(R.id.button_seven);
            Button btn8 = (Button) findViewById(R.id.button_eight);
            Button btn9 = (Button) findViewById(R.id.button_nine);
            Button btn_equal = (Button) findViewById(R.id.button_equals);
            Button btn_multiply = (Button) findViewById(R.id.button_multiply);
            Button btn_divide = (Button) findViewById(R.id.button_divide);
            Button btn_add = (Button) findViewById(R.id.button_plus);
            Button btn_subtract = (Button) findViewById(R.id.button_minus);

            btn0.setEnabled(false);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            btn_equal.setEnabled(false);
            btn_multiply.setEnabled(false);
            btn_divide.setEnabled(false);
            btn_add.setEnabled(false);
            btn_subtract.setEnabled(false);

            if(advanced) {
                history.setText(history.getText().toString() + "\n" + textView.getText().toString());
            }
        }
    }

    public void AdvancedButton(View v) {

        TextView history = (TextView) this.findViewById(R.id.history);
        Button advanced_button = (Button) findViewById(R.id.button_advanced);
        String colorId = "#FA8072";
        int textColor = android.R.color.white;

        if (advanced) {
            advanced = false;
            history.setText("");
            colorId = "#1E90FF";
            advanced_button.setText("STANDARD - NO HISTORY");
        } else {
            advanced = true;
            advanced_button.setText("ADVANCE - WITH HISTORY");
            textColor = android.R.color.black;
        }

        Button btn0 = (Button) findViewById(R.id.button_zero);
        Button btn1 = (Button) findViewById(R.id.button_one);
        Button btn2 = (Button) findViewById(R.id.button_two);
        Button btn3 = (Button) findViewById(R.id.button_three);
        Button btn4 = (Button) findViewById(R.id.button_four);
        Button btn5 = (Button) findViewById(R.id.button_five);
        Button btn6 = (Button) findViewById(R.id.button_six);
        Button btn7 = (Button) findViewById(R.id.button_seven);
        Button btn8 = (Button) findViewById(R.id.button_eight);
        Button btn9 = (Button) findViewById(R.id.button_nine);
        Button btn_equal = (Button) findViewById(R.id.button_equals);
        Button btn_multiply = (Button) findViewById(R.id.button_multiply);
        Button btn_divide = (Button) findViewById(R.id.button_divide);
        Button btn_add = (Button) findViewById(R.id.button_plus);
        Button btn_subtract = (Button) findViewById(R.id.button_minus);
        Button btn_clear = (Button) findViewById(R.id.button_clear);

        btn0.setBackgroundColor(Color.parseColor(colorId));
        btn1.setBackgroundColor(Color.parseColor(colorId));
        btn2.setBackgroundColor(Color.parseColor(colorId));
        btn3.setBackgroundColor(Color.parseColor(colorId));
        btn4.setBackgroundColor(Color.parseColor(colorId));
        btn5.setBackgroundColor(Color.parseColor(colorId));
        btn6.setBackgroundColor(Color.parseColor(colorId));
        btn7.setBackgroundColor(Color.parseColor(colorId));
        btn8.setBackgroundColor(Color.parseColor(colorId));
        btn9.setBackgroundColor(Color.parseColor(colorId));
        btn_equal.setBackgroundColor(Color.parseColor(colorId));
        btn_multiply.setBackgroundColor(Color.parseColor(colorId));
        btn_divide.setBackgroundColor(Color.parseColor(colorId));
        btn_add.setBackgroundColor(Color.parseColor(colorId));
        btn_subtract.setBackgroundColor(Color.parseColor(colorId));
        btn_clear.setBackgroundColor(Color.parseColor(colorId));

        btn0.setTextColor(getResources().getColor(textColor));
        btn1.setTextColor(getResources().getColor(textColor));
        btn2.setTextColor(getResources().getColor(textColor));
        btn3.setTextColor(getResources().getColor(textColor));
        btn4.setTextColor(getResources().getColor(textColor));
        btn5.setTextColor(getResources().getColor(textColor));
        btn6.setTextColor(getResources().getColor(textColor));
        btn7.setTextColor(getResources().getColor(textColor));
        btn8.setTextColor(getResources().getColor(textColor));
        btn9.setTextColor(getResources().getColor(textColor));
        btn_equal.setTextColor(getResources().getColor(textColor));
        btn_multiply.setTextColor(getResources().getColor(textColor));
        btn_divide.setTextColor(getResources().getColor(textColor));
        btn_add.setTextColor(getResources().getColor(textColor));
        btn_subtract.setTextColor(getResources().getColor(textColor));
        btn_clear.setTextColor(getResources().getColor(textColor));
        advanced_button.setTextColor(getResources().getColor(textColor));

        Toolbar toolbar = (Toolbar) findViewById(R.id.main_toolbar);
        toolbar.setBackgroundColor(Color.parseColor(colorId));
    }

}