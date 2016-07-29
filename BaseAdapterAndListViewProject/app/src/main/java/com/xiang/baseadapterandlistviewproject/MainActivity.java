package com.xiang.baseadapterandlistviewproject;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView list;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list= (ListView) findViewById(R.id.list);
        BaseAdapter adapter=new BaseAdapter() {
            @Override
            public int getCount() {

                return 20;
            }

            @Override
            public Object getItem(int position) {

                return null;
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                //创建LinearLayout  里边有两个控件
                LinearLayout linearLayout=new LinearLayout(MainActivity.this);
                linearLayout.setOrientation(LinearLayout.VERTICAL);
                ImageView imageView=new ImageView(MainActivity.this);
                imageView.setImageResource(R.drawable.c);
                TextView textView=new TextView(MainActivity.this);
                textView.setText("第"+(position+1)+"列表");
                textView.setTextColor(Color.DKGRAY);
                textView.setTextSize(16);
                linearLayout.addView(imageView);
                linearLayout.addView(textView);

                return linearLayout;
            }
        };
        list.setAdapter(adapter);


    }
}
