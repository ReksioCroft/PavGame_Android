package com.example.pavgametav.recyleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pavgametav.R;
import com.example.pavgametav.room.GameHistory;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter < ContactsViewHolder > {

    private List < GameHistory > mContacts;
    private final LayoutInflater mInflater;

    public ContactsAdapter( Context context ) {
        mInflater = LayoutInflater.from( context );
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View itemView = mInflater.inflate( R.layout.contact_item, parent, false );
        return new ContactsViewHolder( itemView );
    }

    @Override
    public void onBindViewHolder( @NonNull ContactsViewHolder contactsViewHolder, int i ) {
        if ( mContacts != null ) {
            GameHistory currentGame = mContacts.get( i );
            contactsViewHolder.mTextViewName.setText( currentGame.getNume() );
            contactsViewHolder.mTextViewResult.setText( currentGame.getResult() );
            contactsViewHolder.mTextViewType.setText( currentGame.getGameType() );
        } else {
            contactsViewHolder.mTextViewName.setText( R.string.noText );
            contactsViewHolder.mTextViewResult.setText( R.string.noText );
            contactsViewHolder.mTextViewType.setText( R.string.noText );
        }
    }

    @Override
    public int getItemCount() {
        if ( mContacts != null )
            return mContacts.size();
        else
            return 0;
    }

    void setContacts( List < GameHistory > games ) {
        mContacts = games;
        notifyDataSetChanged();
    }
}
