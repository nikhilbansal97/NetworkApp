package com.example.nikhil.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConnectivityManager manager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = manager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
        boolean mobileInfo = info.isConnected();
        String mobile;
        if(mobileInfo)
            mobile = "Mobile Data : Connected";
        else
            mobile = "Mobile Data : Not Connected";

        String wifi;
        info = manager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        if(info.isConnected())
            wifi = "Wifi : Connected";
        else
            wifi = "Wifi : Not Connected";

        TextView mobile_text = (TextView) findViewById(R.id.mobile_state);
        mobile_text.setText(mobile);

        TextView wifi_text = (TextView) findViewById(R.id.wifi_state);
        wifi_text.setText(wifi);

    }
}
