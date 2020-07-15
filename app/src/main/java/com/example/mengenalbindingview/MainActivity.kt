package com.example.mengenalbindingview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.mengenalbindingview.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var bindingView: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        bindingView = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingView.root)

        ktSynt.setOnClickListener {
            Log.w("ktSynt", "Kotlin Synthetic diklik")
        }

        val buttonViewId: Button = findViewById(R.id.fViewId)

        buttonViewId.setOnClickListener {
            Log.w("fwId", "FindViewById diklik")
        }

        binding.dtBind.setOnClickListener {
            Log.w("dtBind", "Data Binding diklik")
        }

        bindingView.viewBind.setOnClickListener{
            Log.w("vBind", "View Binding diklik")
        }
    }
}

