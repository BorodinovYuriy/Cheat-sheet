package lambda;

interface Settable<C extends WithNameAndAge> {

    //entity - сущность
    void set(C entity, String name, int age);
}
