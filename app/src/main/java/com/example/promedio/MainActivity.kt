package com.example.promedio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.os.bundleOf

class MainActivity : AppCompatActivity() {
    var campoTexto: EditText? = null
    var txtResultado: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        campoTexto=findViewById(R.id.inputName)
        txtResultado=findViewById(R.id.txtResultado)

        val miBoton: Button =findViewById(R.id.btnIngresar)
        miBoton.setOnClickListener{onClick(1)}

        val miBoton2: Button =findViewById(R.id.btnIngresar2)
        miBoton2.setOnClickListener{onClick(2)}
    }

    private fun onClick(boton: Int){
        when(boton){
            1 ->{
                var nombre:String = campoTexto!!.text.toString()
                txtResultado!!.text="Bienvenido $nombre"
                Toast.makeText(this, "Bienvenido $nombre", Toast.LENGTH_LONG).show()
            }
            2 ->{
                //Se crea el intent encargador de la comunicacion entre activities
                val intent = Intent(this, ActivityMesaje::class.java)
                //Creamos el bundle para el paso de informacion entre activities
                val miBundle:Bundle = Bundle()
                miBundle.putString("Nombre", campoTexto!!.text.toString())
                //Se le agrega informacion al intent para que sea enviada
                intent.putExtras(miBundle)
                //Iniciamos el llamado a la nueva actividad
                startActivity(intent)
            }
        }
    }
}