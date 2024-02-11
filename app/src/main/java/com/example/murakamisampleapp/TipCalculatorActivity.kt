package com.example.murakamisampleapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.roundToInt

/**
 * チップ計算アクティビティ
 */
class TipCalculatorActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tip_calculation)

        // 戻るボタンの表示
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // チップ計算ロジック
        findViewById<Button>(R.id.calculate_button).setOnClickListener {
            var costOfService = findViewById<EditText>(R.id.cost_of_service)
            val tipOptions = findViewById<RadioGroup>(R.id.tip_options)
            val result = findViewById<TextView>(R.id.tip_result_value)

            // 選択されたラジオボタンを取得
            var percent = 0.0

            when (tipOptions.checkedRadioButtonId) {
                R.id.option_twenty_percent -> percent = 0.2
                R.id.option_eighteen_percent -> percent = 0.18
                R.id.option_fifteen_percent -> percent = 0.15
                else -> Log.w("tip calculation","not exist percent")
            }

            // 計算したチップの結果を画面に反映
            val tip = (costOfService.text.toString().toDouble() * percent).roundToInt()
            result.text = "¥$tip"
        }
    }

    // メイン画面に戻る
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}