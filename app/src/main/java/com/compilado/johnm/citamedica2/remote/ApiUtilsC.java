package com.compilado.johnm.citamedica2.remote;



public class ApiUtilsC {

    private ApiUtilsC(){}

    public static final String BASE_URL="http://35.237.73.197:8080/Citaws/citapws/";

    public static APIServiceC getAPIService(){
        return RetrofitClientC.getClient(BASE_URL).create(APIServiceC.class);
    }

}
