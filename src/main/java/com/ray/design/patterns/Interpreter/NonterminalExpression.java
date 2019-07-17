package com.ray.design.patterns.Interpreter;

public class NonterminalExpression extends AbstractExpression {
    @Override
    public void interpret(BrowserContext context) {
        System.out.println("非終端的解釋器");
    }
}
