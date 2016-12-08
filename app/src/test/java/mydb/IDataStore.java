package mydb;

/**
 * Created by renda on 20/10/16.
 */
public interface IDataStore {
    void saveState(String state);
    String getState();
}
