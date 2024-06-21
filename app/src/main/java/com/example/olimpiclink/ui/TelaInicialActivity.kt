package com.example.olimpiclink.ui

import DAO
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.olimpiclink.databinding.ActivityTelaInicialBinding
import com.example.olimpiclink.ui.activity.LoginActivity

class MainActivity : ComponentActivity() {
    lateinit var binding: ActivityTelaInicialBinding
    public lateinit var dao : DAO;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaInicialBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.activityMainBtnEntrar.setOnClickListener{
            login()
        }
    }

    private fun login() {
        startActivity(Intent(this@MainActivity,LoginActivity::class.java))
    }

    fun register(view : View){
        startActivity(Intent(this@MainActivity,RegisterUserActivity::class.java))
    }

}