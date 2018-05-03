public class ValidWordAbbr{
	HashMap<String,String> map = new HashMap<>();
	public ValidWordAbbr(String[] dictionary){
		for(String s:dictionary){
			String key = getKey(s);
			if(map.containsKey(key)&&!map.get(key).equals(s))
				map.put(key,"");
			else map.put(key,s);
		}
	}

	public boolean isUnique(String word){
		String key = getKey(word);
		if(!map.containsKey(key)||map.get(key).equals(word)) return true;
		return false;
	}

	public String getKey(String word){
		if(word.length()<=2) return word;
		else return word.charAt(0)+String.valueOf(word.length()-2)+word.charAt(word.length()-1);
	}
}
