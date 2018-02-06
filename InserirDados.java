package projetointegrador.com.projetointegrador;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Marcello Icaro on 25/09/2017.
 */

public class InserirDados {

    private SQLiteDatabase conn;

    public InserirDados (SQLiteDatabase conn){this.conn = conn;    }


    public void inserir (Cadastro cadastro){

        ContentValues values = new ContentValues();
        values.put("NOME", cadastro.getNome());
        values.put("ALTURA", cadastro.getAlturaM());
        values.put("PESO", cadastro.getPeso());
        values.put("IMC", cadastro.getImc());

        conn.insertOrThrow("LISTA", null, values);

    }


}
