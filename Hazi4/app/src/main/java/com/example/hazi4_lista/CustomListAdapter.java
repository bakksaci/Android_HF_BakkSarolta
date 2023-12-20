package com.example.hazi4_lista;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter  extends BaseAdapter {
    private Activity context;
    private String[] currencies;
    private String[] prices;
    private Integer[] images;

    public CustomListAdapter(Activity context, String[] currencies, String[] prices, Integer[] images) {
        this.context = context;
        this.currencies = currencies;
        this.prices = prices;
        this.images=images;
    }

    @Override
    public int getCount() {
        return currencies.length;
    }

    @Override
    public Object getItem(int position) {
        return currencies[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView = context.getLayoutInflater().inflate(R.layout.list_item, null);

        TextView currencyTextView = rowView.findViewById(R.id.currencyTextView);
        TextView priceTextView = rowView.findViewById(R.id.priceTextView);
        ImageView kep=rowView.findViewById(R.id.imageView);

        currencyTextView.setText(currencies[position]);
        priceTextView.setText(prices[position]);

        return rowView;
    }
}
