package lesson5;
//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//        2. Конструктор класса должен заполнять эти поля при создании объекта;
//        3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
//        4. Создать массив из 5 сотрудников
//        Пример:
//        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
//        потом для каждой ячейки массива задаем объект
//        persArray[1] = new Person(...);
//        ...
//        persArray[4] = new Person(...);
//
//        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;



    class Employee {
        String name; //фио
        String position; //должность
        String email; //емейл
        String phone_number; //номер телефона
        int salary; //зарплата
        int age; //возраст

        // создаю  конструктор
        public Employee(String name, String position, String email, String phone_number, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone_number = phone_number;
            this.salary = salary;
            this.age = age;
        }


        @Override
        public String toString() {
            return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                    name, position, email, phone_number, salary, age);
        }


        public void print() {
            System.out.println(this);
        }


        public static void main(String[] args) {

            Employee[] persArray = new Employee[5];
            persArray[0] = new Employee("Petrov Oleg", "director", "po@mailbox.com", "8996665544", 2500000, 53);
            persArray[1] = new Employee("Ivanov Ivan", "cleaner", "ii@mailbox.com", "8998884455", 27000, 41);
            persArray[2] = new Employee("Sokolov Egor", "security", "se@mailbox.com", "89997771234", 19000, 30);
            persArray[3] = new Employee("Harlamov Alexei", "manager", "ha@mailbox.com", "89995554789", 120000, 39);
            persArray[4] = new Employee("Bezruki Sergei", "trader", "bezser@mailbox.com", "89994445896", 138000, 45);

            // выводим сотрудников старше 40 лет
            for (Employee employee : persArray) if (employee.age > 40) employee.print();

        }
    }