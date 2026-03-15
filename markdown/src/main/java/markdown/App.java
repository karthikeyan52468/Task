package markdown;

import org.commonmark.node.Node;
import org.commonmark.renderer.html.HtmlRenderer;
import org.commonmark.parser.Parser;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parser parse = org.commonmark.parser.Parser.builder().build();

		Node document = parse.parse("# hello world");
		HtmlRenderer render = HtmlRenderer.builder().build();
		String s=render.render(document);
		System.out.println(s);
	}

}
