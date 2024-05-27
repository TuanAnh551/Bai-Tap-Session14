package org.example;

import org.example.InputValidate;

public class Exercise2 {
    public static void main(String[] args) {
        InputValidate inputValidate = new InputValidate();
        int intNumber = inputValidate.getInt("Moi ban nhap 1 so nguyen: ");
        System.out.println("So nguyen ban vua nhap la: " + intNumber);
        double doubleNumber = inputValidate.getDouble("Moi ban nhap 1 so thuc: ");
        System.out.println("So thuc ban vua nhap la: " + doubleNumber);
        String string = inputValidate.getString("Moi ban nhap 1 chuoi: ");
        System.out.println("Chuoi ban vua nhap la: " + string);
        boolean bool = inputValidate.getBoolean("Moi ban nhap 1 gia tri boolean: ");
        System.out.println("Gia tri boolean ban vua nhap la: " + bool);

    }
}
