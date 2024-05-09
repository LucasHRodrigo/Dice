package com.lucas.dice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public ImageButton imageButtond4;
    public ImageButton imageButtond6;
    public ImageButton imageButtond8;
    public ImageButton imageButtond10;
    public ImageButton imageButtond12;
    public ImageButton imageButtond20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButtond4 = findViewById(R.id.imageButtond4);
        imageButtond4.setOnClickListener(this);

        imageButtond6 = findViewById(R.id.imageButtond6);
        imageButtond6.setOnClickListener(this);

        imageButtond8 = findViewById(R.id.imageButtond8);
        imageButtond8.setOnClickListener(this);

        imageButtond10 = findViewById(R.id.imageButtond10);
        imageButtond10.setOnClickListener(this);

        imageButtond12 = findViewById(R.id.imageButtond12);
        imageButtond12.setOnClickListener(this);

        imageButtond20 = findViewById(R.id.imageButtond20);
        imageButtond20.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.imageButtond4) {
            Random random = new Random();
            String dado = Integer.toString(random.nextInt(4));
            if (Integer.parseInt(dado) == 0) {
                dado = Integer.toString(1);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Rolagem");
            builder.setMessage(dado);
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        if (view.getId() == R.id.imageButtond6) {
            Random random = new Random();
            String dado = Integer.toString(random.nextInt(6));
            if (Integer.parseInt(dado) == 0) {
                dado = Integer.toString(1);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Rolagem");
            builder.setMessage(dado);
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        if (view.getId() == R.id.imageButtond8) {
            Random random = new Random();
            String dado = Integer.toString(random.nextInt(8));
            if (Integer.parseInt(dado) == 0) {
                dado = Integer.toString(1);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Rolagem");
            builder.setMessage(dado);
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        if (view.getId() == R.id.imageButtond10) {
            Random random = new Random();
            String dado = Integer.toString(random.nextInt(10));
            if (Integer.parseInt(dado) == 0) {
                dado = Integer.toString(1);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Rolagem");
            builder.setMessage(dado);
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        if (view.getId() == R.id.imageButtond12) {
            Random random = new Random();
            String dado = Integer.toString(random.nextInt(12));
            if (Integer.parseInt(dado) == 0) {
                dado = Integer.toString(1);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Rolagem");
            builder.setMessage(dado);
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        if (view.getId() == R.id.imageButtond20) {
            Random random = new Random();
            String dado = Integer.toString(random.nextInt(20));
            if (Integer.parseInt(dado) == 0) {
                dado = Integer.toString(1);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Rolagem");
            builder.setMessage(dado);
            AlertDialog dialog = builder.create();
            dialog.show();
        }
    }
}
