package com.example.retorecycleview


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.retorecycleview.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val fakeVideoData: Array<JSONObject> = arrayOf(
            JSONObject("{\"nombre\": \"Isidro Rodriguez Fuerte\", \"amigos\": \"43 amigos en comun\"}"),
            JSONObject("{\"nombre\": \"Antonio Torres\", \"amigos\": \"18 amigos en comun\"}"),
            JSONObject("{\"nombre\": \"Car Munguia\", \"amigos\": \"213 amigos en comun\"}"),
            JSONObject("{\"nombre\": \"Orlando Ochma\", \"amigos\": \"23 amigos en comun\"}"),
            JSONObject("{\"nombre\": \"Sandra Bautista\", \"amigos\": \"12 amigos en comun\"}")
        )

        binding.rvVideoYoutube.adapter = MainAdapter(fakeVideoData)
    }
}

