class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 65; i <= 90; i++) {
            stringBuilder.append((char) i).append(" ");
        }
        return stringBuilder.deleteCharAt(stringBuilder.length() - 1);
    }
}