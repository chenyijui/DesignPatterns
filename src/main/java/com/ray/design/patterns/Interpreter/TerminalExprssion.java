package com.ray.design.patterns.Interpreter;

public class TerminalExprssion extends AbstractExpression {
    @Override
    public void interpret(BrowserContext context) {
        System.out.println("終端的解釋器");
    }
}
