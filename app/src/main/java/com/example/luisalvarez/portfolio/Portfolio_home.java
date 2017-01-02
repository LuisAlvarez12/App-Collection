package com.example.luisalvarez.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Portfolio_home extends AppCompatActivity {


    private Button btn_PopularMovies, btn_StockHawk,btn_BuildIt,btn_AppMaterial,
    btn_Ubiquitous,btn_Capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio_home);

        ButtonInstantiator();


    }

    private void ButtonInstantiator() {
        //instantiates buttons for toast message
        btn_PopularMovies = (Button)findViewById(R.id.btn_popular_movies);
        btn_StockHawk = (Button)findViewById(R.id.btn_stock_hawk);
        btn_BuildIt = (Button)findViewById(R.id.btn_build_it);
        btn_AppMaterial = (Button)findViewById(R.id.btn_app_material);
        btn_Ubiquitous = (Button)findViewById(R.id.btn_go_ubiquitous);
        btn_Capstone = (Button)findViewById(R.id.btn_capstone);
    }

    public void ToastMessage(View view){

        try{
            Button b = (Button)view;
            Toast.makeText(this,"This button will launch " + b.getText().toString(),Toast.LENGTH_SHORT).show();
        }catch (Exception e){

        }


    }
}
