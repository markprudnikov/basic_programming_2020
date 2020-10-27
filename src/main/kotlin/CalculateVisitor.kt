package com.markprudnikov

class CalculateVisitor : Visitor<Int> {
    override fun visit(node: Literal) = node.number

    override fun visit(node: Addition) = node.left.accept(this) + node.right.accept(this)

    override fun visit(node: Multiplication) = node.left.accept(this) * node.right.accept(this)
}