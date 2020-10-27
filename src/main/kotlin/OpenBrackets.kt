package com.markprudnikov

class OpenBrackets: Visitor<Unit> {

        override fun visit(node: Addition){
            node.left.accept(this)
            print(" + ")
            node.right.accept(this)
        }

        override fun visit(node: Literal){
            print(node.number)
        }

        override fun visit(node: Multiplication){
            when {
                node.left is Addition -> {
                    Addition(
                        Multiplication(node.left.left, node.right),
                        Multiplication(node.left.right, node.right)
                    ).accept(this)
                }
                node.right is Addition -> {
                    Addition(
                        Multiplication(node.left, node.right.left),
                        Multiplication(node.left, node.right.right)
                    ).accept(this)
                }
                else -> {
                    node.left.accept(this)
                    print(" * ")
                    node.right.accept(this)
                }
            }
        }
}