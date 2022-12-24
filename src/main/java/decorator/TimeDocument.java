package decorator;


import lombok.AllArgsConstructor;

import java.time.Duration;
import java.time.Instant;

//@AllArgsConstructor
public class TimeDocument implements Document{
    public Document doc;


    public TimeDocument(Document document) {
        doc = document;
        Instant start = Instant.now();
        document.parse();
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end).toString());

    }

    public String time() {
        Instant start = Instant.now();
        doc.parse();
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end).toString());
        return null;
    }
    @Override
    public String parse() {
        return doc.parse();
    }
}
