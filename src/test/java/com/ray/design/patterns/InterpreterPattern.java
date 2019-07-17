package com.ray.design.patterns;

import com.ray.design.patterns.Interpreter.AbstractExpression;
import com.ray.design.patterns.Interpreter.BrowserContext;
import com.ray.design.patterns.Interpreter.NonterminalExpression;
import com.ray.design.patterns.Interpreter.TerminalExprssion;
import com.ray.design.patterns.bridge.Bag;
import com.ray.design.patterns.bridge.Book;
import com.ray.design.patterns.bridge.FewView;
import com.ray.design.patterns.bridge.FullView;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InterpreterPattern {

	@Test
	public void test() {
		BrowserContext context = new BrowserContext();

		//        先用語法分析器，將詞句分類，選擇要用哪種解釋器解釋。

		/**
		 * 做了各種分類
		 */

		//        兩種解釋器
		AbstractExpression nonterminal = new NonterminalExpression();
		AbstractExpression terminal = new TerminalExprssion();

		/**
		 *不同的詞句要對應到對的解釋器
		 */

		//        終端的丟進終端解釋
		terminal.interpret(context);

		//        非終端的丟進非終端解釋
		nonterminal.interpret(context);
	}
}
