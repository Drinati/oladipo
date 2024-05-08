package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {

    List<String> StringList = new ArrayList<>();
  
    
    for (int i = 0; i < numbers.size(); i = i + 1) { 

        Integer number = numbers.get(i);
        
        if (number % 3 == 0) { 
            StringList.add("Fizz");
        }
        else if (number % 5 == 0) { 
             StringList.add("Buzz"); 
        } 

        else if (number % 3 == 0 && number % 5 == 0) { 
            StringList.add("FizzBuzz"); 
        }  

        else { 
            
            StringList.add(Integer.toString(number)); 
        } 
    } 

    return StringList; 

        }

    
    public String whichMonth(Integer number) {

     String month = "";
     switch (number) {
        case 1:
            month = "January";
            break;
        case 2:
           month = "February";
            break;
        case 3:
            month = "March";
            break;
        case 4:
            month = "April";
            break;
        case 5:
            month = "May";
            break;
        case 6:
             month = "June";
            break;
        case 7:
            month = "July";
            break;
        case 8:
            month = "August";
            break;
        case 9:
            month = "September";
            break;
        case 10:
            month = "October";
            break;
        case 11:
            month = "November";
            break;
        case 12:
           month = "December";
            break;
        default:
           month = "Invalid month number";
            break;

            }
        
            return month;
       }
    

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {

        IntStream numbers =IntStream.range(1, 101);
        int sumOfEvens = numbers.filter(i -> i % 2 == 0).sum();

        numbers = IntStream.range(1, 101);
        int sumOfOdds = numbers.filter(i -> i % 2 != 0).sum();


        HashMap<String, Integer> map = new HashMap<>();
        map.put("sumOfEvens", sumOfEvens);
        map.put("sumOfOdds", sumOfOdds);

        return map;
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
       Collections.reverse(numbers);
       return numbers;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
