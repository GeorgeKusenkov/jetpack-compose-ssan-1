package com.example.jetpack_compose_ssan_1.data

import javax.inject.Inject

class PersonRepository @Inject constructor(
    private val personDao: PersonDao
) {
    val readAll = personDao.readAll()
}