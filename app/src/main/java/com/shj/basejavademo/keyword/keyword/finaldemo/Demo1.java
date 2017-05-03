package com.shj.basejavademo.keyword.keyword.finaldemo;

/**
 * Created by Reus on 2017/5/3.
 */

public final class Demo1  {
    public final String test = "shj";
    public final int Y;


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.final1);
//
//    }

//    public void click(View v) {
//        test = "hahah";
//    }
private final String S = "final实例变量S";
    private final int A = 100;
    public final int B = 90;

    public static final int C = 80;
    private static final int D = 70;

    public final int E; //final空白,必须在初始化对象的时候赋初值

    public Demo1(int x) {
        E = x;
        Y = 2;
    }
}
