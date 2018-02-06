package projetointegrador.com.projetointegrador;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import android.database.sqlite.*;
import android.database.*;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity {

    private DataBase dataBase;
    private SQLiteDatabase conn;
    private Cadastro cadastro;
    private InserirDados inserirDados;
    private EditText editNome;
    private EditText editAlturaM;
    private EditText editPesoM;
    private EditText editImmc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        final float[] imc = new float[1];

        Button btnCalc = (Button) findViewById(R.id.btnCalc);
        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editPesoM = (TextView) findViewById(R.id.editPesoM);
                TextView editAlturaM = (TextView) findViewById(R.id.editAlturaM);
                TextView editNome = (TextView) findViewById(R.id.editNome);
                TextView textResult = (TextView) findViewById(R.id.textResult);
                ImageView imgResult = (ImageView) findViewById(R.id.imgResultado);

                editNome = (EditText) findViewById(R.id.editNome);
                editAlturaM = (EditText) findViewById(R.id.editAlturaM);
                editPesoM = (EditText) findViewById(R.id.editPesoM);


                int peso = Integer.parseInt(editPesoM.getText().toString());
                float altura = Float.parseFloat(editAlturaM.getText().toString());


                imc[0] = peso / (altura * altura);

                if (imc[0] < 20.7) {
                    textResult.setText("Abaixo do Peso");
                    imgResult.setImageResource(R.drawable.abaixo);

                } else {
                    if (imc[0] < 26.4) {
                        textResult.setText("Peso ideal");
                        imgResult.setImageResource(R.drawable.ideal);

                    } else {
                        if (imc[0] < 27.9) {
                            textResult.setText("Pouco acima do peso");
                            imgResult.setImageResource(R.drawable.pouco);

                        } else {
                            if (imc[0] < 31.1) {
                                textResult.setText("Acimda do peso");
                                imgResult.setImageResource(R.drawable.acima);

                            } else {
                                textResult.setText("Obesidade");
                                imgResult.setImageResource(R.drawable.obeso);

                            }

                        }
                    }
                }


            }


        });

    }

}
