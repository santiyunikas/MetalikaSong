package com.example.metalikasong;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ManualActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.list_ab,listArray);
        ListView listview =(ListView) findViewById(R.id.listView_ab);
        listview.setAdapter(adapter);
    }

    String[] listArray={"Polibag","Jerami","Pupuk Kandang Kering","Limbah Perikanan Budidaya (Bioflog)","Ember","Cetok","Bakteri EM4 Pertanian","Gunting / Blender","Tampah (Lengser Bambu) / Lengser Plastik"};

}
