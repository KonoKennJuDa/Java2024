package Course1.Lesson5;

import javax.management.monitor.StringMonitor;

public class Car {

    //Static fields. Статик пренадлежит шаблону и назначен заранее один на всех. Доступ имеется из шаблона и из объекта
    public static int wheelsNumber = 0;

    //Fields (поля). Не статические переменные пренадлежат объекту и доступны только из объекта
    private String model;
    private int year;
    private boolean wasCrashed;
    public String[] properties; //Переменная созданная в массиве. т.е. внутри шаблона можно создавать массив

    //Constructor
    public Car(String model, int year, boolean wasCrashed) {
        this.model = model;
        this.year = year;
        this.wasCrashed = wasCrashed;
    }

    public Car(String model, int year) {
        this(model, year, false);
        /*this.model = model;
        this.year = year;
        wasCrashed = false;*/
    }

    public Car(String model) {
        this(model,2020);
    }

    /**
     * Выводит на экран информацию о машине
     */
    public void info() {
        System.out.println("Model = " + model + " year = " + year + " wasCrashed = " + wasCrashed);
    }

    public void printModel() {
        System.out.println(model);
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isWasCrashed() {
        return wasCrashed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Error");
        }
    }


    public void setWasCrashed(boolean wasCrashed) {
        this.wasCrashed = wasCrashed;
    }

    /**
     * Попали в аварию
     */
    public void crash() {
        System.out.println("Car was crashed");
        wasCrashed = true;
    }

    public void repair() {
        if (wasCrashed) {
            wasCrashed = false;
            System.out.println("Was repair");
        } else {
            System.out.println("Nothing to repair");
        }

    }

    public void printModelNTimes(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(model);
        }
    }

    public static void staticInfo() {

    }
}
