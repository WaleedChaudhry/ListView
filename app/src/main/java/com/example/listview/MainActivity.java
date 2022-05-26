package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.listview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    String[] arr ={"Item1","item2","item3","item4","item5","Item6","item7","item8","item9","Item10","item11","item12","item13"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        /*Using built in array adapters*/
       // ArrayAdapter ad= new ArrayAdapter(this,android.R.layout.simple_list_item_1,arr);
       // binding.listview.setAdapter(ad);
        /*Using custom adapters*/
        WaleedAdapter ad= new WaleedAdapter(this,R.layout.my_waleed_layout,arr);
        binding.listview.setAdapter(ad);
       // binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          //  @Override
            //public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              //  Toast.makeText(getApplicationContext(), "You Clicked on:"+ (i+1), Toast.LENGTH_SHORT).show();

         //   }
        //});

    }
}