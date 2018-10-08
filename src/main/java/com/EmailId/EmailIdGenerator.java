import java.util.HashMap;
import java.util.Map;

public class EmailIdGenerator {
	public static String solution(String S, String C) {
		int count = 1;
		String[] splited = S.split(";");
		String[] company = C.split("\\s+");
		StringBuilder strBuilder = new StringBuilder();
		Map<String, String> m = new HashMap<String, String>();
		for (int i = 0; i < splited.length; i++) {
			String[] split = splited[i].trim().split("\\s+");
			if (split.length > 2) {
				if (split[2].contains("-")) {
					String[] splitTwo = split[2].toLowerCase().split("-");
					if (m.containsValue(split[0].toLowerCase() + "." + splitTwo[0] + "" + splitTwo[1].substring(0, 2)
							+ "@" + company[i] + ".com"))
						m.put(split[0] + " " + split[1] + " " + split[2], split[0].toLowerCase() + "." + splitTwo[0]
								+ "" + splitTwo[1].substring(0, 2) + count++ + "@" + company[i] + ".com");
					else
						m.put(split[0] + " " + split[1] + " " + split[2], split[0].toLowerCase() + "." + splitTwo[0]
								+ "" + splitTwo[1].substring(0, 2) + "@" + company[i] + ".com");
				} else {
					if (m.containsValue(
							split[0].toLowerCase() + "." + split[2].toLowerCase() + "@" + company[i] + ".com"))
						m.put(split[0] + " " + split[1] + " " + split[2], split[0].toLowerCase() + "."
								+ split[2].toLowerCase() + count++ + "@" + company[i] + ".com");
					else
						m.put(split[0] + " " + split[1] + " " + split[2],
								split[0].toLowerCase() + "." + split[2].toLowerCase() + "@" + company[i] + ".com");
				}
			} else {
				if (split[1].contains("-")) {
					String[] splitTwo = split[1].toLowerCase().split("-");
					if (m.containsValue(split[0].toLowerCase() + "." + splitTwo[0] + "" + splitTwo[1].substring(0, 2)
							+ "@" + company[i] + ".com"))
						m.put(split[0] + " " + split[1], split[0].toLowerCase() + "." + splitTwo[0] + ""
								+ splitTwo[1].substring(0, 2) + count++ + "@" + company[i] + ".com");
					else
						m.put(split[0] + " " + split[1], split[0].toLowerCase() + "." + splitTwo[0] + ""
								+ splitTwo[1].substring(0, 2) + "@" + company[i] + ".com");
				} else {
					if (m.containsValue(split[0].toLowerCase() + "." + split[1] + "@" + company[i] + ".com"))
						m.put(split[0] + " " + split[1],
								split[0].toLowerCase() + "." + split[1] + count++ + "@" + company[i] + ".com");
					else
						m.put(split[0] + " " + split[1],
								split[0].toLowerCase() + "." + split[1] + "@" + company[i] + ".com");
				}
			}
		}

		for (Map.Entry hm : m.entrySet())
			strBuilder.append(hm.getKey() + "<" + hm.getValue() + ">");
		return strBuilder.toString();
	}

	public static void main(String[] args) {
		String S = "John Doe; Mary Jane; John Doe Paker; Mary Jane Watson-Parker; Mary Jane Parker; John Evan Doe; John Ing Doe; Mary Kane Parker";
		String C = "techm infosys wirecard check24 tipico infosys infosys tipico";
		System.out.println(solution(S, C));
	}

}
