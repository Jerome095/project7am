package org.all;
import org.english.English;
import org.tamil.Tamil;
import org.telugu.Telugu;

public class LanguageClass {
	public static void allLanguages() {
		System.out.println("Language details");
	}
	public static void main(String[] args) {
		LanguageClass lang = new LanguageClass();
		English eng = new English();
		Tamil tam = new Tamil();
		Telugu tel = new Telugu();
		lang.allLanguages();
		eng.EnglishLanguage();
		tam.TamilLanguage();
		tel.TeluguLanguage();
		
	}

}
