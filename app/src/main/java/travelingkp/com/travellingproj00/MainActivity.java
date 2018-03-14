package travelingkp.com.travellingproj00;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.System.out;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    EditText editText;
    String getText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button2);
        textView = (TextView) findViewById(R.id.textView3);
        editText = (EditText) findViewById(R.id.editText6);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getText = editText.getText().toString();
                textView.setText(getText);
            }
        });
    }
}


