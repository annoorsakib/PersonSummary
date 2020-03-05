
package contact;


public class Contact {
    private String personName="";
    private String personid="";
    private int age=0;
    private String mobilenumber="";
    private char gender='m';
    
    public Contact()
    {
        
    }
    public Contact(String name,String ID,int age,String mobileno,char gen)
    {
        this.personName=name;
        this.personid=ID;
        this.age=age;
        this.mobilenumber=mobileno;
        this.gender=gen;
    }
    public void showPersonInfo()
    {
        System.out.println("Name: "+this.personName);
        System.out.println("ID: "+this.personid);
        System.out.println("age: "+this.age);
        System.out.println("mobile Number: "+this.mobilenumber);
        System.out.println("gender: "+this.gender);
    }
    public void detectMobileOperator()
    {
        if(this.mobilenumber.startsWith("017"))
        {
            System.out.println("GP");
        }
        else if(this.mobilenumber.startsWith("018"))
        {
            System.out.println("Robi");
        }
        else
        {
            System.out.println("Banglalink");
        }
    }
    
    
    
}
