package com.example.hp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.hp.myapplication.data.Responce;
import com.example.hp.myapplication.data.SKU;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        asyncHttpClient .get("https://gist.githubusercontent.com/umairshaikh6405/28cd5008bc8757e7f338a234c073c602/raw/ce42f80e39f5cf37da129fec84e267c330304a0c/skulist",new JsonHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);

                Responce data = new Gson().fromJson(String.valueOf(response), Responce.class);

                Log.i("----", "onSuccess: "+data);
                SKU[] skuArrayAdapter = data.getResponseData().getSKU();
                ListView listView = findViewById(R.id.lv);
             Myadatpter myadatpter
                      = new Myadatpter(skuArrayAdapter,MainActivity.this);
                listView.setAdapter(myadatpter);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                super.onFailure(statusCode, headers, responseString, throwable);
                Log.i("-----", "onSuccess: "+throwable);
            }
        });
    }
}
