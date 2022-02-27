package data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static data.PetContract.PetsEntry;

public class PetDbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "shelter.db";


//    Ye bhi likh skte hai lekin ye SQL command jaada efficient nho hogi
//        private static final String SQL_CREATE_PETS_TABLE = "CREATE TABLE pets (\n" +
//                                        " _id INTEGER,\n" +
//                                        " name TEXT,\n" +
//                                        " breed TEXT,\n" +
//                                        " gender INTEGER,\n" +
//                                        " weight INTEGER);";

    private static final String SQL_CREATE_PETS_TABLE =
            "CREATE TABLE " + PetsEntry.TABLE_NAME +  " (" +
                     PetsEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                     PetsEntry.COLUMN_PET_NAME + " TEXT NOT NULL, " +
                     PetsEntry.COLUMN_PET_BREED + " TEXT, " +
                     PetsEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL, " +
                     PetsEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0);";


    public PetDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create a String that contains the SQL statement to create the pets table
        // Execute the SQL statement
        db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // The database is still at version 1, so there's nothing to do be done here.
    }
}
