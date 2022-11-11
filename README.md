# Tutorial 2
Q1a:
```
package com.mycompany.jelly;


public class a1 {
    public static void main(String[] args) {
        String f = "Faculty";
        String o = " of";
        String c = " Computer";
        String s = " Science";
        String a = " and";
        String i = " Information";
        String t = " Technology";
        
        System.out.println(f + o + c + s + a + i + t);
    }
    
}
```
Q1b:
```
package com.mycompany.jelly;


public class a2 {
    public static void main(String[] args) {
        System.out.println("Faculty \nof \nComputer \nScience \nand \nInformation \nTechnology");
    }
    
}
```
Q2:
```
package com.mycompany.jelly;

public class a3 {
    public static void main(String[] args) {
        System.out.println("\"SDN\" - Software Defined Networking");
    }
    
}
```
Q3:
incorrect:
```
a. System.Println("Java Programming");
b. System.in.println("Introduction to Java!")
c. System.out.println("\t is the horizontal tab character");
d. system.out.println("Java is case sensitive!" );
```
correct:
```
a. System.out.println("Java Programming");
b. System.out.println("Introduction to Java!");
c. System.out.println("\t is the horizontal tab character");
d. System.out.println("Java is case sensitive!");
```
Q4a:
```
int v;
```
Q4b:
```
double pi = 3.141592653589;
```
Q4c:
```
boolean M;
M = false;
```
Q4d:
```
long P = 8800000000L
```
Q4e:
```
String letter =("U");
```
Q4f:
```
final String PRO =("java");
```
Q5:
Incorrect:
```
a.
final double AMOUNT = "32.5";
AMOUNT += 10;
System.out.println("The amount is " + AMOUNT);
b.
string chapter = 'Summary';
System.out.println(chapter);
c.
int num;
++num++;
num1 = num;
d.
int num = 3000;
System.out.printf("%4.2f\n", num);
e.
String contact;
Scanner keyboard = new Scanner(System.out);
contact = keyboard.nextLine();
```
Correct:
```
a.
final double AMOUNT = "32.5";
AMOUNT += 10;
System.out.println("The amount is "" + AMOUNT);
b.
string chapter = ("Summary");
System.out.println(chapter);
c.
int num;
++num;
num1 = num;
d.
float num = 3000;
System.out.printf("%4.2f\n", num);
e.
String contact;
Scanner keyboard = new Scanner(System.in);
contact = keyboard.nextLine();
```
Q6:
```
import java.util.Scanner;

public class the6 {
    public static void main(String[] args) {
        System.out.println("Enter Diameter: ");
        Scanner keyboard = new Scanner(System.in);
        float d;
        d = keyboard.nextFloat();
        System.out.printf("The circumference of the circle is: %.3f",d*Math.PI);
        
    }
    
}
```
Q7:
```
import java.util.Scanner;

public class the6 {
    public static void main(String[] args) {
        System.out.println("Enter value in inch:");
        Scanner keyboard = new Scanner(System.in);
        float l;
        l = keyboard.nextFloat();
        System.out.printf("%.2f inches = %.2f meters",l,2.54*l);
        
    }
    
}
```



