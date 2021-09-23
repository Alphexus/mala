package compiler.parser;

import java.lang.Object;

import compiler.parser.AST_NODE_TYPE;

interface IASTNode {
  AST_NODE_TYPE getType();
  Object getValue();
  IASTNode getRightNode();
  IASTNode getLeftNode();
}
