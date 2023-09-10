public class Database {
    public static final Database instance;
    public String instanceName;
    //executed in loading of class in jvm
    static {
        instance = new Database();
    }
    //to ensure the creation of one instance
    private Database(){

    }
    public static Database getInstance(){
        return instance;
    }
}
