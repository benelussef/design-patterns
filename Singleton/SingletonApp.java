public class SingletonApp {
    public static void main(String[] args) {

        for(int i=0 ; i < 5; i++){
            Database databaseInstance = Database.getInstance();
            System.out.println("database instance :"+databaseInstance);
        }

    }
}
