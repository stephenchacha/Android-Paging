package com.pagingdemo.data.local.dao

import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.pagingdemo.model.UserEntity

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUsers(userEntity: List<UserEntity>)

    @Query("Select * from 'UserEntity'")
    fun getUsers(): DataSource.Factory<Int, UserEntity>
}