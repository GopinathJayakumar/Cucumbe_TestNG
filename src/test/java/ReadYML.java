import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.esotericsoftware.yamlbeans.YamlReader;

public class ReadYML {
	
	@SuppressWarnings("unchecked")
	@Test
	public void readYMLTestData() throws Exception {
		YamlReader reader = new YamlReader(new FileReader("./testData/Credentials.yml"));
		Object obj = reader.read();
		Map<String, String> getTestMap = new HashMap<String, String>();
		getTestMap = (Map<String, String>) obj;
		String userName = getTestMap.get("userName");
		System.out.println(userName);
	}

}
