package L7;

public class Account {

    String name;
    int age;

    public static void main(String[] args)
    {

        Account a = new Account();
        a.setName("Ekrem");
        a.setAge(22);
        //a.name= "Ekrem";
        //a.age = 22;

        a.sayHey(a.name, a.age);
    }
    public void setName(String name)
    {
        //setters set what's in the parameter to variable.
        this.name = name;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }
    public String getName()
    {
        //getters get the variables

        return this.name;
    }
    public Integer getAge()
    {
        return this.age;
    }

    public void sayHey(String name, int age)
    {
        System.out.println("Hello " + getName() + " " + getAge()) ;
    }
}
