package projetointegrador.com.projetointegrador;

/**
 * Created by Marcello Icaro on 25/09/2017.
 */

public class ScriptSQL {


    public static String getCreateLista(){

        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("CREATE TABLE IF NOT EXISTS LISTA ( ");
        sqlBuilder.append("_id              INTEGER             NOT NULL ");
        sqlBuilder.append("PRIMARY KEY AUTOINCREMENT, ");
        sqlBuilder.append("NOME             VARCHAR(256), ");
        sqlBuilder.append("ALTURA           FLOAT, ");
        sqlBuilder.append("PESO             FLOAT, ");
        sqlBuilder.append("IMC              FLOAt " );
        sqlBuilder.append(");");

        return sqlBuilder.toString();

    }


}
