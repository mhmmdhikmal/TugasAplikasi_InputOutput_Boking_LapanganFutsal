package com.example.inputoutput;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.inputoutput.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText fNama;
    private EditText fBoking;
    private EditText fDP;
    private Button Submit;
    private TextView Idoutnama;
    private TextView Idoutboking;
    private TextView IdoutDP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fNama = findViewById(R.id.idnama);
        fBoking = findViewById(R.id.boking);
        fDP = findViewById(R.id.Bayar_DP);
        Submit = findViewById(R.id.submit);
        Idoutnama = findViewById(R.id.idoutnama);
        Idoutboking = findViewById(R.id.idoutboking);
        IdoutDP = findViewById(R.id.input_dp);

        Submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.submit);
        String inputNama = fNama.getText().toString();
        String inputBoking = fBoking.getText().toString();
        String inputDp = fDP.getText().toString();

        if (inputNama.length()==0){
            fNama.setError("Jangan Lupa Diisi!");
        }else{
            Idoutnama.setText(inputNama);
        }if (inputBoking.length()==0){
            fBoking.setError("Jangan Lupa Diisi!");
        }else{
            Idoutboking.setText(inputBoking);
        }if (inputDp.length()==0) {
            fDP.setError("Jangan Lupa Diisi!");
        }else{
            IdoutDP.setText(inputDp);
        }
    }
}