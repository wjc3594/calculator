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
                         //显示运算式
                         result.setText(show_equation);
                         //将光标定位到文本末尾
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
        //接下来1到9每个控件依次进行此设置
        //保证若是在结果上进行输入时清除结果然后显示点击的数字
        //若是正常输入则直接在运算式末尾加上点击的数字并显示
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
        //清屏
        cls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_equation.delete(0,show_equation.length());
                calculate_equation.clear();
                signal=0;
                result.setText("");
            }
        });
        //后退键
        //若在结果上使用，则直接清屏
        //正常输入时使用，后退一格
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
        //小数点的点击事件
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //正常输入时点击小数点的处理逻辑
                if(signal==0){
                    //把运算式赋给字符串a
                    String a=show_equation.toString();
                    //运算式为空，直接加一个小数点并显示
                    if(a.equals("")){
                        show_equation.append(".");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                    }
                    //运算式不为空
                    else{
                        int i;
                        char t='0';
                        //从运算式末尾向前遍历，碰到'.''+''-''*''/'后结束遍历退出
                        for(i=a.length();i>0;i--){
                            t=a.charAt(i-1);
                            if(t=='.'||t=='+'||t=='-'||t=='*'||t=='/')
                                break;
                        }
                        //i==0表示遍历运算式没有发现'.''+''-''*''/'，则直接在运算式末尾加小数点
                        if(i==0){
                            show_equation.append(".");
                            result.setText(show_equation);
                            result.setSelection(result.getText().length());
                        }
                        //在碰到小数点前碰到了'+''-''*''/'，也直接在运算式末尾加小数点
                        else if(t=='+'||t=='-'||t=='*'||t=='/'){
                            show_equation.append(".");
                            result.setText(show_equation);
                            result.setSelection(result.getText().length());
                        }
                        //以上条件均不满足，若说明遍历碰到了小数点，因为一个数不能同时有两个小数点，所以此次点击小数点不做处理
                    }
                }
                //在结果上点击小数点，直接清屏然后加上小数点并显示
                else{
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
                if(!show_equation.toString().equals("")&&!(show_equation.toString().equals("错误"))){
                    signal = 1;//表示在输入结果上
                    char temp = show_equation.charAt(show_equation.length() - 1);//把运算式的最后一个字符赋给temp
                    if (show_equation.charAt(0) == '-')//如果运算式的第一个字符是'-'，说明用户是想输入一个负数
                        show_equation.insert(0, "0");//此时在运算式的最前面加一个0,用'0-运算数'表示负数
                    if (temp == '+' || temp == '-')//若为加减
                        show_equation.append("0");//则结尾默认加减零
                    if (temp == '*' || temp == '/')//若为乘除
                        show_equation.append("1");//则结尾默认乘除1
                    StringBuilder temp1=new StringBuilder();
                    //从头遍历运算式
                    for(int i=0;i<show_equation.length();i++){
                        if(show_equation.charAt(i)>='0'&&show_equation.charAt(i)<='9'||show_equation.charAt(i)=='.'){
                            //如果是连着的数字和小数点，那就一个一个的拼到temp1中，作为一个完整的运算数
                            temp1.append(String.valueOf(show_equation.charAt(i)));
                        }else if(show_equation.charAt(i)=='N'){
                            //如果是NaN就直接把'NaN'加进计算式里
                            calculate_equation.add("NaN");
                            //跳过2个字符
                            i=i+2;
                        }else if(show_equation.charAt(i)=='∞'){
                            //如果是∞就直接把'∞'加进计算式里
                            calculate_equation.add("∞");
                        }
                        else//这种就是遍历到'+''-''*''/'这四种运算符的情况
                        {
                            //如果temp1长度不为0，说明运算符前有运算数，则把该运算数添加进计算式中并清空temp1中的内容
                            if(temp1.length()!=0){
                                calculate_equation.add(temp1.toString());
                                temp1.delete(0,temp1.length());
                            }
                            //把运算符添加进去
                            calculate_equation.add(String.valueOf(show_equation.charAt(i)));
                        }
                    }
                    //把最后一个运算数加进运算式里
                    if(temp1.length()!=0){
                        calculate_equation.add(temp1.toString());
                    }
                    calculate_equation.add("#");
                    //调用calculate计算出结果返回给temp8
                    String temp8=calculate(calculate_equation);
                    result.setText(temp8);
                    result.setSelection(result.getText().length());
                    //清空运算式和计算式
                    show_equation.delete(0,show_equation.length());
                    calculate_equation.clear();
                    //将结果赋给运算式
                    show_equation.append(temp8);
                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断用户是否输入了内容
                if(!(show_equation.toString().equals(""))&&!(show_equation.toString().equals("错误"))) {
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
                if(!(show_equation.toString().equals(""))&&!(show_equation.toString().equals("错误"))) {
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
                else if(!(show_equation.toString().equals("错误"))){
                    signal=0;
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
                if(!(show_equation.toString().equals(""))&&!(show_equation.toString().equals("错误"))) {
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
                if(!(show_equation.toString().equals(""))&&!(show_equation.toString().equals("错误"))) {
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
            //如果两个运算数只要有一个是非数'NaN'，就直接运算即可
            return d1+d2;
        }
        //BigDecimal为精确计算的一个数据类型，你可以理解为使用它进行计算结果将更准确
        BigDecimal b1 = new BigDecimal(Double.toString(d1));
        BigDecimal b2 = new BigDecimal(Double.toString(d2));
        //进行计算并将结果转为double返回
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
    //这个方法就是用来计算结果的，在344行被调用，参数为计算式
    //里面过程比较复杂，你需先弄懂后缀表达式，然后可对照理解大概流程意思即可
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
                }else if(temp4.equals(".")){
                    return "错误";
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
