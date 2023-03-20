package com.example.xdule;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DB_handeler extends SQLiteOpenHelper {

    public String getcommandfrommanactivity(String str){
        return str;
    }



    SQLiteDatabase db1;
    parametersindb pm=new parametersindb();


    public DB_handeler(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }



    @Override
    public void onCreate(@NonNull SQLiteDatabase db) {
        db.execSQL("CREATE TABLE TABLE1 ("+pm.Column1+" TEXT,"+pm.Column2+" VARCHAR,"+pm.Column3+" TEXT,"+pm.Column4+" TEXT,"+pm.Column5+" TEXT,"+pm.Column6+" VARCHAR );");
        db.execSQL("INSERT INTO TABLE1 ("+pm.Column1+","+pm.Column2+","+pm.Column3+","+pm.Column4+","+pm.Column5+","+pm.Column6+") VALUES ('H1', 'MONDAY', 'CCTF', 'CSE', '11:00-13:00', 'PRACTICAL')" );
        db.execSQL("INSERT INTO TABLE1 ("+pm.Column1+","+pm.Column2+","+pm.Column3+","+pm.Column4+","+pm.Column5+","+pm.Column6+") VALUES ('H1','MONDAY','NLH1','MA','14:00-15:00','LECTURE') ," +
               "('H1','MONDAY','NLH1','PH2','15:00-16:00','LECTURE' ),\n" +
                "('H1','MONDAY','NLH1','CSE','16:00-17:00','LECTURE' ),\n" +
                "('H1','MONDAY','GS3','CES1','17:00-18:00','LECTURE' ),\n" +
                "('H1','TUESDAY','NLH2','MED1','9:00-10:00','LECTURE' ),\n" +
                "('H1','TUESDAY','FEW15','PE(EAA-A)','10:00-11:00','LECTURE' ),\n" +
                "('H1','TUESDAY' ,'LAB','CES1','15:00-17:00','PRACTICAL' ),\n" +
                "('H1','WEDNESDAY' ,'LAB','PH2','9:00-11:00','PRACTICAL' ),\n" +
                "('H1','WEDNESDAY','GW6','PH2','14:00- 15:00','TUTORIAL' ),\n" +
                "('H1','WEDNESDAY','NLH1','MED1','15:00-16:00','LECTURE' ),\n" +
                "('H1','WEDNESDAY','NLH1','MA','16:00-17:00','LECTURE' ),\n" +
                "('H1','WEDNESDAY','GS3','CES1','17:00-18:00','LECTURE' ),\n" +
                "('H1','THURSDAY','SEW7','EG','10:00-11:00','LECTURE' ),\n" +
                "('H1','THURSDAY' ,'LAB','MED1','14:00-16:00','PRACTICAL' ),\n" +
                "('H1','THURSDAY','FE17','MA','17:00-18:00','TUTORIAL' ),\n" +
                "('H1','FRIDAY','GS5','PH2','9:00-10:00','LECTURE' ),\n" +
                "('H1','FRIDAY','GS5','PE(EAA-A)','10:00-11:00','LECTURE' ),\n" +
                "('H1','FRIDAY','GS5','CSE','11:00-12:00','LECTURE' ),\n" +
                "('H1','FRIDAY','SEW8','EG','14:00-16:00','PRACTICAL' ),\n" +
                "('H2','MONDAY','SEW7','EG','9:00-11:00','PRACTICAL' ),\n" +
                "('H2','MONDAY','NLH1','MA','14:00-15:00','LECTURE' ),\n" +
                "('H2','MONDAY','NLH1','PH2','15:00-16:00','LECTURE' ),\n" +
                "('H2','MONDAY','NLH1','CSE','16:00-17:00','LECTURE' ),\n" +
                "('H2','MONDAY','GS3','CES1','17:00-18:00','LECTURE' ),\n" +
                "('H2','TUESDAY','NLH2','MED1','9:00-10:00','LECTURE' ),\n" +
                "('H2','TUESDAY','FEW15','PE(EAA-A)','10:00-11:00','LECTURE' ),\n" +
                "('H2','TUESDAY','LAB','CES1','15:00-17:00','PRACTICAL' ),\n" +
                "('H2','WEDNESDAY','LAB','MED1','9:00-11:00','PRACTICAL' ),\n" +
                "('H2','WEDNESDAY','FEW1','MA','14:00-15:00','TUTORIAL' ),\n" +
                "('H2','WEDNESDAY','NLH1','MED1','15:00-16:00','LECTURE' ),\n" +
                "('H2','WEDNESDAY','NLH1','MA','16:00-17:00','LECTURE' ),\n" +
                "('H2','WEDNESDAY','GS3','CES1','17:00-18:00','LECTURE' ),\n" +
                "('H2','THURSDAY','SEW7','EG','10:00-11:00','LECTURE' ),\n" +
                "('H2','THURSDAY','LAB','PH2','11:00-13:00','PRACTICAL' ),\n" +
                "('H2','THURSDAY','CCSF','CSE','14:00-16:00','PRACTICAL' ),\n" +
                "('H2','THURSDAY','SMSLH1','PH2','17:00-18:00','TUTORIAL' ),\n" +
                "('H2','FRIDAY','GS5','PH2','9:00-10:00','LECTURE' ),\n" +
                "('H2','FRIDAY','GS5','PE(EAA-A)','10:00-11:00','LECTURE' ),\n" +
                "('H2','FRIDAY','GS5','CSE','11:00-12:00','LECTURE' ),\n" +
                "('G1','MONDAY','LAB' ,'PH2','9:00-11:00','PRACTICAL' ),\n" +
                "('G1','MONDAY','GS7','PE(EAA-A)','14:00-15:00','LECTURE' ),\n" +
                "('G1','MONDAY','SMSLH1','MA','15:00-16:00','TUTORIAL' ),\n" +
                "('G1','MONDAY','SMSLH1','PH2','16:00-17:00','TUTORIAL' ),\n" +
                "('G1','MONDAY','GS5','CES2','17:00-18:00','LECTURE' ),\n" +
                "('G1','TUESDAY','GS7','PH2','10:00-11:00','LECTURE' ),\n" +
                "('G1','TUESDAY','LAB','CES2','15:00-17:00','PRACTICAL' ),\n" +
                "('G1','WEDNESDAY','NLH1','MED1','9:00-10:00','LECTURE' ),\n" +
                "('G1','WEDNESDAY','GS4','MA','10:00-11:00','LECTURE' ),\n" +
                "('G1','WEDNESDAY','GS4','CSE','11:00-12:00','LECTURE' ),\n" +
                "('G1','WEDNESDAY','NLH1','CES1','12:00-13:00','LECTURE' ),\n" +
                "('G1','WEDNESDAY','GS5','CES2','17:00-18:00','LECTURE' ),\n" +
                "('G1','THURSDAY','NLH1','CSE','9:00-10:00','LECTURE' ),\n" +
                "('G1','THURSDAY','NLH1','MED1','10:00-11:00','LECTURE' ),\n" +
                "('G1','THURSDAY' ,'LAB','CES1','11:00-13:00','PRACTICAL' ),\n" +
                "('G1','THURSDAY','GS4','PH2','14:00-15:00','LECTURE' ),\n" +
                "('G1','THURSDAY','GS4','MA','15:00-16:00','LECTURE' ),\n" +
                "('G1','THURSDAY','SEW7','EG','16:00-17:00','LECTURE' ),\n" +
                "('G1','THURSDAY','NLH2','CES1','17:00-18:00','LECTURE' ),\n" +
                "('G1','FRIDAY','SEW7','EG','9:00-11:00','PRACTICAL' ),\n" +
                "('G1','FRIDAY','GS6','MA','11:00-12:00','LECTURE' ),\n" +
                "('G1','FRIDAY','CCTF','CSE','14:00-16:00','PRACTICAL' ),\n" +
                "('G1','FRIDAY','GS8','PE(EAA-A)','16:00-17:00','LECTURE' ),\n" +
                "('G2','MONDAY','LAB' ,'MED1','11:00-13:00','PRACTICAL' ),\n" +
                "('G2','MONDAY','GS7','PE(EAA-A)','14:00-15:00','LECTURE' ),\n" +
                "('G2','MONDAY','CCSF','CSFS','15:00-17:00','PRACTICAL' ),\n" +
                "('G2','MONDAY','GS5','CES2','17:00-18:00','LECTURE' ),\n" +
                "('G2','TUESDAY','GS7','PH2','10:00-11:00','LECTURE' ),\n" +
                "('G2','TUESDAY','SEW7','EG','11:00-13:00','PRACTICAL' ),\n" +
                "('G2','TUESDAY' ,'LAB','CES2','15:00-17:00','PRACTICAL' ),\n" +
                "('G2','WEDNESDAY','NLH1','MED1','9:00-10:00','LECTURE' ),\n" +
                "('G2','WEDNESDAY','GS4','MA','10:00-11:00','LECTURE' ),\n" +
                "('G2','WEDNESDAY','GS4','CSE','11:00-12:00','LECTURE' ),\n" +
                "('G2','WEDNESDAY','NLH1','CES1','12:00-13:00','LECTURE' ),\n" +
                "('G2','WEDNESDAY','FEW1','MA','14:00-15:00','TUTORIAL' ),\n" +
                "('G2','WEDNESDAY','FEW1','PH2','15:00-16:00','TUTORIAL' ),\n" +
                "('G2','WEDNESDAY','GS5','CES2','17:00-18:00','LECTURE' ),\n" +
                "('G2','THURSDAY','NLH1','CSE','9:00-10:00','LECTURE' ),\n" +
                "('G2','THURSDAY','NLH1','MED1','10:00-11:00','LECTURE' ),\n" +
                "('G2','THURSDAY' ,'CES1','11:00-13:00','PRACTICAL' ),\n" +
                "('G2','THURSDAY','GS4','PH2','14:00-15:00','LECTURE' ),\n" +
                "('G2','THURSDAY','GS4','MA','15:00-16:00','LECTURE' ),\n" +
                "('G2','THURSDAY','SEW7','EG','16:00-17:00','LECTURE' ),\n" +
                "('G2','THURSDAY','NLH2','CES1','17:00-18:00','LECTURE' ),\n" +
                "('G2','FRIDAY','GS6','MA','11:00-12:00','LECTURE' ),\n" +
                "('G2','FRIDAY' ,'LAB','PH2','14:00-16:00','PRACTICAL' ),\n" +
                "('G2','FRIDAY','GS8','PE(EAA-A)','16:00-17:00','LECTURE' ),\n" +
                "('M','MONDAY','FEW15','PH2','9:00-10:00','LECTURE' ),\n" +
                "('M','MONDAY','FEW15','MA','10:00-11:00','LECTURE' ),\n" +
                "('M','MONDAY','SEW1','CSE','11:00-12:00','LECTURE' ),\n" +
                "('M','MONDAY','SEW1','PE1','12:00-13:00','LECTURE' ),\n" +
                "('M','MONDAY','FEW1','CES1','16:00-17:00','LECTURE' ),\n" +
                "('M','MONDAY','FEW1','CES2','17:00-18:00','LECTURE' ),\n" +
                "('M','TUESDAY' ,'LAB','PH2','9:00-11:00','PRACTICAL' ),\n" +
                "('M','TUESDAY','GS8','MA','11:00-12:00','LECTURE' ),\n" +
                "('M','TUESDAY','FC5','PE(EAA-A)','17:00-18:00','LECTURE' ),\n" +
                "('M','WEDNESDAY' ,'LAB','CES1','9:00-11:00','PRACTICAL' ),\n" +
                "('M','WEDNESDAY','SMSLH1','PH2','11:00-12:00','LECTURE' ),\n" +
                "('M','WEDNESDAY','SMSLH1','PE1','12:00-13:00','LECTURE' ),\n" +
                "('M','WEDNESDAY','LAB' ,'WORKSHOP','14:00-16:00','PRACTICAL' ),\n" +
                "('M','WEDNESDAY','GS5','CES1','16:00-17:00','LECTURE' ),\n" +
                "('M','WEDNESDAY','FEW1','CES2','17:00-18:00','LECTURE' ),\n" +
                "('M','THURSDAY','SEW10','PH2','9:00-10:00','TUTORIAL' ),\n" +
                "('M','THURSDAY','SEW10','MA','10:00-11:00','LECTURE' ),\n" +
                "('M','THURSDAY','SMSLH1','PE(EAA-A)','15:00-16:00','LECTURE' ),\n" +
                "('M','THURSDAY','SMSLH1','WORKSHOP','16:00-17:00','LECTURE' ),\n" +
                "('M','FRIDAY','N/W LAB','CSE','9:00-11:00','PRACTICAL' ),\n" +
                "('M','FRIDAY' ,'LAB','PE1','11:00-13:00','PRACTICAL' ),\n" +
                "('M','FRIDAY','SMSLH1','MA','14:00-15:00','TUTORIAL' ),\n" +
                "('M','FRIDAY','SMSLH1','CSE','15:00-16:00','LECTURE' ),\n" +
                "('A1','MONDAY','CCTF','HSS','9:00-11:00','PRACTICAL' ),\n" +
                "('A1','MONDAY','GS5','CESD1','11:00-12:00','LECTURE' ),\n" +
                "('A1','MONDAY','SEW10','MA','12:00-13:00','TUTORIAL' ),\n" +
                "('A1','MONDAY','GS8','HSS','14:00-15:00','LECTURE' ),\n" +
                "('A1','MONDAY','NLH1','CES','17:00-18:00','LECTURE' ),\n" +
                "('A1','TUESDAY','FE16','CY1','10:00-11:00','TUTORIAL' ),\n" +
                "('A1','TUESDAY','GS3','MA','14:00-15:00','LECTURE' ),\n" +
                "('A1','TUESDAY' ,'LAB','CES','15:00-17:00','PRACTICAL' ),\n" +
                "('A1','WEDNESDAY','NLH1','DS','10:00-11:00','LECTURE' ),\n" +
                "('A1','WEDNESDAY','CCTF','DS','15:00-17:00','PRACTICAL' ),\n" +
                "('A1','WEDNESDAY','NLH1','CES','17:00-18:00','LECTURE' ),\n" +
                "('A1','THURSDAY','FC5','HSS','9:00-10:00','LECTURE' ),\n" +
                "('A1','THURSDAY','FC5','MA','10:00-11:00','LECTURE' ),\n" +
                "('A1','THURSDAY','NLH1','CY1','11:00-12:00','LECTURE' ),\n" +
                "('A1','THURSDAY','NLH1','ECC','12:00-13:00','LECTURE' ),\n" +
                "('A1','THURSDAY','NLH2','DS','16:00-17:00','LECTURE' ),\n" +
                "('A1','FRIDAY','NLH1','MA','9:00-10:00','LECTURE' ),\n" +
                "('A1','FRIDAY','NLH1','CSED1','10:00-11:00','LECTURE' ),\n" +
                "('A1','FRIDAY','NLH1','CY1','11:00-12:00','LECTURE' ),\n" +
                "('A1','FRIDAY','LAB' ,'CY1','15:00-17:00','PRACTICAL' ),\n" +
                "('A1','FRIDAY','GS5','ECC','17:00-18:00','LECTURE' ),\n" +
                "('A1','SATURDAY','NLH1','EXTRA ACTIVITY','9:00','LECTURE' ),\n" +
                "('A2','MONDAY','GS5','CESD1','11:00-12:00','LECTURE' ),\n" +
                "('A2','MONDAY','FE18','CY1','12:00-13:00','TUTORIAL' ),\n" +
                "('A2','MONDAY','GS8','HSS','14:00-15:00','LECTURE' ),\n" +
                "('A2','MONDAY','NLH1','CES','17:00-18:00','LECTURE' ),\n" +
                "('A2','TUESDAY','LAB' ,'CY1','11:00-13:00','PRACTICAL' ),\n" +
                "('A2','TUESDAY','GS3','MA','14:00-15:00','LECTURE' ),\n" +
                "('A2','TUESDAY','LAB' ,'CES','15:00-17:00','PRACTICAL' ),\n" +
                "('A2','WEDNESDAY','NLH1','DS','10:00-11:00','LECTURE' ),\n" +
                "('A2','WEDNESDAY','CCTF','DS','15:00-17:00','PRACTICAL' ),\n" +
                "('A2','WEDNESDAY','NLH1','CES','17:00-18:00','LECTURE' ),\n" +
                "('A2','WEDNESDAY','FE17','MA','14:00-15:00','TUTORIAL' ),\n" +
                "('A2','THURSDAY','FC5','HSS','9:00-10:00','LECTURE' ),\n" +
                "('A2','THURSDAY','FC5','MA','10:00-11:00','LECTURE' ),\n" +
                "('A2','THURSDAY','NLH1','CY1','11:00-12:00','LECTURE' ),\n" +
                "('A2','THURSDAY','NLH1','ECC','12:00-13:00','LECTURE' ),\n" +
                "('A2','THURSDAY','NLH2','DS','16:00-17:00','LECTURE' ),\n" +
                "('A2','FRIDAY','NLH1','MA','9:00-10:00','LECTURE' ),\n" +
                "('A2','FRIDAY','NLH1','CSED1','10:00-11:00','LECTURE' ),\n" +
                "('A2','FRIDAY','NLH1','CY1','11:00-12:00','LECTURE' ),\n" +
                "('A2','FRIDAY','LAB' ,'HSS','15:00-17:00','PRACTICAL' ),\n" +
                "('A2','FRIDAY','GS5','ECC','17:00-18:00','LECTURE' ),\n" +
                "('A2','SATURDAY','NULL' ,'EXTRA ACTIVITY','9:00','lECTURE'),\n" +
                "('C1','MONDAY' ,'LAB','DS','11:00-12:00','PRACTICAL' ),\n" +
                "('C1','MONDAY','NLH1','CY1','11:00-12:00','LECTURE' ),\n" +
                "('C1','MONDAY','GS7','HSS','15:00-16:00','LECTURE' ),\n" +
                "('C1','MONDAY','GS7','MA','16:00-17:00','LECTURE' ),\n" +
                "('C1','TUESDAY','NLH1','HSS','11:00-12:00','LECTURE' ),\n" +
                "('C1','TUESDAY','NLH1','ECC','12:00-13:00','LECTURE' ),\n" +
                "('C1','TUESDAY','GS3','CY1','17:00-18:00','LECTURE' ),\n" +
                "('C1','WEDNESDAY','LAB' ,'HSS','9:00-11:00','PRACTICAL' ),\n" +
                "('C1','WEDNESDAY','NLH1','MA','11:00-12:00','LECTURE' ),\n" +
                "('C1','THURSDAY','LAB' ,'CY1','9:00-11:00','PRACTICAL' ),\n" +
                "('C1','THURSDAY','GS7','DS','11:00-12:00','LECTURE' ),\n" +
                "('C1','THURSDAY','GS3','CSED1','16:00-17:00','LECTURE' ),\n" +
                "('C1','THURSDAY','FC5','ECC','17:00-18:00','LECTURE' ),\n" +
                "('C1','FRIDAY','NLH2','DS','9:00-10:00','LECTURE' ),\n" +
                "('C1','FRIDAY','GS6','CSED1','14:00-15:00','LECTURE' ),\n" +
                "('C1','FRIDAY','GS7','MA','15:00-16:00','LECTURE' ),\n" +
                "('C1','FRIDAY','SEW9','CY1','16:00-17:00','TUTORIAL' ),\n" +
                "('C1','FRIDAY','SEW9','MA','17:00-18:00','TUTORIAL' ),\n" +
                "('C1','SATURDAY','NULL' ,'EXTRA ACTIVITY','9:00','LECTURE'),\n" +
                "('C2','MONDAY','NLH1','CY1','11:00-12:00','LECTURE' ),\n" +
                "('C2','MONDAY','GS7','HSS','15:00-16:00','LECTURE' ),\n" +
                "('C2','MONDAY','GS7','MA','16:00-17:00','LECTURE' ),\n" +
                "('C2','TUESDAY','NLH1','HSS','11:00-12:00','LECTURE' ),\n" +
                "('C2','TUESDAY','NLH1','ECC','12:00-13:00','LECTURE' ),\n" +
                "('C2','TUESDAY','GS3','CY1','17:00-18:00','LECTURE' ),\n" +
                "('C2','WEDNESDAY','NLH1','MA','11:00-12:00','LECTURE' ),\n" +
                "('C2','WEDNESDAY','SMSLH1','CY1','14:00-15:00','TUTORIAL' ),\n" +
                "('C2','WEDNESDAY','LAB' ,'CY1','15:00-17:00','PRACTICAL' ),\n" +
                "('C2','THURSDAY' ,'LAB','CY1','9:00-11:00','PRACTICAL' ),\n" +
                "('C2','THURSDAY','GS7','DS','11:00-12:00','LECTURE' ),\n" +
                "('C2','THURSDAY','GS3','CSED1','16:00-17:00','LECTURE' ),\n" +
                "('C2','THURSDAY','FC5','ECC','17:00-18:00','LECTURE' ),\n" +
                "('C2','FRIDAY','NLH2','DS','9:00-10:00','LECTURE' ),\n" +
                "('C2','FRIDAY','GS6','CSED1','14:00-15:00','LECTURE' ),\n" +
                "('C2','FRIDAY','GS7','MA','15:00-16:00','LECTURE' ),\n" +
                "('C2','FRIDAY','SEW1','MA','16:00-17:00','TUTORIAL' ),\n" +
                "('C2','SATURDAY','NULL' ,'EXTRA ACTIVITY','9:00','LECTURE' )");






//////// l;;;;;;;;;;;;;;gjfg


    }


    public String completecommand(String str1, String str2) {

        return "Select TIME, CODE, VENUE FROM TABLE1 WHERE DAY='" + str1 + "'" + "AND GROUPNO='" + str2+"'";
    }



    public  Cursor showdata(String command){
        SQLiteDatabase db=this.getWritableDatabase();
        return db.rawQuery(command,null);}

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
