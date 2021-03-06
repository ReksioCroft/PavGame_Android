package com.example.pavgametav.room;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface GameDao {
    @Query( "SELECT DISTINCT nume_jucator, game_type, result, count(*) as id from gameplay_history  group by nume_jucator, game_type, result order by id desc, nume_jucator, game_type, result" )
    LiveData < List < GameHistory > > getAllGames();

    @Insert
    void insertGame( GameHistory game );
}
