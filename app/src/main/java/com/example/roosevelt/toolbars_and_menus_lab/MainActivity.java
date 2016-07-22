package com.example.roosevelt.toolbars_and_menus_lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar mToolbar;
    ImageView mBtnPlay;
    ImageView mBtnAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setCollapsible(true);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Podcast");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mBtnPlay = (ImageView) findViewById(R.id.imgView);
        mBtnAlbum = (ImageView) findViewById(R.id.imgView2);

        mBtnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Play button was clicked", Toast.LENGTH_SHORT).show();
            }
        });
        mBtnAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Album button was clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.podcast_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case android.R.id.home:
                Toast.makeText(this, "Home/Back button was clicked", Toast.LENGTH_SHORT).show();
            case R.id.action_cast:
                Toast.makeText(this, item.getTitle() + " was clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_add:
                Toast.makeText(this, item.getTitle() + " was clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_settings:
                Toast.makeText(this, item.getTitle() + " was clicked", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
