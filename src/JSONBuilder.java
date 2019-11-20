import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONBuilder implements Builder {
	private Element document;
	private String filename;
	public JSONBuilder (String s)
	{
		this.filename = s;
	}
	@Override
	public Element getResult() {
	
		return this.document;
	}

	@Override
	public void build() {
		try {
			
			ObjectMapper mapper = new ObjectMapper();
			HashMap<String, Object> map = mapper.readValue(new File(filename),
			HashMap.class);
			this.document = processMap(map);
			} catch (JsonParseException e) {
			e.printStackTrace();
			} catch (JsonMappingException e) {
			e.printStackTrace();
			} catch (IOException e) {
			e.printStackTrace();
			}
	}

	private Element processMap(HashMap<String, Object> map) {
		Element element = null;
		String className = (String)map.get("class");
		
		if (className.equals("Section"))
		{
			element = buildSection(map);
		}
		if (className.equals("Paragraph"))
		{
			element = buildParagraph(map);
		}
		if (className.equals("Image"))
		{
			element = buildImage(map);
		}
		if (className.equals("ImageProxy"))
		{
			element = buildImageProxy(map);
		}
		if (className.equals("Table"))
		{
			element = buildTable(map);
		}
		return element;
	}

	@Override
	public Element buildSection(HashMap<String, Object> map) {
		Sectiune section = new Sectiune((String)map.get("title"));
		Collection<HashMap<String, Object>> children = (Collection)map.get("children");
		children.forEach((childMap) -> {
			Element e = this.processMap(childMap);
			if (e != null) {
			try {
			section.add(e);
			} catch (Exception var5) {
			var5.printStackTrace();
			}
			}
			});
			return section;
	}

	@Override
	public Element buildParagraph(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		Element el = new Paragraf(map.get("text").toString());
		
		return el;
	}

	@Override
	public Element buildImage(HashMap<String, Object> map) {
		Element el = new Imagine(map.get("url").toString());
		
		return el;
	}

	@Override
	public Element buildImageProxy(HashMap<String, Object> map) {
		Element el = new ImagineProxy(map.get("url").toString());
		
		return el;
	}

	@Override
	public Element buildTable(HashMap<String, Object> map) {
		Element el = new Tabel(map.get("url").toString());
		
		return el;
	}

}
