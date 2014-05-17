package tp.designpatterns.behavioral.visitor;

public class BinaryTreeNode implements Visitable {

    protected Visitable left;

    protected Visitable right;

    public void accept(BinaryTreeVisitor visitor) {
        visitor.visitNode(this);
    }

    public Visitable getLeft() {
        return left;
    }

    public Visitable getRight() {
        return right;
    }

    public BinaryTreeNode(Visitable left, Visitable right) {
        this.left = left;
        this.right = right;
    }
}
