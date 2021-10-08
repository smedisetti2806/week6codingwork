public class BrownBoxBuilder extends BoxBuilder{
    public BrownBoxBuilder() {
        this.name = "Brown CardBoard Box";
    }

    @Override
    public BoxBuilder addBoxName() {
        this.board.add("CardBoard Box");
        return this;
    }

    @Override
    public BoxBuilder addColor() {
        this.board.add("Brown Color");
        return this;
    }

    @Override
    public BoxBuilder addShape() {
        this.board.add("Square Shape");
        return this;
    }

    @Override
    public BoxBuilder addSize() {
        this.board.add("16 by 16");
        return this;
    }

    @Override
    public BoxBuilder addBoxNumber() {
        return this;
    }
}
