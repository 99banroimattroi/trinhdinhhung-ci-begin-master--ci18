public class Human {
    //thuoc tinh
    String name;  // =null
    int age; // = 0
    String gender; // = null

    //ham tao
    public Human() {   //ham tao rong
        name = "New Person";
        age = 20;
        gender = "male";
    }


    //ham tao day du
    public Human(String name, int age, String gender){
        this.name = name; // tranh viec trung ten
        this.age = age;
        this.gender = gender;
    }


    //phuong thuc
    public void eat() {
        System.out.println(name + " Eating..");
    }

    public  void sleep() {
        System.out.println(name + " Sleeping..");
    }

}