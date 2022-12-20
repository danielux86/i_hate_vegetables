package com.daniele.ihatevegetables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.voice.VoiceInteractionSession.ActivityId
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var listId: List<Int>  //dichiarazione lista di Int, interi perchè le id delle immagini sono appunto numeri interi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeList()  //richiamiamo la lista

        button.setOnClickListener {
            pickVegetable()            //utilizziamo il metodo lambda setOnClickListener che ci permette di gestire tutto più semplicemente, selezioniamo pickVegetable
        }

        pickVegetable()   //richiamiamo pickVegetables, lo mettiamo al di fuori della button.setOnClickListener perchè così quando lanceremo per la prima volta l'app mostrerà già un vegetables

    }

    private fun pickVegetable() {
        imageView.setImageResource(listId.random())  //richiamiamo il metodo setImageResource e utilizziamo .random, è una funzione Kotlin che seleziona appunto casualmente un elemento dalla listId
    }

    private fun initializeList() {  //inizializzazione della lista di elementi che verranno estratti in seguito in maniera random dalla funzione pickVegestable
        listId = listOf(
            R.drawable.icon_artichoke,
            R.drawable.icon_asparagus,
            R.drawable.icon_beans,
            R.drawable.icon_broccoli,
            R.drawable.icon_beep,
            R.drawable.icon_bell_pepper,
            R.drawable.icon_cabbage,
            R.drawable.icon_carrot,
            R.drawable.icon_cauliflower,
            R.drawable.icon_chili_pepper,
            R.drawable.icon_cucumber,
            R.drawable.icon_date_fruit,
            R.drawable.icon_eggplant,
            R.drawable.icon_garlic,
            R.drawable.icon_peas,
            R.drawable.icon_pepper,
            R.drawable.icon_potato,
            R.drawable.icon_pumpkin,
            R.drawable.icon_radish,
            R.drawable.icon_redonion,
            R.drawable.icon_salad,
            R.drawable.icon_spinach,
            R.drawable.icon_turnip
            )
    }

}