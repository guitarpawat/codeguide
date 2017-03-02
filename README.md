# Code Guidelines

## 1. Use meaningful name for varibles, methods and classes.

Using meaningful name can help your code easily to to understand and more easy to debug. For example :

```java
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println(Input r : );
    double r = s.nextDouble();
    System.out.println("Result : "+(r*Math.PI))
}
```

You can know this code is circle area calculator but when you read the last line that print result of `r*Math.PI`. You can make your code more readable by changing names like this :

```java
public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println(Input radius : );
          double radius = scanner.nextDouble();
          System.out.println("Result : "+(radius*Math.PI))
 }
```

This can make your code more readable.

## 2. Do not use magic numbers.

If you use number like this in your code:

```java
if(speed >= 0  &&  velocity<=299792458){     // 299792458???
                    ...
                    time = time*3600 		// 3600??
                    ...
}
```
This will make you confuse about these numbers later.
It is better to set constant variable name of numbers.
```java
public static final int LIGHT_SPEED = 299792458;
public static final int SECOND_TO_HOUR = 3600;
```

## 3. Add some code comments.

Comments can help other people easily understand what you do in your code.

```java
...
// Check that input speed is valid or not
if(speed >= 0  &&  speed <= LIGHT_SPEED) {
    ...
}
...
```

## 4. Do not use too long names.

Do not use name like :

```java
double checkUserInputIsValidThenCalculateAreaOfRectangle(double width,double height) {...}
```

You should short meaningful name instead :

```java
double regtangleArea(double width,double height) {...}
```

## 5. Don't repeat yourself.

Do not copy and paste your code to do the repeatation things in different parts of your code, use methods instead.
For example:
```java
/** For encrypting String by shifting ASCII number. */
String encrypt(String in) {...}
/** Reversing method of ecrypt() for decrypting text. */
String decrypt(String in) {...}
```
If your program using the same code for encrypt and decrypt using methods are better than copy and paste same code around the program and it make easier to change the codes only one time, not around the program.

## Exercise

I have one useful exercise I made it here : https://github.com/guitarpawat/codeguide/blob/master/src/Classroom.java

## Useful References

http://deviq.com/don-t-repeat-yourself, DevIQ's blog

https://www.codeproject.com/Articles/768052/Golden-Rules-Of-Good-OOP by Giovanni Scerra
