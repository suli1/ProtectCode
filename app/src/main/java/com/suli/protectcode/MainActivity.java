package com.suli.protectcode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.suli.protect.Hello;

public class MainActivity extends AppCompatActivity {
  public static final String TAG = MainActivity.class.getName();

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // Example of a call to a native method
    TextView tv = (TextView) findViewById(R.id.sample_text);
    tv.setText(Hello.say());

    findViewById(R.id.btn_hello).setOnClickListener(new View.OnClickListener() {

      @Override public void onClick(View v) {
        new Thread(new Runnable() {
          @Override public void run() {
            for (int i = 0; i < 10000; i++) {
              String hello = Hello.say();
              Log.i(TAG, hello);
            }
          }
        }).start();
      }
    });
  }
}
