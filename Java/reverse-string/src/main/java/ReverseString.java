class ReverseString {

//    public String reverse(String inputString) {
//        if (inputString == "") {
//            return "";
//        }
//
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(inputString);
//
//        return stringBuilder.reverse().toString();
//    }

    public String reverse(String inputString) {
        if (inputString == "") {
            return "";
        }

        char[] charArray = inputString.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        for (left = 0; left < right; left++, right--) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
        }

        System.out.println(charArray);

        return new String(charArray);
    }
}
