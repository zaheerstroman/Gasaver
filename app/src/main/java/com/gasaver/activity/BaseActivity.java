package com.gasaver.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.widget.ImageView;
import android.widget.TextView;

public class BaseActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_base);
//    }

    public void setTitle(int toolbarId,int titleId, String title, int btnDrawable, int colorBg, int titleColor){
        Toolbar toolbar = (Toolbar) findViewById(toolbarId);
        toolbar.setBackgroundResource(colorBg);

        setSupportActionBar(toolbar);

        TextView pageTitle = (TextView) toolbar.findViewById(titleId);
        pageTitle.setText(title);
        pageTitle.setTextColor(getResources().getColor(titleColor));
//        getSupportActionBar().setTitle("");
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setHomeAsUpIndicator(btnDrawable);
    }
    public void setTitleHome(int toolbarId,int image, int btnDrawable, int imageTitle){
        Toolbar toolbar = (Toolbar) findViewById(toolbarId);
        setSupportActionBar(toolbar);
        ImageView pageTitle = (ImageView) toolbar.findViewById(image);
        pageTitle.setImageResource(imageTitle);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setHomeAsUpIndicator(btnDrawable);
//        getSupportActionBar().setTitle("");
    }

}