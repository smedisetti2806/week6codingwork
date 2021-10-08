import java.util.List;

public class CardBoardBoxes {
    Dispatched Dispatched;
    Delivered Delivered;
    boxOrder Order;

    State box;
    int count = 0;
    String name;
    List<String> boxes;

    public CardBoardBoxes() {
        Order = new boxOrder(this);
        Dispatched = new Dispatched(this);
        Delivered = new Delivered(this);
        box = Order;
    }

    public void setName(String name) {
        this.name = name;
    }

    void box(List<String> boxes) {
        this.boxes = boxes;
    }

    public void Completed() {
        box.Ready();
    }

    public void Not_Completed() {
        box.Not_Ready();
    }

    public State getBox() {
        return box;
    }

    public void setBox(State box) {
        this.box = box;
    }

    public State getOrder() {
        return Order;
    }

    public State getDispatch() {
        return Dispatched;
    }

    public State getDeliver() {
        return Delivered;
    }

    public int getCount() {
        return count;
    }

    void prepareBox() {
        System.out.println("Prepare Box" + name);
        for (String boxes : boxes) {
            System.out.println("   " +boxes);
        }
    }

    //To String Method
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append(">>>"+ this.name + "<<<\n");
        for (String boxes : boxes) {
            display.append(boxes + "\n");
        }
        return display.toString();
    }
}

