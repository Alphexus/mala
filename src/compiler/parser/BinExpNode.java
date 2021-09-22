package parser;

import parser.IASTNode;
import parser.AST_NODE_TYPE;

public class BinExpNode implements IASTNode {
  private static AST_NODE_TYPE type = AST_NODE_TYPE.BIN_EXP;
  private Object value;
  private IASTNode left;
  private IASTNode right;

  public BinExpNode(Object value, IASTNode right, IASTNode left) {
    this.value = value;
    this.left = left;
    this.right = right;
  }

  @Override
  public AST_NODE_TYPE getType() {
    return type;
  }

  @Override
  public Object getValue() {
    return this.value;
  }

  @Override
  public IASTNode getLeftNode() {
    return this.left;
  }

  @Override
  public IASTNode getRightNode() {
    return this.right;
  }

  public Object getOperator() {
    return this.getValue();
  }

  public String toString() {
    return String.format(
      "{%nType: %s,%nOperator: %s,%nLeft: %s,%nRight: %s%n}%n",
      this.getType().name(), this.getValue(), this.getLeftNode(), this.getRightNode()
    );
  }
}
