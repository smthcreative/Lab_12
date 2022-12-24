package atm;

public class Handler5 extends Handler {

    @Override
    public void process(int price) {
        Handler next = getNext();
        if (price % 5 > 0 && next == null) {
            throw new IllegalArgumentException();
        } else if (next != null) {
            next.process(price % 5);
            System.out.println(price/5 + " * 5");
        }
    }
}