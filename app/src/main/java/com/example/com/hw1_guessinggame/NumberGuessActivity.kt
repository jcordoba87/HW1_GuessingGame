package com.example.com.hw1_guessinggame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random


class NumberGuessActivity : AppCompatActivity() {

    var aleatorio = Random.nextInt(1,1000)
    var intentos = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_guess)
    }

    fun JugarAleatorio(v: View){
        intentos++
        var numerodeusuario = findViewById<EditText>(R.id.NumeroUsuario).text.toString().toInt()

            if (numerodeusuario > aleatorio) {
                findViewById<TextView>(R.id.textViewMensajeRespuesta).setText("El numero es bajo").toString()


            } else if (numerodeusuario < aleatorio) {
                findViewById<TextView>(R.id.textViewMensajeRespuesta).setText("El numero es alto").toString()


            } else {
                findViewById<TextView>(R.id.textViewMensajeRespuesta).setText("¡Adivinaste el numero, Felicidades!").toString()
                findViewById<TextView>(R.id.textViewIntentos).setText("Tus intentos fueron: " + intentos).toString()

            }
    }

    fun ReiniciarJuego(v: View){

        intentos = 0
        aleatorio = Random.nextInt(1, 1000)
        findViewById<TextView>(R.id.textViewMensajeRespuesta).setText("")
        findViewById<TextView>(R.id.textViewIntentos).setText("")

    }


}