package training;

public class Main6 {
    public static void main(String[] args) {
        Main6 obj = new Main6();
        obj.method(11,30);
    }

   void method(int hours,int minutes){
       System.out.println(hours+":"+minutes);
    }

}
/*
Step1: Create a method that will accept with 2 parameters of integer type

Step2: Write the logic in that method in println statement to print hours and minutes

Step3: Call the method

**Expected Output:**

```
11:30
```*/