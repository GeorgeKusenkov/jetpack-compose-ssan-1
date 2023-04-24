package com.example.jetpack_compose_ssan_1

import androidx.lifecycle.ViewModel
import com.example.jetpack_compose_ssan_1.data.PersonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    personRepository: PersonRepository
) : ViewModel() {

    val readAll = personRepository.readAll

}