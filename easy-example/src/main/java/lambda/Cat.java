package lambda;

class Cat implements WithNameAndAge {
    private String name;
    private int age;

    //Имплементация
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }


    //toString
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}