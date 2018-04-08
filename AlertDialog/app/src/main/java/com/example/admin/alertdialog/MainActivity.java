package com.example.admin.alertdialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        loginView();
    }



    public void loginView(){
        TableLayout loginForm = (TableLayout)getLayoutInflater().inflate( R.layout.login, null);
        new AlertDialog.Builder(this).setTitle("ANDROID APP").setView(loginForm)
                .setPositiveButton("Sign in",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which){
                        //此处执行登录
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //取消登录，不做任何事情
                    }
                })
                .create()
                .show();


    }



}
