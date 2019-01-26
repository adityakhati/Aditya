package com.example.android.cookies;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorresourceid;


    public WordAdapter(Activity context, ArrayList<Word> word,int Colorresourceid) {
        super(context, 0, word);

        mColorresourceid=Colorresourceid;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentWord.getmMiwoktranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentWord.getDefaulttranslation());

        ImageView numberImageView = (ImageView) listItemView.findViewById(R.id.image);

        if(currentWord.hasimage()) {
            numberImageView.setImageResource(currentWord.getmiwokimage());
            numberImageView.setVisibility(View.VISIBLE);
        }
        else{
            numberImageView.setVisibility(View.GONE);
        }




        View txtcontainer=listItemView.findViewById(R.id.text_container);

        int color= ContextCompat.getColor(getContext(),mColorresourceid);

        txtcontainer.setBackgroundColor(color);


        return listItemView;
    }
}
