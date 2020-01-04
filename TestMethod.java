public class TestMethod {
    /**
     * 连接多个字符串
     * 
     * @param strArr 字符串数组
     * @return 连接的字符串
     */
    public static String concatString(String... strArr) {
        String strConcat = "";
        for (int i = 0; i < strArr.length; i++) {
            strConcat += strArr[i];
        }
        return strConcat;
    }

    /**
     * 连接string和integer
     * 
     * @param string stirng
     * @param integer integer
     * @return 连接后的字符串
     */
    public static String concatStringAndInteger(String string, Integer integer) {
        return concatString(string, String.valueOf(integer));
    }

    public static void main (String[] args) {
        System.out.println(concatString("aa", "$","bb", "$", "cc"));
        System.out.println(concatStringAndInteger("aa", 123));

    }
}