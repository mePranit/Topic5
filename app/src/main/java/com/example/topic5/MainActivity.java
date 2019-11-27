package com.example.topic5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rcView);

        List<Contacts>contactsList=new ArrayList<>();
        contactsList.add(new Contacts("Virat","India",R.drawable.virat));
        contactsList.add(new Contacts("Charli","London",R.drawable.charli));
        contactsList.add(new Contacts("joker","Hollyhood",R.drawable.joker));

        ContactsAdapter contactsAdapter=new ContactsAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        

    }
}
