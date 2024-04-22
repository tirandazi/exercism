class ResistorColor {
    int colorCode(String color) {
        String[] colorList = colors();
        int code = 0;
        for (int i = 0; i < colorList.length; i++) {
            if (colorList[i] == color) {
                code = i;
                break;
            }
        }
        return code;
    }

    String[] colors() {
        return new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }
}
