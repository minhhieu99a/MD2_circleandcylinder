package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle circle=new Circle(5,"đen");
        System.out.println(circle.toString());
        Cylinder cylinder= new Cylinder(4,"đỏ",5);
        System.out.println(cylinder.toString());
    }
}
