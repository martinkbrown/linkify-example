package co.martinbrown.example.linkify;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.util.Linkify;
import android.widget.EditText;
import android.widget.TextView;

public class LinkifyExampleActivity extends Activity {

    EditText ed;
    TextView tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ed = (EditText) findViewById(R.id.editText1);
        tv = (TextView) findViewById(R.id.textView1);

        ed.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                tv.setText(ed.getText().toString());

                Linkify.addLinks(tv, Linkify.ALL);
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }
}