package com.example.huyen.metarialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.item1_id){
            Toast.makeText(getApplicationContext(),"item 1 is selected",Toast.LENGTH_SHORT).show();
        }else if(id == R.id.item2_id){
            Toast.makeText(getApplicationContext(),"item 2 is selected",Toast.LENGTH_SHORT).show();
        }else if(id == R.id.item3_id){
            Toast.makeText(getApplicationContext(),"item 3 is selected",Toast.LENGTH_SHORT).show();
        }else if(id == R.id.search_id){
            Toast.makeText(getApplicationContext(),"Search",Toast.LENGTH_SHORT).show();
        }else if(id == R.id.cart_id){
            Toast.makeText(getApplicationContext(),"Cart",Toast.LENGTH_SHORT).show();
        }else if(id == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
