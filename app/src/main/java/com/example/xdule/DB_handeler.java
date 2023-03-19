package com.example.xdule;

import static com.example.xdule.parametersindb.DB_NAME;
import static com.example.xdule.parametersindb.DB_PATH;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.AutoCompleteTextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DB_handeler extends SQLiteOpenHelper {
    public SQLiteDatabase copyDataBase() throws IOException {

        //Open your local db as the input stream
        InputStream myInput = myContext.getAssets().open(DB_NAME);

        // Path to the just created empty db
        String outFileName = DB_PATH + DB_NAME;

        //Open the empty db as the output stream
        OutputStream myOutput = new FileOutputStream(outFileName);

        //transfer bytes from the inputfile to the outputfile
        byte[] buffer = new byte[1024];
        int length;
        while ((length = myInput.read(buffer))>0){
            myOutput.write(buffer, 0, length);
        }

        //Close the streams
        myOutput.flush();
        myOutput.close();
        myInput.close();

        return null;
    }
    private Context myContext;
    public DB_handeler(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    


    @Override
    public void onCreate(@NonNull SQLiteDatabase db) {


        SQLiteDatabase db1;
        try {
            db1 = copyDataBase();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }







    }
    public String completecommand(AutoCompleteTextView str1, AutoCompleteTextView str2) {

        String command = "Select TIME, CODE, VENUE FROM mytable WHERE DAY='" + str1 + "'" + "AND GROUP='" + str2;
        return command;
    }










    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
