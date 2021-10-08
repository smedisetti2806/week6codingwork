public class BlackBoxBuilder  extends BoxBuilder{
    public BlackBoxBuilder() {
        this.name = "Black CardBoard Box";
    }

    @Override
    public BoxBuilder addBoxName() {
        return this;
    }

    @Override
    public BoxBuilder addColor() {
        this.board.add("Black");
        return this;
    }

    @Override
    public BoxBuilder addShape() {
        this.board.add("Rectangle");
        return this;
    }

    @Override
    public BoxBuilder addSize() {
        this.board.add("4 by 5");
        return this;
    }

    @Override
    public BoxBuilder addBoxNumber() {
        this.board.add("5 Number");
        return this;
    }
}

