package es.ieslavereda.myreciclerview_22_23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputEditText;

public class FormularioActivity extends AppCompatActivity {

    private Spinner spinner;
    private TextInputEditText tietNombre;
    private TextInputEditText tietApellidos;
    private Button buttonAceptar;
    private Button buttonCancelar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        spinner = findViewById(R.id.spinner);
        tietNombre = findViewById(R.id.tietNombre);
        tietApellidos = findViewById(R.id.tietApellidos);
        buttonAceptar = findViewById(R.id.buttonAceptar);
        buttonCancelar = findViewById(R.id.buttonCancelar);

        ArrayAdapter<Profesion> myAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                ProfesionRepository.getInstance().getAll());
        spinner.setAdapter(myAdapter);

        buttonCancelar.setOnClickListener( v ->
        {
            Intent i = new Intent();
            setResult(RESULT_CANCELED,i);
            finish();
        });

        buttonAceptar.setOnClickListener( v->{
            Intent i = new Intent();
            String nombre = tietNombre.getText().toString();
            String apellidos = tietApellidos.getText().toString();
            Profesion profesion = (Profesion) spinner.getSelectedItem();

            i.putExtra("usuario",new Usuario(nombre,apellidos,profesion.getImage()));
            setResult(RESULT_OK,i);
            finish();
        });

    }
}