package com.example.promedio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityMesaje : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mesaje)

        val campoMesaje = findViewById<TextView>(R.id.txtMensaje)

        //Se recupera la informacion que llega del intent
        var miBundle: Bundle? = this.intent.extras

        //Se asigna la informacion obtenida del TextView
        if (miBundle != null){
            campoMesaje.text = "Hola ${miBundle.getString("Nombre")} Bienvenido"
        }

        val botonSalir:Button = findViewById(R.id.btnSalir)
        botonSalir.setOnClickListener{onClick()}
    }

    private fun onClick(){
        finish()
    }
}