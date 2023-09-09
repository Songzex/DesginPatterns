package org.example.creationalpttern;

public class Singetons {
    private static Singetons  singletons;
    private Singetons(){
        System.out.println("创建对象");
    }
    public  static  Singetons getSinngletion(){
         if (singletons == null){
             singletons = new Singetons();
         }
        return  singletons;
    }

    public void  dosomrething(){
        System.out.println("dosomeing");
    }
}


