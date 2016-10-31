package com.ligy.jsoup.test;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class JsoupTest {
	
	@Test
	public void test1() {
		String html = "<html><head><title>First parse</title></head><body><p id='pp'>Parsed HTML into a doc.</p></body></html>";
		Document doc = Jsoup.parse(html);
		Element head = doc.head();
		String title = doc.title();
		System.out.println(title);
		Element body = doc.body();
		String html2 = body.html();
		System.out.println(html2);
		
		Element elementById = body.getElementById("pp");
		
		System.out.println(elementById.html());
	}
	
	@Test
	public void test2() throws IOException {
		Document doc = Jsoup.connect("https://www.baidu.com/").get();
		Element head = doc.head();
		String title = doc.title();
		System.out.println(title);
		Element body = doc.body();
		String html2 = body.html();
		System.out.println(html2);
		
	}

}
