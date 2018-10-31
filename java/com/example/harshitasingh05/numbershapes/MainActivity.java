package com.example.harshitasingh05.numbershapes;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    public class Shape {

        Scanner sc = new Scanner(System.in);

       int num ;

        int sum = 1;
        int increnum = 1;

        boolean isTriangular()
        {
            while(sum < num)
            {
                increnum ++;
                sum = sum + increnum;
            }
            if(sum == num)
                return true;
            else
                return false;
        }

        boolean isSquare()
        {
            double var =  Math.sqrt(num);

            if(var == Math.floor(var))
            {
                return true;
            }
            else
                return false;
        }

    }

    public void onButtonClick(View v) {
        EditText e1 = (EditText) findViewById(R.id.editText2);

        //creation of object of class Shape!
        Shape obj = new Shape();

        //change the user input to text String then to Integer type!
        obj.num = Integer.parseInt(e1.getText().toString());


        if (obj.isSquare())
        {
            if (obj.isTriangular())
                /* use Toast method instead of using message format. */
                Toast.makeText(this, obj.num + " is triangular and square both !!", Toast.LENGTH_SHORT).show();
            else {
                Toast.makeText(this, obj.num + " is only square number ! ", Toast.LENGTH_SHORT).show();
            }
        }
           else
            {
                if(obj.isTriangular())
                {
                    Toast.makeText(this, obj.num + " is only triangular !!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(this, obj.num + " is neither square nor triangular !", Toast.LENGTH_SHORT).show();
                }

            }
        e1.setText("");
        }





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

}
