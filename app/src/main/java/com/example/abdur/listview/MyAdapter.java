package com.example.abdur.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by abdur on 18/5/15.
 */
public class MyAdapter extends ArrayAdapter {

    private final Context context;
    private final String[] values,details;

    public MyAdapter(Context context,String[] values,String[] details ) {
        super(context, R.layout.rowlayout,values);
        this.context=context; this.values=values; this.details=details;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.rowlayout, parent, false);
        TextView textView1 = (TextView) rowView.findViewById(R.id.label);
        TextView textView2= (TextView) rowView.findViewById(R.id.details);
        textView1.setText(values[position]);
        textView2.setText(details[position]);
        // change the icon for Windows and iPhone
        String s = values[position];
        return rowView;
    }
}


