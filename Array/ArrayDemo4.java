class Person{
    private String name;
    private int age;

    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    public String getInfo(){
        return "名字:"+ name +", 年龄: "+ age;
    }
}

public class ArrayDemo4{
    public static void main(String args[]){
        /* Person person[] = new Person[3];
        person[0] = new Person("张三",10);
        person[1] = new Person("李四",20);
        person[2] = new Person("王五",30); */
        Person person[] = new Person[]{
            new Person("张三",10),
            new Person("李四",20),
            new Person("王五",30)
        };

        for( int i = 0; i < person.length; i++){
            System.out.println(person[i].getInfo());
        }
    }
}