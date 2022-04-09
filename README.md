# Pets-Database
An easy to use Android Application that demonstrate the use of data persistence in android i.e.,
saving the data in a permanent way such that remains on your device even after closing the activity.

This app can be used by any local pets authority in order to keep track on pets available in their shelter.
There's a floating action button (FAB) that allows us to add details like pets name, breed, gender and weight.

# SQLite DataBase 
The database that runs on android is SQLite database which was used to store, update or delete the details of the pets in this app. 
But there also can be different types of data storage options to store data in Android like, 
1. **Files:** These are good for saving large media files but are not efficient.
2. **Shared Preference:** These are good for in-app user preferences and somewhat efficient but are used better for single, important piece of information bascially small data.
3. **SQLite databases:** SQLite database are highly efficient and are good for organizing a lot of related and structured data for easy access. SQLite databases are divided into tables, and these tables can have rows and coloumns

# Steps for Creating a Database in Android 
1. Create a Package that will manage database specific classes.
2. Create a Schema and a Contract Class. Now in order to create an Contract we should first create an outer class named BlankContract and then an inner class named BlankEntry for each table in the database. Each of these inner classes should implement a class called BaseColumns. String constants for table name and for each of the headings. Lastly also create constants for gender and use them in there classes where needed.
