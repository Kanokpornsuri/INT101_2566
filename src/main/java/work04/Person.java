/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work04;
/*
      4.1 Create a public class named "Person" in package named "work04".
          This class contains the following field and methods.
          4.1.1 a private "id" field of type "int".
          4.1.2 a public constructor (constructor is mean "Person") that receives 
                an "id" parameter to set the "id" field.
          4.1.3 public getter/setter methods.(get use public+type(in private){return}, set use public+void{this._=_})
          4.1.4 @Override a public "toString" method that 
                returns a "String" of value "Person(id)" 
                where "id" is the "id" field.
*/
public class Person {
    
    private int id;
    public Person (int id){
        this.id = id;
    }//ในmainหลักจะต้องใส่ Person person1 = new Person(10001);
    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    
    @Override
    public String toString(){
        return "Person " + id;
    }
}
