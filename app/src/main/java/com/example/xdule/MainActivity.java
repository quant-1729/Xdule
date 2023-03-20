package com.example.xdule;


import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Toolbar toolbar;
    public AutoCompleteTextView autoCompleteTextView;
    private ImageButton imageButton;
    public TextView textView;





    // starting











    String [] atvtext1= {"Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday"};
    String [] atvtext2={"A1","A2","B1","B2","C1","C2","D1","D2","E1","E2","F1","F2","G1","G2","H1","H2","I1","I2","J1","J2"};
    //creating activitysettingd

    //creating DBhandeler object




    //




    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DB_handeler db1= new DB_handeler (MainActivity.this,"String",null,1);
        parametersindb para= new parametersindb();

        // getting textview
        AutoCompleteTextView Text1= (AutoCompleteTextView) findViewById(R.id.atv1);
        AutoCompleteTextView Text2 = (AutoCompleteTextView) findViewById(R.id.atv2);
        TextView resultgrid= findViewById(R.id.resultgrid);



        //


        Button button1= findViewById(R.id.button1);
            button1.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {
                    Intent intent2 = new Intent(MainActivity.this, ifsunday.class);
                    Intent intent1 = new Intent(MainActivity.this, Result.class);

                    String text11 = Text1.getText().toString().toUpperCase();
                    String text21 = Text2.getText().toString().toUpperCase();
                    String command = db1.completecommand(text11, text21);


                    Cursor res = db1.showdata(command);
                    StringBuilder stringBuilder=new StringBuilder();
                    Toast.makeText(MainActivity.this,  getTableAsString(res,para.TABLE_NAME), Toast.LENGTH_SHORT).show();

                   ;








                     //int a = res.getCount();
                    //Toast.makeText(MainActivity.this,a, Toast.LENGTH_SHORT).show();

                    /*for (int i = 0; i < res.getCount(); i++) {

                        //iterate over the columns
                        for(int j = 0; j < res.getColumnNames().length; j++){

                            //append the column value to the string builder and delimit by a pipe symbol
                            stringBuilder.append(res.getString(j) + "|");
                        }
                        //add a new line carriage return
                        stringBuilder.append("\n");
                        resultgrid.setText(resultgrid.getText().toString() + "/n" +stringBuilder+"/n");

                        //move to the next row
                        res.moveToNext();}*/






                   /* while (res.moveToNext()) {
                        Toast.makeText(MainActivity.this, "this is going in the app", Toast.LENGTH_SHORT).show();

                        String time = res.getString(0);
                        String venue = res.getString(1);
                        String type = res.getString(2);

                        String str= time+" "+venue+" "+type;*/


                   /*f (res!= null) {
                        if (res.moveToFirst()) {
                            do {
                                strData1 += res.getString(0);
                                strData2 += res.getString(1);
                                strData3 += res.getString(2);
                                strfinal=strData1+strData2+strData3;
                                resultgrid.setText(resultgrid.getText().toString() + "/n" +strfinal+"/n");

                            } while (res.moveToNext());
                       }}*/
                   /* if (res != null) {
                        if (res.moveToFirst()) {
                            do {
                                String strData1 = res.getString(0);
                                String strData2 = res.getString(1);
                                String strData3 = res.getString(2);
                                String strfinal = strData1 +" - "+ strData2+" - " + strData3;
                                Log.d("DEBUG", "strData1=" + strData1 + ", strData2=" + strData2 + ", strData3=" + strData3);
                                Log.d("DEBUG", "strfinal=" + strfinal);
                                resultgrid.setText(resultgrid.getText().toString() + "\n" + strfinal + "\n");
                            } while (res.moveToNext());
                        } else {
                            Log.d("DEBUG", "Result set is empty");
                        }
                    } else {
                        Log.d("DEBUG", "Query returned null");
                    }*/

                        }


                    // display the result



            });

                    /*if(text11.equals("")){
                        Toast.makeText(MainActivity.this, "Enter the day", Toast.LENGTH_SHORT).show();}

                    else if(text11.equals("SUNDAY")){ startActivity(intent2); }

                    else if (text21.equals("")) {
                        Toast.makeText(MainActivity.this, "Enter the group number", Toast.LENGTH_SHORT).show();}
                    else{startActivity(intent1);} */



        //removing the action bar
        // the app is crashing on adding the supportrequestwindowsfeature;
        //supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        //removing the action bar completed


        //Setting auto complete days
        AutoCompleteTextView atv1= findViewById(R.id.atv1);
        atv1.setAdapter(new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1, atvtext1));
        AutoCompleteTextView atv2= findViewById(R.id.atv2);
        atv2.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,atvtext2));

        //Creating the image button
            ImageButton imgbut1= findViewById(R.id.setting1);
            imgbut1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(MainActivity.this, Settings.class);
                    startActivity(intent);}
            });


        }




}








