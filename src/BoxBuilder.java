import java.util.ArrayList;
import java.util.List;

public abstract class BoxBuilder {
    String name;
    List<String> board = new ArrayList<String>();

    public abstract BoxBuilder addBoxName();
    public abstract BoxBuilder addColor();
    public abstract BoxBuilder addShape();
    public abstract BoxBuilder addSize();
    public abstract BoxBuilder addBoxNumber();

    public CardBoardBoxes build() {
        CardBoardBoxes box = new CardBoardBoxes();
        box.setName(this.name);
        box.box(board);
        return box;
    }
}
