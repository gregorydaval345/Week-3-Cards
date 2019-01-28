


//generic class; generic data type
public interface IDatabase<T> {
    boolean save(T item);
    T readFirstRecord(); //open the file and read the first record in the file
}
