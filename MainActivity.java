package com.example.button1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

class Number
{
    static int[] number = {1,3,5,4,2,8,7,6,10,9};

}

class Min extends Number
{
    static int min = number[0];
    static public int cal_Min()
    {
        for(int i=0;i<number.length;i++)
        {
            if(min > number[i]) min = number[i];
        }
        return min;
    }
}

class Avg extends Number
{
    static int sum = 0;
    static public int cal_Avg()
    {
        sum =0;
        for(int i=0;i<number.length;i++)
        {
            sum += number[i];
        }

        return sum/number.length;
    }
}

public class MainActivity extends AppCompatActivity {







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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

    public void OnGETMIN(View v)
    {
        Toast.makeText(this, "최소값은" + Min.cal_Min() + "입니다.", Toast.LENGTH_LONG).show();

    }

    public void OnGETAVG(View v)
    {
        Toast.makeText(this, "평균은" + Avg.cal_Avg() + "입니다.", Toast.LENGTH_LONG).show();
    }
}
