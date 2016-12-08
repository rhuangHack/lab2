package com.example.renda.myapplication;

import org.junit.Test;

import mydb.DataStorageImp;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test

    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }


    public void dataStorage_isCorrect() throws Exception {
        DataStorageImp db = new DataStorageImp();
        db.saveState("Testing");

    }
}