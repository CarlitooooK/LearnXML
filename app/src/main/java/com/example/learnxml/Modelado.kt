package com.example.learnxml

data class User(
    val fullName:String?=null,
    val profilePicture: String?=null)

data class Creator(
    val user:User
)

data class Post(
    val id:String,
    val text:String?=null,
    val creator: Creator
)