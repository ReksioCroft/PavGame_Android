package com.example.pavgametav.room;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface GameDao {
    @Query( "SELECT * FROM gameplay_history" )
    LiveData < List < GameHistory > > getAllGames();

    @Insert
    void insertGame( GameHistory game );
}
