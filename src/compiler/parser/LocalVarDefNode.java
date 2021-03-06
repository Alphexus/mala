package compiler.parser;

import compiler.parser.IASTNode;

public class LocalVarDefNode implements IASTNode {
  private static AST_NODE_TYPE type = AST_NODE_TYPE.LOCAL_VAR_DEF;
  private String value;
  private IASTNode left;
  private IASTNode right;

  public LocalVarDefNode(String varName, IASTNode varValue) {
    this.value = varName;
    this.right = varValue;
  }

  @Override
  public AST_NODE_TYPE getType() {
    return type;
  }

  @Override
  public IASTNode getValue() {
    return this.right;
  }

  public String getVariable() {
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

  public String toString() {
    return String.format(
      "{%n  Type: %s,%n  Name: %s%n   Value: %s%n}%n",
      this.getType().name(), this.getVariable(), this.getValue()
    );
  }
}
