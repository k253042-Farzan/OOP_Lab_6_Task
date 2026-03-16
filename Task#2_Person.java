package Lab06Task02;

class Person {
    void displayPerson(){
        System.out.println("Person displayed.");
    }
}

class Student extends Person {
    void displayStudent() {
        System.out.println("Student displayed.");
    }
}

class GraduatedStudent extends Student {
    void research(){
        System.out.println("Graduate is researching.");
    }
}

class Main {
    public static void main(String[] args){
        GraduatedStudent gs = new GraduatedStudent();

        gs.research();
        gs.displayPerson();
        gs.displayStudent();
    }
}