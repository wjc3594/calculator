package com.example.qw.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    private  StringBuilder show_equation=new StringBuilder();//显示运算式
    private  ArrayList calculate_equation;//计算式
    private  int signal=0;//为0 时表示刚输入状态；为1 时表示当前在输出结果上继续输入
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化
        show_equation=new StringBuilder();
        calculate_equation=new ArrayList<>();
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
        result.setCursorVisible(true);
        disableShowInput(result);
        //点击文本框时光标始终在文本末尾
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setSelection(result.getText().length());
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                 if(!(show_equation.toString().equals("0"))){
                     if(signal==0){
                         show_equation.append("0");
                         result.setText(show_equation);
                         result.setSelection(result.getText().length());
                     }else{
                         show_equation.delete(0,show_equation.length());
                         show_equation.append("0");
                         result.setText(show_equation);
                         result.setSelection(result.getText().length());
                         signal=0;
                     }
                 }
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("1");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("1");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal=0;
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("2");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("2");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal=0;
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("3");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("3");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal=0;
                }
            }
        });
         four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("4");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("4");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal=0;
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("5");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("5");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal=0;
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("6");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("6");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal=0;
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("7");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("7");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal=0;
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("8");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("8");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal=0;
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("9");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("9");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal=0;
                }
            }
        });
        cls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_equation.delete(0,show_equation.length());
                calculate_equation.clear();
                signal=0;
                result.setText("");
            }
        });
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(show_equation.toString().equals(""))) {
                    if(signal==0){
                        show_equation.deleteCharAt(show_equation.length() - 1);
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                    }else{
                        show_equation.delete(0,show_equation.length());
                        result.setText("");
                        signal=0;
                    }
                }
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    String a=show_equation.toString();
                    if(a.equals("")){
                        show_equation.append(".");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                    }else{
                        int i;
                        char t='0';
                        for(i=a.length();i>0;i--){
                            t=a.charAt(i-1);
                            if(t=='.'||t=='+'||t=='-'||t=='*'||t=='/')
                                break;
                        }
                        if(i==0){
                            show_equation.append(".");
                            result.setText(show_equation);
                            result.setSelection(result.getText().length());
                        }else if(t=='+'||t=='-'||t=='*'||t=='/'){
                            show_equation.append(".");
                            result.setText(show_equation);
                            result.setSelection(result.getText().length());
                        }
                    }
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append(".");
                    result.setText(".");
                    result.setSelection(result.getText().length());
                    signal=0;
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断用户是否输入了内容
                if(!show_equation.toString().equals("")){
                    signal=1;
                    char temp=show_equation.charAt(show_equation.length()-1);
                    if(show_equation.charAt(0)=='-')
                        show_equation.insert(0,"0");
                    if(temp=='+'||temp=='-')
                        show_equation.append("0");
                    if(temp=='*'||temp=='/')
                        show_equation.append("1");
                    StringBuilder temp1=new StringBuilder();
                    for(int i=0;i<show_equation.length();i++){
                        if(show_equation.charAt(i)>='0'&&show_equation.charAt(i)<='9'||show_equation.charAt(i)=='.'){
                            temp1.append(String.valueOf(show_equation.charAt(i)));
                        }else if(show_equation.charAt(i)=='N'){
                            calculate_equation.add("NaN");
                            //跳过2个字符
                            i=i+2;
                        }else if(show_equation.charAt(i)=='∞'){
                            calculate_equation.add("∞");
                        }
                        else
                        {
                            if(temp1.length()!=0){
                                calculate_equation.add(temp1.toString());
                                temp1.delete(0,temp1.length());
                            }
                            calculate_equation.add(String.valueOf(show_equation.charAt(i)));
                        }
                    }
                    if(temp1.length()!=0){
                        calculate_equation.add(temp1.toString());
                    }
                    calculate_equation.add("#");
                    String temp8=calculate(calculate_equation);
                    result.setText(temp8);
                    result.setSelection(result.getText().length());
                    show_equation.delete(0,show_equation.length());
                    calculate_equation.clear();
                    show_equation.append(temp8);
                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断用户是否输入了内容
                if(!(show_equation.toString().equals(""))) {
                    signal=0;
                    char temp=show_equation.charAt(show_equation.length()-1);
                    if(temp=='+'||temp=='-'||temp=='*'||temp=='/')
                    {
                        show_equation.deleteCharAt(show_equation.length()-1);
                        show_equation.append("+");
                    }
                    else
                        show_equation.append("+");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断用户是否输入了内容
                if(!(show_equation.toString().equals(""))) {
                    signal=0;
                    char temp=show_equation.charAt(show_equation.length()-1);
                    if(temp=='+'||temp=='-'||temp=='*'||temp=='/')
                    {
                        show_equation.deleteCharAt(show_equation.length()-1);
                        show_equation.append("-");
                    }
                    else
                        show_equation.append("-");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断用户是否输入了内容
                if(!(show_equation.toString().equals(""))) {
                    signal=0;
                    char temp=show_equation.charAt(show_equation.length()-1);
                    if(temp=='+'||temp=='-'||temp=='*'||temp=='/')
                    {
                        show_equation.deleteCharAt(show_equation.length()-1);
                        show_equation.append("*");
                    }
                    else
                        show_equation.append("*");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断用户是否输入了内容
                if(!(show_equation.toString().equals(""))) {
                    signal=0;
                    char temp=show_equation.charAt(show_equation.length()-1);
                    if(temp=='+'||temp=='-'||temp=='*'||temp=='/')
                    {
                        show_equation.deleteCharAt(show_equation.length()-1);
                        show_equation.append("/");
                    }
                    else
                        show_equation.append("/");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }
            }
        });
    }
    protected boolean operatorPriorityCompare(char operator1,char operator2)
    {
        int o1=0;
        int o2=0;
        switch (operator1){
            case '+':{o1=0;break;}
            case '-':{o1=0;break;}
            case '*':{o1=1;break;}
            case '/':{o1=1;break;}
        }
        switch (operator2){
            case '+':{o2=0;break;}
            case '-':{o2=0;break;}
            case '*':{o2=1;break;}
            case '/':{o2=1;break;}
        }
        if(o1<=o2)
        {
            return false;
        }
        else
            return true;
    }
    //相加
    public static Double Add(Double d1,Double d2) {
        if(d1==Double.NEGATIVE_INFINITY||d1==Double.POSITIVE_INFINITY||d2==Double.NEGATIVE_INFINITY||d2==Double.POSITIVE_INFINITY){
            return d1+d2;
        }
        if(String.valueOf(d1).equals("NaN")||String.valueOf(d1).equals("NaN")){
            return d1+d2;
        }
        BigDecimal b1 = new BigDecimal(Double.toString(d1));
        BigDecimal b2 = new BigDecimal(Double.toString(d2));
        return b1.add(b2).doubleValue();
    }
    //相减
    public static Double Sub(Double d1,Double d2){
        if(d1==Double.NEGATIVE_INFINITY||d1==Double.POSITIVE_INFINITY||d2==Double.NEGATIVE_INFINITY||d2==Double.POSITIVE_INFINITY){
            return d1-d2;
        }
        if(String.valueOf(d1).equals("NaN")||String.valueOf(d1).equals("NaN")){
            return d1-d2;
        }
        if(String.valueOf(d1).equals("NaN")||String.valueOf(d1).equals("NaN")){
            return d1*d2;
        }
        BigDecimal b1=new BigDecimal(Double.toString(d1));
        BigDecimal b2=new BigDecimal(Double.toString(d2));
        return b1.subtract(b2).doubleValue();
    }
    //相乘
    public static Double Mul(Double d1,Double d2){
        if(d1==Double.NEGATIVE_INFINITY||d1==Double.POSITIVE_INFINITY||d2==Double.NEGATIVE_INFINITY||d2==Double.POSITIVE_INFINITY){
            return d1*d2;
        }
        if(String.valueOf(d1).equals("NaN")||String.valueOf(d1).equals("NaN")){
            return d1*d2;
        }
        BigDecimal b1=new BigDecimal(Double.toString(d1));
        BigDecimal b2=new BigDecimal(Double.toString(d2));
        return b1.multiply(b2).setScale(8).doubleValue();
    }
    //相除
    public static Double Div(Double d1,Double d2){
        if(d1==Double.NEGATIVE_INFINITY||d1==Double.POSITIVE_INFINITY||d2==Double.NEGATIVE_INFINITY||d2==Double.POSITIVE_INFINITY){
            return d1/d2;
        }
        if(String.valueOf(d1).equals("NaN")||String.valueOf(d1).equals("NaN")){
            return d1/d2;
        }
        if(d1==0.0&&d2==0.0){
            return Double.NaN;
        }
        if(d2==0.0){
            return d1/d2;
        }
        BigDecimal b1=new BigDecimal(Double.toString(d1));
        BigDecimal b2=new BigDecimal(Double.toString(d2));
        return b1.divide(b2,8,BigDecimal.ROUND_HALF_UP).doubleValue();
    }
    protected String calculate(ArrayList equation){
        Double temp2;
        Double temp3;
        Double result;
        List operator=new ArrayList();
        List<Double> operand=new ArrayList();
        for(int i=0;i<equation.size();i++)
        {
            String temp4=(String) equation.get(i);
            if(temp4.equals("+")||temp4.equals("-")||temp4.equals("*")||temp4.equals("/"))
            {
                if(operator.size()>0)
                {
                    String temp5=operator.get(operator.size()-1).toString();
                    while(!(operatorPriorityCompare(temp4.charAt(0),temp5.charAt(0)))&&operator.size()>0)
                    {
                        operator.remove(operator.size()-1);
                        temp3=operand.get(operand.size()-1);
                        operand.remove(operand.size()-1);
                        temp2=operand.get(operand.size()-1);
                        operand.remove(operand.size()-1);
                        switch (temp5.charAt(0)){
                            case '+':{result=Add(temp2,temp3);operand.add(result);break;}
                            case '-':{result=Sub(temp2,temp3);operand.add(result);break;}
                            case '*':{result=Mul(temp2,temp3);operand.add(result);break;}
                            case '/':{result=Div(temp2,temp3);operand.add(result);break;}
                        }
                        if(operator.size()>0)
                        {
                            temp5=operator.get(operator.size()-1).toString();
                        }
                        else
                            break;
                    }
                    operator.add(temp4);
                }
                else
                    operator.add(temp4);
            }
            else if(temp4.equals("#"))
            {
                while(operator.size()>0)
                {
                    String temp6=(String)operator.get(operator.size()-1);
                    operator.remove(operator.size()-1);
                    temp3=operand.get(operand.size()-1);
                    operand.remove(operand.size()-1);
                    temp2=operand.get(operand.size()-1);
                    operand.remove(operand.size()-1);
                    switch (temp6.charAt(0)){
                        case '+':{result=Add(temp2,temp3);operand.add(result);break;}
                        case '-':{result=Sub(temp2,temp3);operand.add(result);break;}
                        case '*':{result=Mul(temp2,temp3);operand.add(result);break;}
                        case '/':{result=Div(temp2,temp3);operand.add(result);break;}
                    }
                }
            }
            else
            {
                if(temp4.equals("NaN")){
                    operand.add(Double.NaN);
                }else if(temp4.equals("∞")){
                    operand.add(Double.POSITIVE_INFINITY);
                }else{
                    operand.add(Double.parseDouble(temp4));
                }
            }
        }
        if(operand.get(0)==Double.NEGATIVE_INFINITY) return "-∞";
        if(operand.get(0)==Double.POSITIVE_INFINITY) return "∞";
        return operand.get(0).toString();
    }
    //当API最低版小于21时使用这个函数实现点击文本框不弹出键盘
    public void disableShowInput(EditText et) {
        Class<EditText> cls = EditText.class;
        Method method;
        try {
            method = cls.getMethod("setShowSoftInputOnFocus", boolean.class);
            method.setAccessible(true);
            method.invoke(et, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
