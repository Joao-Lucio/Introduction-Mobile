package com.example.introductionmobile;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    RecyclerView recyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.view);
        spinner = findViewById(R.id.spinner);
        spinner();


        RocketModel rocketModel1 = new RocketModel("falcon1","02/10/2018",true,"satelite");
        RocketModel rocketModel2 = new RocketModel("falcon 9","03/10/2017",true,"Supplies");
        RocketModel rocketModel3 = new RocketModel("dragon","10/09/2016",true,"satelite");

        ArrayList<RocketModel> rocketModels = new ArrayList<>();
        rocketModels.add(rocketModel1);
        rocketModels.add(rocketModel2);
        rocketModels.add(rocketModel3);

        RecyclerAdapter adapter = new RecyclerAdapter(rocketModels);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    private void spinner(){
        String[] stringList = {"Item 1", "Item 2", "Item 3", "Item 4"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, stringList);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter1);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();

                Toast.makeText(MainActivity.this, "You selected: " + selectedItem, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}