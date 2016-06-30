package com.example.rahulsood.asynctaskproject;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
        String url = "https://raw.githubusercontent.com/rahulsood03/CS6392016/master/chandigarh.png";
        new MyAsyncTask().execute(url);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    private class MyAsyncTask extends AsyncTask<String, Void, Bitmap> {
        @Override
        protected Bitmap doInBackground(String... params) {
            Bitmap bmap = null;
            try {
                bmap = BitmapFactory.decodeStream((InputStream) new URL(params[0]).getContent());
            }catch (Exception e){
                Log.e("error", e.getMessage());
            }
            return bmap;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            ImageView image = (ImageView) getActivity().findViewById(R.id.imageView);

            if (image != null){
                image.setImageBitmap(bitmap);
            }
        }

    }
}
