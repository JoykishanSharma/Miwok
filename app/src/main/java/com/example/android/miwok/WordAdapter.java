package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int resourceID;

    WordAdapter(@NonNull Context context, ArrayList<Word> resource,int colorResourceID) {
        super(context,0, resource);
        resourceID = colorResourceID;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        assert currentWord != null;
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        ImageView defaultImageView = (ImageView) listItemView.findViewById(R.id.default_image_view);

        if (currentWord.hasImage()){
            defaultImageView.setImageResource(currentWord.getImageResourceID());
            defaultImageView.setVisibility(View.VISIBLE);
        }
        else {
            defaultImageView.setVisibility(View.GONE);
        }

        LinearLayout linearLayout = listItemView.findViewById(R.id.linear_layout);
        linearLayout.setBackgroundResource(resourceID);

        return listItemView;
    }
}
