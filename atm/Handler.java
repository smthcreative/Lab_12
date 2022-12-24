package atm;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public abstract class Handler {
    private Handler next;
    public abstract void process(int price);


}
