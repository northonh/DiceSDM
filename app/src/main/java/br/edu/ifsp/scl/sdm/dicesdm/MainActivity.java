package br.edu.ifsp.scl.sdm.dicesdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    // Gerador de números randômicos usado para simular o lançamento do dado
    private Random geradorRandomico;

    // Referências para as Views do arquivo de layout
    private TextView resultadoTextView;
    private ImageView resultadoImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Após a criação da tela
        geradorRandomico = new Random(System.currentTimeMillis());

        // Recuperando referência para as Views do arquivo de layout
        resultadoTextView = findViewById(R.id.resultadoTextView);
        resultadoImageView = findViewById(R.id.resultadoImageView);
    }

    public void jogarDado(View view){
        if (view.getId() == R.id.jogarDadoButton) {
            int resultado = geradorRandomico.nextInt(6) + 1;

            resultadoTextView.setText(getString(R.string.a_face_sorteada_foi) + resultado);
            switch (resultado) {
                case 1:
                    resultadoImageView.setImageResource(R.drawable.dice_1);
                    break;
                case 2:
                    resultadoImageView.setImageResource(R.drawable.dice_2);
                    break;
                case 3:
                    resultadoImageView.setImageResource(R.drawable.dice_3);
                    break;
                case 4:
                    resultadoImageView.setImageResource(R.drawable.dice_4);
                    break;
                case 5:
                    resultadoImageView.setImageResource(R.drawable.dice_5);
                    break;
                case 6:
                    resultadoImageView.setImageResource(R.drawable.dice_6);
                    break;
            }
        }
    }
}
