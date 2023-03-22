package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.calculator.databinding.ActivityMainBinding;

import java.util.Objects;

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityMainBinding
    private var input = ""
    private var operator = ""
    private var initValue = 0;

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.cal0Btn.setOnClickListener(this)
        binding.cal1Btn.setOnClickListener(this)
        binding.cal2Btn.setOnClickListener(this)
        binding.cal3Btn.setOnClickListener(this)
        binding.cal4Btn.setOnClickListener(this)
        binding.cal5Btn.setOnClickListener(this)
        binding.cal6Btn.setOnClickListener(this)
        binding.cal7Btn.setOnClickListener(this)
        binding.cal8Btn.setOnClickListener(this)
        binding.cal9Btn.setOnClickListener(this)
        binding.plusBtn.setOnClickListener(this)
        binding.minBtn.setOnClickListener(this)
        binding.divBtn.setOnClickListener(this)
        binding.mulBtn.setOnClickListener(this)
        binding.dotBtn.setOnClickListener(this)
        binding.clearBtn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.cal0Btn -> {
                if (binding.resultText.text != "0") {

                }
                input += 0
            }
            R.id.cal1Btn -> {
                input += "1"
            }
            R.id.plusBtn -> {
                operator = "+"
                initValue += input.toInt()
            }
        }
    }

}