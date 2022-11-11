package com.tabr;

public class ExampleTwo { // Класс exampleTwo
    public static void main(String[] args) {
        ExampleTwo example = new ExampleTwo(); // Создали объект класса ExampleTwo
        example.printNumber(); // Вывели значение переменной number объекта example
        example.setNumber(10); // Изменили значение переменной number объекта example
        example.printNumber(); // Вывели измененное значение переменной number объекта example
    }

    private int number = 0; // Свойство (переменная) класса

    public ExampleTwo() { // Конструктор класса

    }

    public void setNumber(int number) { // Метод, устанавливающий значение переменной number
        this.number = number;
    }


    public void printNumber() {
        System.out.println(number);// Метод, отображающий значение переменной number
    }


}
