package com.example.qw.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static StringBuilder equation;//运算式
    private static StringBuilder temp_operand;//临时存储合成运算数
    private static ArrayList<Double> operand;//运算数
    private static ArrayList<String> operator;//运算符
    private static int point_number;
    private static int zero_number;
    private static int sub_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化
        equation=new StringBuilder();
        temp_operand=new StringBuilder();
        operand=new ArrayList<>();
        operator=new ArrayList<>();
        point_number=0;
        zero_number=0;
        sub_number=0;
        Button zero=(Button)findViewById(R.id.zero);
        Button one=(Button)findViewById(R.id.one);
        Button two=(Button)findViewById(R.id.two);
        Button three=(Button)findViewById(R.id.three);
        Button four=(Button)findViewById(R.id.four);
        Button five=(Button)findViewById(R.id.five);
        Button six=(Button)findViewById(R.id.six);
        Button seven=(Button)findViewById(R.id.seven);
        Button eight=(Button)findViewById(R.id.eight);
        Button nine=(Button)findViewById(R.id.nine);
        Button cls=(Button)findViewById(R.id.cls);
        Button div=(Button)findViewById(R.id.div);
        Button mul=(Button)findViewById(R.id.mul);
        Button backspace=(Button)findViewById(R.id.Backspace);
        Button sub=(Button)findViewById(R.id.sub);
        Button add=(Button)findViewById(R.id.add);
        final Button equal=(Button)findViewById(R.id.equal);
        final Button point=(Button)findViewById(R.id.spot);
        final EditText result=(EditText)findViewById(R.id.result);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                 if(!(temp_operand.equals("0"))){
                     temp_operand.append("0");
                     equation.append("0");
                     result.setText(equation);
                 }
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp_operand.append("1");
                equation.append("1");
                result.setText(equation);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp_operand.append("2");
                equation.append("2");
                result.setText(equation);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp_operand.append("3");
                equation.append("3");
                result.setText(equation);
            }
        });
         four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp_operand.append("4");
                equation.append("4");
                result.setText(equation);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp_operand.append("5");
                equation.append("5");
                result.setText(equation);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp_operand.append("6");
                equation.append("6");
                result.setText(equation);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp_operand.append("7");
                equation.append("7");
                result.setText(equation);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp_operand.append("8");
                equation.append("8");
                result.setText(equation);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp_operand.append("9");
                equation.append("9");
                result.setText(equation);
            }
        });
        cls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.delete(0,equation.length());
                temp_operand.delete(0,equation.length());
                operand.clear();
                operator.clear();
                point_number=0;
                zero_number=0;
                sub_number=0;
            }
        });
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(equation.equals("")))
                {
                    char temp1=equation.charAt(equation.length()-1);
                    equation.delete(0,equation.length()-1);
                    if(temp1>='0'&&temp1<='9')
                        temp_operand.deleteCharAt(temp_operand.length()-1);
                    else if(temp1=='.')
                    {
                        point_number=0;
                        temp_operand.deleteCharAt(temp_operand.length()-1);
                    }
                    else
                    {

                    }
                }
            }
        });
    }
}
