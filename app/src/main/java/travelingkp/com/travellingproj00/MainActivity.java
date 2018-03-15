package travelingkp.com.travellingproj00;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    EditText editText;
    String getText;
    ListView listView;
    ArrayList comments = new ArrayList<>();
    int additem;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button2);
        editText = (EditText) findViewById(R.id.editText6);
        listView = (ListView) findViewById(R.id.listview01);

        additem = 0;

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                getText = editText.getText().toString();

                comments.add(getText);


                ListAdapter adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, comments);

                listView.setAdapter(adapter);

                additem++;

            }
        });
    }
}


