package com.revin.toastkotlin

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.show_toast_button)

        button.setOnClickListener {
            // Инфлейтим (загружаем) наш кастомный макет
            val inflater = layoutInflater
            val layout = inflater.inflate(R.layout.custom_layout, null)

            // Создаем и настраиваем Toast
            val toast = Toast(applicationContext)
            toast.setGravity(Gravity.CENTER, 0, 0)  // Позиция в центре
            toast.duration = Toast.LENGTH_LONG      // Длительность показа
            toast.view = layout                     // Устанавливаем наш макет
            toast.show()                            // Показываем
        }
    }
}
