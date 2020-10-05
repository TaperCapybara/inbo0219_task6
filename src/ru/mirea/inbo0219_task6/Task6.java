package ru.mirea.inbo0219_task6;

public class Task6 {
    public int n, i;

    public static boolean Rec(int n, int i) {
        if (n < 2)
            return false;
        if (n == 2)
            return true;
        if (n % i == 0)
            return false;
        if (i < n / 2)
            return Rec(n, i + 1);
        else
            return true;
    }

    public Task6(int n, int i){
        this.n = n;
        this.i = i;
    }

    @Override
    public String toString(){
        if (Rec(this.n, this.i)){
            return "Простое";
        }
        else
            return "Не";
    }
}
