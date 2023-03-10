package com.example.ticketbooking.dataRepository.roomDatabase.entities

import androidx.room.*

@Entity(
    tableName = "user_table",
)
class User(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,
    var name: String,
    var phoneNO: String,
    var mailId: String,
    var profilePicture: String,
)