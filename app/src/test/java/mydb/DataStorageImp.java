package mydb;

/**
 * Created by renda on 20/10/16.
 */
public class DataStorageImp {
    String state = null;
    public void saveState(String state){this.state = state;}
    public String getState(){
        return this.state;
    }
}
