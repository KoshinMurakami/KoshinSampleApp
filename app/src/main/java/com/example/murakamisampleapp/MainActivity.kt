package com.example.murakamisampleapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

/**
 * メインアクティビティ
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // チップ計算画面に遷移
        findViewById<Button>(R.id.tip_calculator_btn).setOnClickListener {
            val intent = Intent(this@MainActivity, TipCalculatorActivity::class.java)
            startActivity(intent)
        }
    }
}