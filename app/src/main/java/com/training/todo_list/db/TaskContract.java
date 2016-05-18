package com.training.todo_list.db;

import android.provider.BaseColumns;

/**
 * Created by Omar on 18/05/2016.
 */
public class TaskContract {
    public static final String DB_NAME = "todolist.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }



}
