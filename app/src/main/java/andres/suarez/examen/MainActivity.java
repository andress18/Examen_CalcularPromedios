package andres.suarez.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // Examen de Andres Suarez, 2do parcial
    // materia: Apps Moviles

    private EditText EditTextPrimerParcial, EditTextSegundoParcial, EditTextPresentarPromedio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditTextPrimerParcial = findViewById(R.id.EditTextPrimerParcial);
        EditTextSegundoParcial = findViewById(R.id.EditTextSegundoParcial);
        EditTextPresentarPromedio = findViewById(R.id.EditTextPresentarPromedio);

        Button btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(view -> calcularPromedio());
    }

    private void calcularPromedio() {
        // Obtener valores de los campos de texto
        String primerParcialStr = EditTextPrimerParcial.getText().toString();
        String segundoParcialStr = EditTextSegundoParcial.getText().toString();

        // Convertir a números
        double primerParcial = Double.parseDouble(primerParcialStr);
        double segundoParcial = Double.parseDouble(segundoParcialStr);

        // Calcular promedio
        double promedio = (primerParcial + segundoParcial) / 2;

        // Mostrar el resultado en el campo de Presentar Promedio
        EditTextPresentarPromedio.setText(String.valueOf(promedio));
    }
}