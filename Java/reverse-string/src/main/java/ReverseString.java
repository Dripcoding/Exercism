class ReverseString {

    public String reverse(String inputString) {
        if (inputString == "") {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(inputString);

        return stringBuilder.reverse().toString();
    }

    public String reverseWithCharArray(String inputString) {
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

        return new String(charArray);
    }

    public String reverseWithByteStream(String inputString) {
        if (inputString == "") {
            return "";
        }

        byte[] inputAsBytes = inputString.getBytes();
        byte[] byteStream = new byte[inputAsBytes.length];

        for (int i = 0; i < inputAsBytes.length; i++) {
            byteStream[i] = inputAsBytes[inputAsBytes.length - i - 1];
        }

        return new String(byteStream);
    }
}
