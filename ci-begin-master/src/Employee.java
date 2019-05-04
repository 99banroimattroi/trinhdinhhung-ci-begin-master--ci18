public class Employee extends Human {

    String name;
    //name
    //age
    //render

    //ham tao rong

    @Override //ghi de
    public void eat() {

//        this.name;
//        super.name;


        super.eat(); //Human.eat()
        System.out.println(name + " eating done! Va " + age  + " Tuoi" );
    }

    //sleep
}
