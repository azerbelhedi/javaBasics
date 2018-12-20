class Person{
    String name ;
    int age ;
    String location ;
    Person(String myName , int myAge , String myLocation){
        name = myName ;
        age = myAge ;
        location = myLocation ;
    }
}

class Humans{
    public static void main(String[] args){
        System.out.println("welcome humans") ;
        Person azer = new Person("azer belhedi" , 20 , "sousse") ;
        System.out.println(azer.age) ;
        System.out.println(azer.name) ;
        System.out.println(azer.location) ;
    }
}