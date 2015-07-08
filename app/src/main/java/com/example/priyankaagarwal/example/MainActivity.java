package com.example.priyankaagarwal.example;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Integer.parseInt;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void add(View view) {
        EditText n1=(EditText)findViewById(R.id.editText);
        EditText n2=(EditText)findViewById(R.id.editText2);
        TextView res=(TextView)findViewById(R.id.textView2);

        int n1v=Integer.parseInt(n1.getText().toString());
        int n2v=Integer.parseInt(n2.getText().toString());

        int resv = n1v+n2v;

        res.setText(""+resv);
//        res=(TextView)(n1.getText()+n2.getText());


    }
    public void mul(View view) {
        EditText n1=(EditText)findViewById(R.id.editText);
        EditText n2=(EditText)findViewById(R.id.editText2);
        TextView res=(TextView)findViewById(R.id.textView2);

        int n1v=Integer.parseInt(n1.getText().toString());
        int n2v=Integer.parseInt(n2.getText().toString());

        int resv = n1v*n2v;

        res.setText(""+resv);
//        res=(TextView)(n1.getText()+n2.getText());


    }
    public void sub(View view) {
        EditText n1=(EditText)findViewById(R.id.editText);
        EditText n2=(EditText)findViewById(R.id.editText2);
        TextView res=(TextView)findViewById(R.id.textView2);

        int n1v=Integer.parseInt(n1.getText().toString());
        int n2v=Integer.parseInt(n2.getText().toString());

        int resv = n1v-n2v;

        res.setText(""+resv);
//        res=(TextView)(n1.getText()+n2.getText());


    }
    public void div(View view) {
        EditText n1=(EditText)findViewById(R.id.editText);
        EditText n2=(EditText)findViewById(R.id.editText2);
        TextView res=(TextView)findViewById(R.id.textView2);

        int n1v=Integer.parseInt(n1.getText().toString());
        int n2v=Integer.parseInt(n2.getText().toString());

        int resv = n1v/n2v;

        res.setText(""+resv);
//        res=(TextView)(n1.getText()+n2.getText());


    }
}
