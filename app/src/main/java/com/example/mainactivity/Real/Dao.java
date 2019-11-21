package com.example.mainactivity.Real;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class Dao {
    private SQLiteDatabase database;
    private dataDetail datadetail;

    public Dao(Context context) {


        datadetail = new dataDetail(context);
    }
    public void open(){
        database= datadetail.getWritableDatabase();

    }
    public void close(){
        datadetail.close();


    }
    public Game getAllToDoList(int position){
        Game games ;
        Cursor cursor = database.rawQuery("SELECT * FROM GAME_LIST WHERE id =="+position+";",null);
        cursor.moveToFirst();
        games = new Game(cursor.getInt(cursor.getColumnIndex("id")),cursor.getInt(cursor.getColumnIndex("picid")),cursor.getString(cursor.getColumnIndex("name"))
                ,cursor.getString(cursor.getColumnIndex("price")),cursor.getString(cursor.getColumnIndex("detail")));
        return  games;
    }
    public  ArrayList<Game> getall(){
        ArrayList<Game> game = new ArrayList<Game>();

        Cursor cursor = database.rawQuery("SELECT * FROM GAME_LIST;",null);
        cursor.moveToFirst();
        Game games;
        while(!cursor.isAfterLast()){
            games = new Game(cursor.getInt(cursor.getColumnIndex("id")),cursor.getInt(cursor.getColumnIndex("picid")),cursor.getString(cursor.getColumnIndex("name"))
                    ,cursor.getString(cursor.getColumnIndex("price")),cursor.getString(cursor.getColumnIndex("detail")));
            game.add(games);
            cursor.moveToNext();


        }
        cursor.close();

        return game;
    }
}
