package markdown;

import org.commonmark.node.Node;
import org.commonmark.renderer.html.HtmlRenderer;
import org.commonmark.parser.Parser;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="# welcome \n \n test paragaraph \n"
				+ "\n 1. bmw \n"
				+ "2. audi \n \n"
				+ "[click](www.example.com)\n"
				+ "___\n"
				+ "![error](www.example.com)";
		Parser parse = org.commonmark.parser.Parser.builder().build();

		Node document = parse.parse(s);
		HtmlRenderer render = HtmlRenderer.builder().build();
		String html=render.render(document);
		System.out.println(html);
	}

}
