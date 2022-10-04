package RaceOfThreads;

import java.util.ArrayList;

public class RaceOfThreads implements Runnable{

    private int number = 1;

    private final Object LOCK = new Object();
    private ArrayList<Integer> divededList1 = new ArrayList<>();
    private ArrayList<Integer> divededList2 = new ArrayList<>();
    private ArrayList<Integer> divededList3 = new ArrayList<>();
    private ArrayList<Integer> divededList4 = new ArrayList<>();
    private ArrayList<Integer> oddNumbers = new ArrayList<>();
    private ArrayList<Integer> evenNumbers = new ArrayList<>();

    public RaceOfThreads() {

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<Integer> getDivededList1() {
        return divededList1;
    }

    public void setDivededList1(ArrayList<Integer> divededList1) {
        this.divededList1 = divededList1;
    }

    public ArrayList<Integer> getDivededList2() {
        return divededList2;
    }

    public void setDivededList2(ArrayList<Integer> divededList2) {
        this.divededList2 = divededList2;
    }

    public ArrayList<Integer> getDivededList3() {
        return divededList3;
    }

    public void setDivededList3(ArrayList<Integer> divededList3) {
        this.divededList3 = divededList3;
    }

    public ArrayList<Integer> getDivededList4() {
        return divededList4;
    }

    public void setDivededList4(ArrayList<Integer> divededList4) {
        this.divededList4 = divededList4;
    }

    public ArrayList<Integer> getOddNumbers() {
        return oddNumbers;
    }

    public void setOddNumbers(ArrayList<Integer> oddNumbers) {
        this.oddNumbers = oddNumbers;
    }

    public ArrayList<Integer> getEvenNumbers() {
        return evenNumbers;
    }

    public void setEvenNumbers(ArrayList<Integer> evenNumbers) {
        this.evenNumbers = evenNumbers;
    }

    @Override
    public void run() {
        synchronized (LOCK) {
            if (this.number <= 2500) {
                this.divededList1.add(this.number);
                System.out.println(this.number + " " + " added to divededList1");
            } else if (this.number > 2500 && this.number <= 5000) {
                this.divededList2.add(this.number);
                System.out.println(this.number + " " + " added to divededList2");
            } else if (this.number > 5000 && this.number <= 7500) {
                this.divededList3.add(this.number);
                System.out.println(this.number + " " + " added to divededList3");
            } else {
                this.divededList4.add(this.number);
                System.out.println(this.number + " " + " added to divededList4");
            }

            if(this.number % 2 == 0) {
                this.evenNumbers.add(this.number);
                System.out.println(this.number + " " + "added to Even Number List");
            } else {
                this.oddNumbers.add(this.number);
                System.out.println(this.number + " " + "added to Odd Number List");
            }

            this.number++;
        }
    }
}
