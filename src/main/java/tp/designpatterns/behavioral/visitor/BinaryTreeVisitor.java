package tp.designpatterns.behavioral.visitor;

public interface BinaryTreeVisitor {

    public void visitNode(Visitable node);

    public void visitLeaf(Visitable node);

    public String report();
}
