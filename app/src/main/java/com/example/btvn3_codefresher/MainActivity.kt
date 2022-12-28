package com.example.btvn3_codefresher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View.OnClickListener
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     edt_password.addTextChangedListener(object : TextWatcher{
         override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
             // trước khi người dùng nhập

         }

         override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
             // người dùng đang nhập

         }

         override fun afterTextChanged(s: Editable?) {
             // sau khi người dùng nhập xong
             var inputPassword: String = edt_password.text.toString().trim()

             if (inputPassword.length < 6){
                 edt_password.setError("Xin mời nhập mật khẩu trên 6 kí tự")
             }
             else{
                 edt_password.setError(null)
             }


         }

     })

     btn_Login.setOnClickListener {
         var pass : String = "vuminhduy"
         var inputPassword: String = edt_password.text.toString().trim()
         if (inputPassword.toString().equals(pass)){
             var intent = Intent(this@MainActivity, MainActivity2::class.java)
             startActivity(intent)
             finish()

         }
         else{
             Toast.makeText(this,"Xin mời nhập lại",Toast.LENGTH_LONG).show()
         }


     }


    }
}