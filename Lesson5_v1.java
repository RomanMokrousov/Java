public class Lesson5_v1 {
    public static void main(String[] args) {
        Person[] PersArr = new Person[5];
        PersArr[0] = new Person ("Ivanov_Ivan_Petrovich", "SEO", "Ivanov@mail.ru", 12344, 100000, 42);
        PersArr[1] = new Person("Petrov_Vasiliy_Romanovich", "Engineer", "Petrov@mail.ru", 43523, 91000, 31);
        PersArr[2] = new Person("Belova_Natalia_Viktorovna", "Doctor", "Belova@mail.ru", 43423, 200000, 51);
        PersArr[3] = new Person("Zaytsev_Dmitriy_Vasilievich", "Driver", "Zaytsevv@mail.ru", 17508, 55000, 46);
        PersArr[4] = new Person("Utkin_Egor_Petrovich", "Manager", "Utkin@mail.ru", 23524, 89000, 25);



        PersArr[0].printInfo();
        PersArr[1].printInfo();
        PersArr[2].printInfo();
        PersArr[3].printInfo();
        PersArr[4].printInfo();

//        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
//
//        PersArr[0].getAge();
//        PersArr[1].getAge();
//        PersArr[2].getAge();
//        PersArr[3].getAge();
//        PersArr[4].getAge();

    }
}
