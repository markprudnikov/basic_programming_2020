package com.markprudnikov

interface Visitor<R> {
    fun visit(node: Literal) : R
    fun visit(node: Addition) : R
    fun visit(node: Multiplication) : R
}

interface Node {
    fun <R> accept(visitor: Visitor<R>) : R
}

class Literal(val number: Int) : Node {
    override fun <R> accept(visitor: Visitor<R>) : R {
        return visitor.visit(this)
    }
}

class Addition(val left: Node, val right: Node) : Node {
    override fun <R> accept(visitor: Visitor<R>) : R {
        return visitor.visit(this)
    }
}

class Multiplication(val left: Node, val right: Node) : Node {
    override fun <R> accept(visitor: Visitor<R>) : R {
        return visitor.visit(this)
    }
}