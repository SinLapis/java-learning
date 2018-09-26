public class VampireNumber {
    private char[] removeCharElement(char[] array, int index) {
        char[] resultArray = new char[array.length - 1];
        //可以申请动态长度
        for (int i = 0; i < array.length; i++) {
            if (i < index) {
                resultArray[i] = array[i];
            } else if (i > index) {
                resultArray[i - 1] = array[i];
            }
        }
        return resultArray;
    }
    private boolean charArrayCompare(char[] srcArray, char[] dstArray, int index) {
        //在src里搜索dst的index位，并根据index大小判断是否全部匹配
        for (int i = 0; i < srcArray.length; i++) {
            if (dstArray[index] == srcArray[i]) {
                //递归，去掉src中匹配的位
                return charArrayCompare(removeCharElement(srcArray, i), dstArray, index + 1);
            }
        }
        //递归出口
        return index >= dstArray.length;
    }
    public static void main(String[] args) {
        VampireNumber v = new VampireNumber();
        for (int i = 10; i < 100; i++) {
            for (int j = i; j < 100; j++) {
                int multiResult = i * j;
                //是4位数，不是100的倍数
                if (multiResult > 1000 && (multiResult % 100 != 0)) {
                    char[] paramCharArr = (String.valueOf(i) + String.valueOf(j)).toCharArray();
                    char[] multiResultCharArr = String.valueOf(multiResult).toCharArray();
                    if(v.charArrayCompare(paramCharArr, multiResultCharArr, 0)) {
                        System.out.println(i + " * " + j + " = " + multiResult);
                    }
                }
            }
        }
    }
}
