package com.example.pingproject

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Exception
import java.util.concurrent.TimeUnit

class Menu : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val ping = findViewById<Button>(R.id.Ping)
        val ipAddress = findViewById<EditText>(R.id.IPAddress)
        val  back = findViewById<Button>(R.id.Back)

        ping?.setOnClickListener(){
            var url = ipAddress.text.toString()
            Log.v("URL", url)
            try {
                //command to run ping in android
                val process = Runtime.getRuntime().exec("system/bin/ping -c 5 $url")
                val waitFor  = process.waitFor(400,TimeUnit.MILLISECONDS)
                Log.v("WAITFOR", waitFor.toString())


                val br = BufferedReader(InputStreamReader(process.inputStream))
                val sb = StringBuilder();
                var i = 0
                br.lines().use { lines ->
                    for (it in lines) {
                        sb.append(it)

                    }
                }
                val resultsIntent = Intent(applicationContext, Results::class.java)
                resultsIntent.putExtra("RESULTS", sb.toString())
                startActivity(resultsIntent)
            }catch(e: Exception){
              Log.v("ERROR",e.toString());
            }
            }
        back?.setOnClickListener(){
            val backIntent = Intent(applicationContext,MainActivity::class.java)
            startActivity(backIntent)
        }

    }
}