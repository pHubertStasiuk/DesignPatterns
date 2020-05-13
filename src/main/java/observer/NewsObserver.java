package observer;

import lombok.Data;

@Data
public class NewsObserver implements Channel {

    private Integer id;
    private String news;

    public NewsObserver(Integer id) {
        this.id = id;
    }

    @Override
    public void update(Object news) {
        this.setNews((String) news);

        System.out.println("Obserwator: " + this.id + " Otrzymałem wiadomość: " + news);
    }
}