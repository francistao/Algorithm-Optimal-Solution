/**
 * 判断两个字符串是否互为变形词
 * @author dream
 *
 */
public class Solution {

	public static boolean isOtherBuild(String s1,String s2)
	{
		if(s1.length() != s2.length()){
			return false;
		}
		char[] array1 = s1.toCharArray();
		char[] array2 = s2.toCharArray();
		int map[] = new int[256];
		for(int i=0; i<array1.length; i++){
			map[array1[i]]++;
		}
		for(int j=0; j<array2.length; j++){
			if(map[array2[j]]-- < 0){
				return false;
			}
		}
		return true;
		
	}
	
	public static boolean isDeformation(String str1, String str2) {
	if (str1 == null || str2 == null || str1.length() != str2.length()) {
		return false;
	}
	char[] chas1 = str1.toCharArray();
	char[] chas2 = str2.toCharArray();
	int[] map = new int[256];
	for (int i = 0; i < chas1.length; i++) {
		map[chas1[i]]++;
	}
	for (int i = 0; i < chas2.length; i++) {
		if (map[chas2[i]]-- == 0) {
			return false;
		}
	}
	return true;
}

	public static void main(String[] args) {
		String A = "abcabcabc";
		String B = "bcacabcba";
		System.out.println(isOtherBuild(A, B));
	}
}
