package tp.designpatterns.behavioral.visitor;

public class BinaryTreeLeaf implements Visitable {

    protected int value;

    public void accept(BinaryTreeVisitor visitor) {
        visitor.visitLeaf(this);
    }

    public BinaryTreeLeaf(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
