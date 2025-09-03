package br.com.petlove.petlove;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME="PetLove.db";
    public static final int DATABASE_VERSION=1;

    public DBHelper(@Nullable Context context){
        super(context, DATABASE_NAME,null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE Abrigo (" +
                "Id_Abrigo INTEGER PRIMARY KEY AUTOINCREMENT, \" +\n" +
                "  \"Nome_fantasia TEXT, \" +\n" +
                "  \"Razao_social TEXT, \" +\n" +
                "  \"CNPJ TEXT, \" +\n" +
                "  \"Endereco TEXT, \" +\n" +
                "  \"Telefone TEXT)\"); ");
    }
}
