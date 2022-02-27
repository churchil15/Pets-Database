package data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

public final class PetContract {

    // The "Content authority" is a name for the entire content provider, similar to the
    // relationship between a domain name and its website.  A convenient string to use for the
    // content authority is the package name for the app, which is guaranteed to be unique on the
    // device.
    public static final String CONTENT_AUTHORITY = "com.example.pets";

    // Use CONTENT_AUTHORITY to create the base of all URI's which apps will use to contact
    // the content provider.
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    // Possible path (appended to base content URI for possible URI's)
    // For instance, content://com.example.pets/pets/ is a valid path for
    // looking at pet data. content://com.example.android.pets/staff/ will fail,
    // as the ContentProvider hasn't been given any information on what to do with "staff".
    public static final String PATH_PETS = "pets";

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private PetContract(){
        // Empty Constructor
    }

    // Inner class that defines constant values for the pets database table.
    // Each entry in the table represents a single pet.
    public static final class PetsEntry implements BaseColumns{

        // The content URI to access the pet data in the provider
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

        // The MIME type of the CONTENT_URI for a list of pets.
        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;

        // The MIME type of the CONTENT_URI for a single pet.
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;

        public static final String TABLE_NAME = "pets";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        public static final int MALE_GENDER = 1;
        public static final int FEMALE_GENDER = 2;
        public static final int UNKNOWN_GENDER = 0;

        // Return whether or not the given gender is UNKNOWN_GENDER, MALE_GENDER
        // or FEMALE_GENDER.
        public static boolean isValidGender(int gender){
            if (gender == UNKNOWN_GENDER || gender == MALE_GENDER || gender == FEMALE_GENDER) {
                return true;
            }
            return false;
        }

    }
}
