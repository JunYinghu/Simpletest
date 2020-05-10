package pageLibrary;

public class SearchPageManager {

    private static Object lock = new Object();

    public static SearchPageManager getInstance(){
        SearchPageManager instance = null;
        if (instance ==null){
            synchronized (lock){
                instance = new SearchPageManager();
                instance.loadData();
            }
        }
        return instance;
    }

    private void loadData() {

    }
}
