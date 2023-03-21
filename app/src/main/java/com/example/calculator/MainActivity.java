package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.calculator.databinding.ActivityMainBinding;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;
    private String result = "";
    private String input = "";
    private Integer resultToNumber = 0;
    private Double inputToDouble = 0.0;
    private Double resultDouble = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.inputText.setText("0");

        binding.cal0Btn.setOnClickListener(this);
        binding.cal1Btn.setOnClickListener(this);
        binding.cal2Btn.setOnClickListener(this);
        binding.cal3Btn.setOnClickListener(this);
        binding.cal4Btn.setOnClickListener(this);
        binding.cal5Btn.setOnClickListener(this);
        binding.cal6Btn.setOnClickListener(this);
        binding.cal7Btn.setOnClickListener(this);
        binding.cal8Btn.setOnClickListener(this);
        binding.cal9Btn.setOnClickListener(this);
        binding.plusBtn.setOnClickListener(this);
        binding.minBtn.setOnClickListener(this);
        binding.equalBtn.setOnClickListener(this);
        binding.dotBtn.setOnClickListener(this);
    }

    /*
    아이폰 계산기처럼 디폴트 값을 0으로 해놓고 : ok
    -> 정수가 입력되면 0을 해당 숫자로 변경 : ok
    -> 소수점이 입력되면 0 다음에 . 찍기 : ok

    연산 전에 정수인지 실수인지 검사하기
    연산 후 input은 빈 문자열로 변경
    * */

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cal0Btn:
                if (!binding.inputText.getText().toString().equals("0")) {
                    input += "0";
                    binding.inputText.setText(input);
                }
                break;
            case R.id.cal1Btn:
                input += "1";
                binding.inputText.setText(input);
                break;
            case R.id.cal2Btn:
                input += "2";
                binding.inputText.setText(input);
                break;
            case R.id.cal3Btn:
                input += "3";
                binding.inputText.setText(input);
                break;
            case R.id.cal4Btn:
                input += "4";
                binding.inputText.setText(input);
                break;
            case R.id.cal5Btn:
                input += "5";
                binding.inputText.setText(input);
                break;
            case R.id.cal6Btn:
                input += "6";
                binding.inputText.setText(input);
                break;
            case R.id.cal7Btn:
                input += "7";
                binding.inputText.setText(input);
                break;
            case R.id.cal8Btn:
                input += "8";
                binding.inputText.setText(input);
                break;
            case R.id.cal9Btn:
                input += "9";
                binding.inputText.setText(input);
                break;
            case R.id.plusBtn:
//                 문자열에 .가 포함되어 있는지 확인 : ok
//                 3.3 + 2 일 경우는?
//                 result값은 통일해야함
//                 3.3 을 double형 input에 넣어놓고, 2를 더하면
//                if (input.contains(".")) {
//                    double inputToDouble = Double.parseDouble(input);
//                    resultDouble += inputToDouble;
//                    input = "0";
//                    binding.inputText.setText(String.valueOf(resultDouble));
//                } else {
//                    double inputToDouble = Double.parseDouble(input);
//                    resultDouble += inputToDouble;
//                    input = "0";
//                    binding.inputText.setText(String.valueOf(resultDouble));
//                }
                inputToDouble = Double.parseDouble(input);
                resultDouble += inputToDouble;
                input = "";
                // binding.inputText.setText(String.valueOf(resultDouble));
                break;
            case R.id.minBtn:
                inputToDouble = Double.parseDouble(input);
                resultDouble -= inputToDouble;
                input = "";
                // binding.inputText.setText(String.valueOf(resultDouble));
                break;
            case R.id.equalBtn:
                binding.resultText.setText(String.valueOf(resultDouble));
                break;
            case R.id.dotBtn:
                if (binding.inputText.getText().toString().equals("0")) {
                    input += "0.";
                    binding.inputText.setText(input);
                } else {
                    input += ".";
                    binding.inputText.setText(input);
                }
                break;
        }
    }
}