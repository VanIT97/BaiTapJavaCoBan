package SingletonPattern;

public class StaticBlockInitialization {
    private static StaticBlockInitialization instance;
    private StaticBlockInitialization(){

    }
    static {
        try {
            instance = new StaticBlockInitialization();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static StaticBlockInitialization getInstance(){
        return instance;
    }
}
