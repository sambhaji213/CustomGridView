package com.customgridview;

/**
 * Created by kreativ on 9/7/16.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private final String[] textValues;

    public CustomAdapter(Context context, String[] mobileValues) {
        this.context = context;
        this.textValues = mobileValues;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;

        if (convertView == null) {
            gridView = new View(context);
            gridView = inflater.inflate(R.layout.row_item, null);
            TextView textView = (TextView) gridView.findViewById(R.id.textView);
            textView.setText(textValues[position]);
            ImageView imageView = (ImageView) gridView.findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.ic_launcher);

        } else {
            gridView = (View) convertView;
        }

        return gridView;
    }

    @Override
    public int getCount() {
        return textValues.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

}
