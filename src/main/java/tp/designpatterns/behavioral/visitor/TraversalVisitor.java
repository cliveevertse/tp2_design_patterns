package tp.designpatterns.behavioral.visitor;

public class TraversalVisitor implements BinaryTreeVisitor {

    protected String result = "";

    public void visitNode(Visitable node) {
        BinaryTreeNode rnode = (BinaryTreeNode) node;
        result += "{";
        rnode.getLeft().accept(this);
        result += ",";
        rnode.getRight().accept(this);
        result += "}";
    }

    public void visitLeaf(Visitable node) {
        BinaryTreeLeaf leaf = (BinaryTreeLeaf) node;
        result += leaf.getValue();
    }

    public String report() {
        return ">>> TraversalVisitor traversed the tree to: " + result;
    }
}
