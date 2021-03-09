class ReverseString {

    String reverse(String inputString) {
        if (inputString == "") {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(inputString);

        return stringBuilder.reverse().toString();
    }
  
}
