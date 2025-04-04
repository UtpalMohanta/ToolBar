package com.example.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       toolbar=findViewById(R.id.tool_Bar);

       setSupportActionBar(toolbar);

       if(getSupportActionBar()!=null)
       {
           getSupportActionBar().setDisplayHomeAsUpEnabled(true);
           getSupportActionBar().setTitle("ToolBar");
       }
      toolbar.setSubtitle("Utpal's");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        new MenuInflater(this).inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int itemId=item.getItemId();

        if(itemId==R.id.folDer)
        {
            Toast.makeText(this, "Create folder", Toast.LENGTH_SHORT).show();
        }
        else if(itemId==android.R.id.home)
        {
            super.onBackPressed();
        }
        else{
            Toast.makeText(this, "Search Option", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
    /*
    class MainActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.tool_Bar)
        setSupportActionBar(toolbar)

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = "ToolBar"
        }
        toolbar.subtitle = "Utpal's"
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        MenuInflater(this).inflate(R.menu.option_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.folDer -> {
                Toast.makeText(this, "Create folder", Toast.LENGTH_SHORT).show()
                true
            }
            android.R.id.home -> {
                onBackPressed()
                true
            }
            else -> {
                Toast.makeText(this, "Search Option", Toast.LENGTH_SHORT).show()
                super.onOptionsItemSelected(item)
            }
        }
    }
}
     */
}