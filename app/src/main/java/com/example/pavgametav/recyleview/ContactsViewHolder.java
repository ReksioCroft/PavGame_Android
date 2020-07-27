package com.example.pavgametav.recyleview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pavgametav.R;

public class ContactsViewHolder extends RecyclerView.ViewHolder {

    protected final TextView mTextViewName;
    protected final TextView mTextViewResult;
    protected final TextView mTextViewType;

    public ContactsViewHolder( @NonNull View itemView ) {
        super( itemView );

        mTextViewName = itemView.findViewById( R.id.textview_name );
        mTextViewResult = itemView.findViewById( R.id.textview_result );
        mTextViewType = itemView.findViewById( R.id.textview_gameType );
    }
}
