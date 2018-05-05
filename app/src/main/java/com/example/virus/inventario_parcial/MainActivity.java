package com.example.virus.inventario_parcial;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<inventario> lista_inventario;
    RecyclerView recyclerInventario;

    FloatingActionButton agregar_articulo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista_inventario =  new  ArrayList<>();
        recyclerInventario= (RecyclerView) findViewById(R.id.recycler_inventario);
        recyclerInventario.setLayoutManager(new LinearLayoutManager(this));

        llenarInventario();


        adaptador_inventario adapter = new adaptador_inventario(lista_inventario);
        recyclerInventario.setAdapter(adapter);

        agregar_articulo = findViewById(R.id.agregar_btn);

        agregar_articulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,agregar_producto.class);
                startActivity(i);
            }
        });
    }



    private void llenarInventario() {
        lista_inventario.add(new inventario("Lognbo","CR-001",25,19.99,2.99,R.drawable.cr1));
        lista_inventario.add(new inventario("North","CR-002",20,17.99,1.99,R.drawable.cr2));
        lista_inventario.add(new inventario("Lupai","CR-003",15,11.99,0.99,R.drawable.cr3));
        lista_inventario.add(new inventario("Polo","CR-004",5,49.99,12.99,R.drawable.cr4));
        lista_inventario.add(new inventario("Bulova","CR-005",10,189.99,45.99,R.drawable.cr5));
    }
}
