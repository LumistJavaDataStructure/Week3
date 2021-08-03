public class Box<T>{
    private T stuff;

    public void set(T input){
        this.stuff = input;
    }

    public T get(){
        return this.stuff;
    }
}
