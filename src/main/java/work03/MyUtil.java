/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work03;

/*
3.1 Create a utility class named "MyUtil" in package named "work03".
      3.2 Create a method named "calculateBMI" in "MyUtil" class. 
          This method receives two parameters of type "double" 
          named "weight" and "height" and it returns a "double" 
          which is the result of "weight" dividedหาร by "height"^2.
      3.3 Create a method named "average" in "MyUtil" class.
          This method receives three parameters of type "int" named
          "v1", "v2", "v3" and it returns a "double" which is 
          the averageค่าเฉลี่ย values of the three parameters.
 */
public class MyUtil {
    
    public static double calculateBMI(double weight, double height){
        return weight / (height*height);
    }
    public static double average(int v1, int v2, int v3){
        return (double)(v1+v2+v3)/3;
    }
}
