package com.jct.oshri.locationgps;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class GoogleApiFunc {

//
//
//
//    /** A method to download json data from url */
//    private String downloadUrl(String strUrl) throws IOException {
//        String data = "";
//        InputStream iStream = null;
//        HttpURLConnection urlConnection = null;
//        try {
//            URL url = new URL(strUrl);
//
//            // Creating an http connection to communicate with url
//            urlConnection = (HttpURLConnection) url.openConnection();
//
//            // Connecting to url
//            urlConnection.connect();
//
//            // Reading data from url
//            iStream = urlConnection.getInputStream();
//
//            BufferedReader br = new BufferedReader(new InputStreamReader(iStream));
//
//            StringBuffer sb = new StringBuffer();
//
//            String line = "";
//            while ((line = br.readLine()) != null) {
//                sb.append(line);
//            }
//
//            data = sb.toString();
//
//            br.close();
//
//        } catch (Exception e) {
//            Log.d("err downloading url", e.toString());
//        } finally {
//            iStream.close();
//            urlConnection.disconnect();
//        }
//        Log.d("Data =", "url"+data.toString());
//        return data;
//    }
//
//
// public static float getDistanse()
// {
//     String distance;
//     String duration;
//     distance = response.getJSONArray("routes").getJSONObject(routeIndex).getJSONArray("legs").getJSONObject(index).getJSONObject("distance").getString("text");
//     duration = response.getJSONArray("routes").getJSONObject(routeIndex).getJSONArray("legs").getJSONObject(index).getJSONObject("duration").getString("text");
// }



}
