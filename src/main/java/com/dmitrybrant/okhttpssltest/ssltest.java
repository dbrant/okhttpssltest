package com.dmitrybrant.okhttpssltest;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ssltest {
    private static final String ENDPOINT = "https://deployment.wikimedia.beta.wmflabs.org/wiki/Main_Page";

    public static void main(String... args) {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder().url(ENDPOINT).build();

        try (Response response = client.newCall(request).execute()) {

            String str = response.body().string();

            System.out.println("Response successful!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private ssltest() { }
}
