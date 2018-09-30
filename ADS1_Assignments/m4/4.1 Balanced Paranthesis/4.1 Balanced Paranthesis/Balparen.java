class Balparen {
  private char[] parenthesis;
  private Stack2 stackBracket;
  Balparen(final String s) {
    parenthesis = s.toCharArray();
    stackBracket = new Stack2(s.length());
  }
  public boolean isBalanced() {

    for (char c : parenthesis) {

      if (c == '[' || c == '(' || c == '{') {
        stackBracket.push(c);
      } else if (c == ']') {

        if (stackBracket.isEmpty() || stackBracket.pop() != '[') {
          return false;
        }
      } else if (c == ')') {

        if (stackBracket.isEmpty() || stackBracket.pop() != '(') {
          return false;
        }
      } else if (c == '}') {
        if (stackBracket.isEmpty() || stackBracket.pop() != '{') {
          return false;
        }
      }

    }
    return stackBracket.isEmpty();
  }

}