package com.example.admin.simpleadapter;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import android.widget.Toast;
public class MainActivity extends Activity {
    private String[] names = new String[]{"tiger", "cat", "dog", "elephant","lion","monkey"};

    private int[] imageIds = new int[]
            {R.drawable.tiger, R.drawable.cat,
                    R.drawable.dog, R.drawable.elephant,R.drawable.lion,R.drawable.monkey};

    @Override
    public void onCreate(Bundle savedInstancesState) {
        super.onCreate(savedInstancesState);
        setContentView(R.layout.activity_main);
        List<Map<String, Object>> listItems =
                new ArrayList<Map<String, Object>>();
        for (int i = 0; i < names.length; i++) {
            Map<String, Object> listItem = new HashMap<>();

            listItem.put("personName", names[i]);

            listItem.put("header", imageIds[i]);

            listItems.add(listItem);
        }

        //
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, listItems,
                R.layout.simple_item,
                new String[]{"personName", "header"},
                new int[]{R.id.name, R.id.header});
        ListView list = (ListView) findViewById(R.id.mylist);
        list.setAdapter(simpleAdapter);












    }






}



