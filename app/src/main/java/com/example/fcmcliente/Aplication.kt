package com.example.fcmcliente

import android.app.Application
import com.google.firebase.FirebaseApp

class Aplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Inicializa Firebase
        FirebaseApp.initializeApp(this)
    }
}