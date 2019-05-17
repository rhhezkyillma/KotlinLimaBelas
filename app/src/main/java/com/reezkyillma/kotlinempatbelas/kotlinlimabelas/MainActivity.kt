package com.reezkyillma.kotlinempatbelas.kotlinlimabelas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.reezkyillma.kotlinempatbelas.kotlinlimabelas.activitiesAnimationAction.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerview.layoutManager = LinearLayoutManager(this)

        val items = ArrayList<RocketAnimationItem>()

        items.add(RocketAnimationItem("Lepas Landas", Intent(this, LaunchRocketValue::class.java)))
        items.add(RocketAnimationItem("Rocket Muter", Intent(this, RocketMuter::class.java)))
        items.add(RocketAnimationItem("Rocket Tambah Cepat", Intent(this, RocketTambahCepet::class.java)))
        items.add(RocketAnimationItem("Object Lepas Landas", Intent(this, LaunchRocketObject::class.java)))
        items.add(RocketAnimationItem("Main In Background", Intent(this, MaininBackground::class.java)))
        items.add(RocketAnimationItem("Muter Ngegas", Intent(this, MuterNgegas::class.java)))
        items.add(RocketAnimationItem("Muter Ngegas Dua", Intent(this, MuterNgegas2::class.java)))
        items.add(RocketAnimationItem("Terbang Bareng", Intent(this, TerbangBareng::class.java)))
        items.add(RocketAnimationItem("With Listener", Intent(this, WithListener::class.java)))
        items.add(RocketAnimationItem("Maju Mundur", Intent(this, MajuMundur::class.java)))
        items.add(RocketAnimationItem("With XML", Intent(this, WithXml::class.java)))
        recyclerview.adapter = RocketAdapter(this,items)
    }
}
