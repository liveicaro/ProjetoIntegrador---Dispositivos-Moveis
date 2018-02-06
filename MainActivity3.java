package projetointegrador.com.projetointegrador;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import android.database.sqlite.*;
import android.database.*;

public class Main3Activity extends AppCompatActivity {

    private DataBase dataBase;
    private SQLiteDatabase conn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //banco de dados

        try {

            dataBase = new DataBase(this);
            conn = dataBase.getWritableDatabase();

            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage("Conexao criado com sucesso");
            dlg.setNeutralButton("OK", null);
            dlg.show();


        }catch (SQLException ex){

            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage("Erro ao criar o banco"+ex.getMessage());
            dlg.setNeutralButton("OK", null);
            dlg.show();
        }



        final float[] imc = new float[1];

        Button btnCalc = (Button) findViewById(R.id.btnCalc);
        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editPesoF = (TextView) findViewById(R.id.editPesoF);
                TextView editAlturaF = (TextView) findViewById(R.id.editAlturaF);
                TextView textResult = (TextView) findViewById(R.id.textResult);

                ImageView imgResult = (ImageView) findViewById(R.id.imgResultado);


                int peso = Integer.parseInt(editPesoF.getText().toString());
                float altura = Float.parseFloat(editAlturaF.getText().toString());

                imc[0] = peso / (altura * altura);

                if (imc[0] < 19.1) {
                    textResult.setText("Abaixo do Peso");
                    imgResult.setImageResource(R.drawable.abaixo);

                } else {
                    if (imc[0] < 25.8) {
                        textResult.setText("Peso ideal");
                        imgResult.setImageResource(R.drawable.ideal);

                    } else {
                        if (imc[0] < 27.3) {
                            textResult.setText("Pouco acima do peso");
                            imgResult.setImageResource(R.drawable.pouco);

                        } else {
                            if (imc[0] < 32.3) {
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
