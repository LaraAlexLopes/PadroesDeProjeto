package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EX1 {

    public double metodo(List<Integer> num, double valor) {
        List<Integer> list = new ArrayList<>();
        for (Integer n: num){
            if (n < 1 || n > 60){
                return 0.0;
            }
            if (list.contains(n)){
                return 0.0;
            }
            list.add(n);
        }
        if (list.size() >= 6 && list.size() <= 15) {
            List<Integer> list2 = new ArrayList<>();
            int s;
            while (list2.size() < 6) {
                s = new Random().nextInt(59) + 1;
                if (!list2.contains(s)) {
                    list2.add(s);
                }
            }
            int tot =0;
            for (Integer i: num){
                if (list2.contains(i)){
                    tot++;
                }
            }
            if (tot == 6){
                return valor;
            } else if (tot == 5){
                return valor * 0.2;
            } else if (tot == 4){
                return valor * 0.05;
            }
        }
        return 0.0;
    }


    public double metodo1(List<Integer> num, double valor) {
        List<Integer> list = new ArrayList<>();
        for (Integer n: num){
            if(!list.contains(n)){
                if(n>=1 && n<=60){
                    list.add(n);
                }
            }
            else{
                return 0.0;
            }
        }

        int tot = 0;
        if (list.size() >= 6 && list.size() <= 15){
            List<Integer> list2 = new ArrayList<>();
            for (Integer i: list){
                int s = new Random().nextInt(59) + 1;
                if (!list2.contains(s) && list2.size() < 6) {
                    list2.add(s);
                }
                if (list2.contains(i)){
                    tot++;
                }
            }
        }

        return switch (tot) {
            case 6 -> valor;
            case 5 -> valor * 0.2;
            case 4 -> valor * 0.05;
            default -> 0.0;
        };
    }

}