package com.example.kevin_000.appacademia;

import java.util.ArrayList;

/**
 * Created by kevin_000 on 21/08/2017.
 */

public class AcademiaSingleton {
    private static final AcademiaSingleton ourInstance = new AcademiaSingleton();

    private ArrayList<String> arr = new ArrayList<String>();

    public static AcademiaSingleton getInstance() {
        return ourInstance;
    }

    private AcademiaSingleton() {}

    public void obtener(String list){

        arr.add(list);

    }


}
