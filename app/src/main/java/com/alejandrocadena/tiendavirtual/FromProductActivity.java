package com.alejandrocadena.tiendavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class FromProductActivity extends AppCompatActivity {

    private Button btnSaveForm;
    private TextInputLayout nameTextFailed, descriptionTextFailed, priceTextFiled, imageUrlTextFailed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from_product);

        btnSaveForm = findViewById(R.id.btn_save_product_form);

        nameTextFailed = findViewById(R.id.et_name_product_form);
        descriptionTextFailed = findViewById(R.id.et_description_product_form);
        priceTextFiled = findViewById(R.id.et_price_product_form);
        imageUrlTextFailed = findViewById(R.id.et_image_url_product_form);

        btnSaveForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo lo que escriban de aqui para abajo se activa cuando el usuario haga click en el boton



                String name = nameTextFailed.getEditText().getText().toString().trim();
                String description = descriptionTextFailed.getEditText().getText().toString().trim();
                String price = priceTextFiled.getEditText().getText().toString().trim();
                String urlimage = priceTextFiled.getEditText().getText().toString().trim();

                if(name.isEmpty()){
                    nameTextFailed.setError("Por Favor Ingresar el Nombre");
                    return;
                }else if(name.length()>20){
                    nameTextFailed.setError("Epa se paso de 20");
                }
                if(description.isEmpty()) {
                    nameTextFailed.setError("Por Favor Ingresar la descripcion");
                    return;
                }
                if(price.isEmpty()) {
                    nameTextFailed.setError("Por Favor Ingresar el Precio");
                    return;
                }
                if(urlimage.isEmpty()) {
                    nameTextFailed.setError("Por Favor Ingresar el Url");
                    return;
                }

                Product myNewProduct = new Product("Computador","Descripcion",5000.0,"No hay por ahora");



                Toast.makeText(FromProductActivity.this, "Epa le dio click al Boton", Toast.LENGTH_SHORT).show();
            }
        });

    }
}