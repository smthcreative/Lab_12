package decorator;

public class Main {
    public static void main(String[] args) {
        Document document = new SmartDocument("gs://smthcreative/image_2022-12-01_12-51-27.png");
        document = new TimeDocument(document);
//        document = CashedDocument(document);
        System.out.println(document.parse());


    }

}
