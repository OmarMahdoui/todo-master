package com.training.todo_list.model.models;

import com.orm.SugarRecord;

/**
 * Created by Omar on 18/05/2016.
 */
public class Tasks  {




    private String mSDescription;
    private boolean mBisDone;
    public Tasks() {
    }

    public Tasks(String mSDescription, boolean mBisDone) {
        this.mSDescription = mSDescription;
        this.mBisDone = mBisDone;
    }

    public String getmSDescription() {
        return mSDescription;
    }

    public boolean ismBisDone() {
        return mBisDone;
    }

    public void setmSDescription(String mSDescription) {
        this.mSDescription = mSDescription;
    }

    public void setmBisDone(boolean mBisDone) {
        this.mBisDone = mBisDone;
    }
}
