package com.example.signup

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.signup.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnSignUp.setOnClickListener {
            val email = binding.inputEmail.editText?.text.toString()
            val fullname = binding.inputFullname.editText?.text.toString()
            val username = binding.inputUsername.editText?.text.toString()
            val password = binding.inputPassword.editText?.text.toString()

            Toast.makeText(this, "Email: $email, Fullname: $fullname, Username: $username, Password: $password", Toast.LENGTH_LONG).show()
        }

    }
}