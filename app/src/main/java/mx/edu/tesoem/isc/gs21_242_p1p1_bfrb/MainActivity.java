package mx.edu.tesoem.isc.gs21_242_p1p1_bfrb;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText txtnum1, txtnum2;
    Button btncalcular;
    TextView lblresultado;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);
        btncalcular = findViewById(R.id.btnsumar);
        lblresultado = findViewById(R.id.lblresultado);

        btncalcular.setOnClickListener(v -> {
                    int num1 = Integer.parseInt(txtnum1.getText().toString());
                    int num2 = Integer.parseInt(txtnum2.getText().toString());

                    lblresultado.setText(" El resultado es " + String.valueOf(num1+num2));
                }
        );
    }
}