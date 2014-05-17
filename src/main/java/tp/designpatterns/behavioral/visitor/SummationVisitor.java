package tp.designpatterns.behavioral.visitor;

public class SummationVisitor implements BinaryTreeVisitor {

    protected int sum = 0;

    public void visitNode(Visitable node) {
        BinaryTreeNode rnode = (BinaryTreeNode) node;
        rnode.left.accept(this);
        rnode.right.accept(this);
    }

    public void visitLeaf(Visitable node) {
        BinaryTreeLeaf leaf = (BinaryTreeLeaf) node;
        sum += leaf.getValue();
    }

    public String report() {
        return ">>> SummationVisitor collected a sum of: " + sum;
    }
}
