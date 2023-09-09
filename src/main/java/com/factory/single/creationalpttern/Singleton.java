package org.example.creationalpttern;

public class Singleton {
    private static  Singleton instances;
    private Singleton(){
        System.out.println("对象已经被创建");
    }

    public static  Singleton getInstance(){
        if(instances==null) {
            instances = new Singleton();
        }
        return  instances;
    }
    public void doSomething(){
        System.out.println(
                "对象的调用方法"
        );
    }






}
