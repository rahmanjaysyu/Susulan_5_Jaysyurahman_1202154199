package com.example.android.jaysyurahman_1202154199_modul5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Jaysyurahman on 25/03/2018.
 */

public class ToDoHelper extends SQLiteOpenHelper {
    private static final String DB_NAME="todo.db";
    private static final int DB_VERSION=1;

    public ToDoHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE todolist(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NULL, desc TEXT NULL, prior INTEGER NULL)";
        db.execSQL(sql);
        Log.d("SQLITE::DATA","OnCreated "+sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


    public boolean deleteTodo(int id){
        SQLiteDatabase db = this.getWritableDatabase();
        int delete = db.delete("todolist","id = "+id, null);
        Log.d("SQLITE::DATA","DELETED "+delete);
        return delete>0;
    }
}
