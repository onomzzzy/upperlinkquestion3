package org.blog.api.services;
import java.util.Map;
import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class QuestionService {

	public String question3(String text) {
	Map<String,Integer> textString = new HashMap<>();
	for(int i=0;i<text.length();i++) {
		if(textString.containsKey((text.charAt(i))+"")) {
			textString.put((text.charAt(i)+""), (textString.get(text.charAt(i)+"")+1));
		}
		else
		textString.put((text.charAt(i)+""), 1);
	}
	//Test for repeatable
	for(int j=0;j<text.length();j++) {
		if(textString.get((text.charAt(j)+"")) == 1) {
			textString.remove(text.charAt(j)+"");
		}
	}
	System.out.println(textString.toString());
	return textString.toString();	
	}
	
	
}
