package com.example.enumtype;
//이넘은 인터페이스를 구현하고, 해당 인터페이스를 오버라이딩하여 구현할 수 있다.
public interface Printer {
    public void print();
}


//public enum Color implements Printer {
//    RED("FF0000"),
//    GREEN("00FF00"),
//    blue("0000FF");
//
//    private String rgb;
//
//    private Color(String rgb) {
//        this.rgb = rgb;
//    }
//
//    @Override
//    public void print() {
//        System.out.println();
//    }
//}