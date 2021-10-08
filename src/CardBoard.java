public class CardBoard {
    public static void main(String[] args) {
        BoxBuilder boxBuilder = new BrownBoxBuilder();
        CardBoardBoxes box = boxBuilder.addBoxName().addColor().addShape().addSize().build();

        box.setBox(new boxOrder(box));
        box.Completed();
        box.prepareBox();

        box.setBox(new Dispatched(box));
        box.Completed();
        box.Not_Completed();

        box.setBox(new Delivered(box));
        box.Completed();
        box.Not_Completed();

        box.setBox(new boxOrder(box));
        box.Not_Completed();


        System.out.println();

        System.out.println("Ordering a new box");
        BoxBuilder boxBuilder1 = new BlackBoxBuilder();
        CardBoardBoxes box1 = boxBuilder1.addColor().addShape().addSize().addBoxNumber().build();
        box.setBox(new boxOrder(box));
        box1.Completed();
        box1.prepareBox();

        box1.setBox(new Dispatched(box1));
        box1.Completed();
        box1.Not_Completed();

        box1.setBox(new Delivered(box1));
        box1.Completed();
        box1.Not_Completed();

        box1.setBox(new boxOrder(box1));
        box1.Not_Completed();
    }
}
