package projetointegrador.com.projetointegrador;

/**
 * Created by Marcello Icaro on 25/09/2017.
 */

import android.content.Context;
import android.database.sqlite.*;


public class DataBase extends SQLiteOpenHelper {


    public DataBase (Context context)
    {
        super(context, "LISTA", null, 1);
    }

    @Override
    public void onCreate (SQLiteDatabase db){

     db.execSQL(ScriptSQL.getCreateLista());

    }

    @Override
    public  void onUpgrade (SQLiteDatabase db, int oldVersion, int newVersion){

    }

}
