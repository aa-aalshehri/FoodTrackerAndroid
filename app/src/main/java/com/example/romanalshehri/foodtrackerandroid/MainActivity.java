package com.example.romanalshehri.foodtrackerandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView tv;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.textView);
        et = (EditText) findViewById(R.id.editText);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(et.getText());
            }
        });

        AppCenter.start(getApplication(), "0b87170b-b2dc-4070-9e29-f54086a84053", Analytics.class, Crashes.class);


    }


}
