package com.kenzie.supportingmaterials;

public class Application {

int[] numbers = new int[100];

for (int i = 0; i < 100; i++){
    numbers[i] = i + 1;
}

public static void whileSearchingAnItem(int[] numbers){
    while(i < 100){
        if(numbers[i] == 99){
            System.out.println("Found it");
            break;
        }
    }
}

public static void forSearchingAnItem(int[] numbers){
    for(int i = 0; i < 100; i++){
        if(numbers[i] == 99){
            System.out.println("Found it");
        }
    }
}

public static void saveNumbersWithEight(int[] numbers){
    int count = 0;
    for(int i = 0; i < numbers.length; i++){
        while(((numbers[i] % 10) - 2)){}
}
}