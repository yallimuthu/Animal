class Animal {
    private String name;
    
    private int age; 
    public void eat()
    {
        System.out.println("eat method");

    }
    public void sleep()
    {
        System.out.println("sleep method");

    }

}

class Dog extends Animal {
    public void bark() {
        System.out.print("bark");
    }
}

class JindoDog extends Dog {
    private String origin;
}
