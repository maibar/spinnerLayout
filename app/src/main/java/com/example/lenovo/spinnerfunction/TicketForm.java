package com.example.lenovo.spinnerfunction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import android.widget.AdapterView;

public class TicketForm extends AppCompatActivity {


    Spinner dropdownmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_form);

        dropdownmenu = (Spinner) findViewById(R.id.selection_department);
        List<String> list = new ArrayList<>();
        list.add("Kewangan");
        list.add("Asrama");
        list.add("Perpustakaan");
        list.add("JPP");
        list.add("Hal Ehwal Pelajar");
        list.add("CICT");

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        dropdownmenu.setAdapter(adapter);
        dropdownmenu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                String itemvalue = parent.getItemAtPosition(position).toString();
                Toast.makeText(TicketForm.this, "Seleted: " + itemvalue, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });

    }
}


