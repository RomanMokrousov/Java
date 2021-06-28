public class Person {
    String name;
    String post;
    String email;
    int phone;
    int salary;
    int age;

    public Person(String name, String post, String email, int phone, int salary, int age){
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.printf("Person: name - %s, post - %s, email - %s, phone - %d, salary - %d, age - %d\n", this.name, this.post, this.email, this.phone, this.salary, this.age);
    }


//    5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

//    public void getAge() {
//        if (age >= 40) {
//            System.out.printf("Person: name - %s, post - %s, email - %s, phone - %d, salary - %d, age - %d\n", this.name, this.post, this.email, this.phone, this.salary, this.age);
//        }
//    }
}
