package observer;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        NewsObservable observable = new NewsObservable();
        List<NewsObserver> observers = Arrays.asList(new NewsObserver(1), new NewsObserver(2), new NewsObserver(3));
        for(NewsObserver observer: observers) {
            observable.addObserver(observer);
        }

        observable.setNews("news");
    }
}
