/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static void main (String[] args) 
                {
                    
                    
                   boolean x=true;
                    boolean y=false;
                    boolean z=true;
                    
                     System.out.println(x);//true
                     System.out.println(y); //false
                     System.out.println(z);//true
                        
                    //and operation here if both condition is ture when we will get true otherwise false
                    // in or if one  condition is true you wol get true 
                      System.out.println(x==z &&  y==false); //true and true [True ]
                      System.out.println(x==z ||  z==false); //true or  false   [Ture]
                      System.out.println(x==z ? "true" : "false");  //true taranery oprator used when we have only 2 ondtion 
                        System.out.println(x==z ||  z!=false); //true or true   [Ture]
                      
                      
                      
                     String x="Hello";//iltters
                     String y="hello";//ilters
                       String y1="hello";//ilters
                     String s= new String("hello");//object
                     //now here y and s seems same but not same in the tearm of rafrance becousse here we have created new object of string class 
                     // and y variavle is illters 
                      
                      
                      System.out.println(y==s);   //false becouse s is object and y iltters [variable ]  [True ]
                       System.out.println(y==y1); //now is eqaul [True] 
                      
                       System.out.println(y.equals(s));//true becouse here it check value not refrance ofboth 
                      System.out.println(y.equalsIgnoreCase(x));
                      
                    
                }
}
