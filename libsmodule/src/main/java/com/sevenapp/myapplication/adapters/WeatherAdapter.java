package com.sevenapp.myapplication.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sevenapp.myapplication.R;
import com.sevenapp.myapplication.models.WeatherModel;

import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<WeatherModel.Weather> items;

    public WeatherAdapter(List<WeatherModel.Weather> items) {
        this.items = items;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_weather, parent, false);
        return new WeatherViewHolder(convertView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        WeatherModel.Weather item = items.get(position);
        // TODO uzupełnij dane w elemencie listy
        // http://developer.android.com/reference/android/widget/TextView.html
        // obrazek załaduj przy pomocy Picasso
        // http://square.github.io/picasso/
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class WeatherViewHolder extends RecyclerView.ViewHolder {
        public ImageView weatherIcon;
        public TextView weatherTitle;
        public TextView weatherSubtitle;

        public WeatherViewHolder(View itemView) {
            super(itemView);
            weatherIcon = (ImageView) itemView.findViewById(R.id.item_weather_icon);
            weatherTitle = (TextView) itemView.findViewById(R.id.item_weather_title);
            weatherSubtitle = (TextView) itemView.findViewById(R.id.item_weather_subtitle);
        }
    }
}
