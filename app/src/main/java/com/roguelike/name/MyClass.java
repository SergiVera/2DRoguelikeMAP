package com.roguelike.name;

import retrofit2.Call;

public class MyClass {

    private APIRest myapirest;

    public String getStringMap(){
        myapirest = APIRest.createAPIRest();

        Call<String> sm = myapirest.getGameMap();

        return String.valueOf(sm);
    }
}
