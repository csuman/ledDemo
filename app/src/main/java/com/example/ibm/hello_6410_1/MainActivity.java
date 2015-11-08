package com.example.ibm.hello_6410_1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends Activity {

    private Button button = null;
    private  boolean isOn = false;
    private CheckBox checkboxLed1 = null;
    private CheckBox checkboxLed2 = null;
    private CheckBox checkboxLed3 = null;
    private CheckBox checkboxLed4 = null;

    class MyButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            isOn = !isOn;
            if (isOn) {
                button.setText("ALL OFF");
                checkboxLed1.setChecked(true);
                checkboxLed2.setChecked(true);
                checkboxLed3.setChecked(true);
                checkboxLed4.setChecked(true);
            }
            else {
                button.setText("ALL ON");
                checkboxLed1.setChecked(false);
                checkboxLed2.setChecked(false);
                checkboxLed3.setChecked(false);
                checkboxLed4.setChecked(false);
            }
        }
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.LED1:
                if (checked) {
                    // Put some meat on the sandwich
                    System.out.println("LED1 on");
                }
                else {
                    // Remove the meat
                    System.out.println("LED1 off");
                }
                break;
            case R.id.LED2:
                if (checked) {
                    // Put some meat on the sandwich
                    System.out.println("LED2 on");
                }
                else {
                    // Remove the meat
                    System.out.println("LED2 off");
                }
                break;

            case R.id.LED3:
                if (checked) {
                    // Put some meat on the sandwich
                    System.out.println("LED3 on");
                }
                else {
                    // Remove the meat
                    System.out.println("LED3 off");
                }
                break;

            case R.id.LED4:
                if (checked) {
                    // Put some meat on the sandwich
                    System.out.println("LED4 on");
                }
                else {
                    // Remove the meat
                    System.out.println("LED4 off");
                }
                break;
            // TODO: Veggie sandwich
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.BUTTON);

        try {
            checkboxLed1 = (CheckBox) findViewById(R.id.LED1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("my checkbox"+checkboxLed1);
        try {
            checkboxLed2 = (CheckBox) findViewById(R.id.LED2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("my checkbox"+checkboxLed2);

        try {
            checkboxLed3 = (CheckBox) findViewById(R.id.LED3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("my checkbox"+checkboxLed3);

        try {
            checkboxLed4 = (CheckBox) findViewById(R.id.LED4);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("my checkbox"+checkboxLed4);

        button.setText("ALL ON");
        button.setOnClickListener(new MyButtonListener());



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
