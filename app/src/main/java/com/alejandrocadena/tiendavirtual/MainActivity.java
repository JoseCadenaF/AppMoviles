package com.alejandrocadena.tiendavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Product> listProducts = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void loadFakeData(){
        Product producto1 = new Product("Computador Asus", "El mejor computador que puedas comprar",11000000.0,"https://www.clipartmax.com/png/middle/327-3278017_reportar-abuso-bob-esponja-random-png.png");

        Product producto2 = new Product("Teclado Asus","El mejor teclado gamer",800000.0,"https://rampcrosario.com/wp-content/uploads/2019/03/pc-gamer.png");

        Product producto3 = new Product("Mouse Asus","El mejor mouse gamer",300000.0,"https://rampcrosario.com/wp-content/uploads/2019/03/pc-gamer.png");

    }




}