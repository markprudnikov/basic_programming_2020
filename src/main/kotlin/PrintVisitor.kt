package com.markprudnikov

class PrintVisitor: Visitor<Unit> {

    override fun visit(node: Addition) {
        print("(")
        node.left.accept(this)
        print(" + ")
        node.right.accept(this)
        print(")")
    }
    override fun visit(node: Literal) {
        print(node.number)
    }

    override fun visit(node: Multiplication) {
        print("(")
        node.left.accept(this)
        print(" * ")
        node.right.accept(this)
        print(")")
    }

}