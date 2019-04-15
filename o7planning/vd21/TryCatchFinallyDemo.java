package o7planning.vd21;
        public class TryCatchFinallyDemo {
                public static void main(String[] args) {
                    String text = "001234A2";
                    int value = toInteger(text);
                    System.out.println("Value= " + value);
                }
                public static int toInteger(String text) {
                    try {
                        System.out.println("Begin parse text: " + text);
                        int value = Integer.parseInt(text);
                        return value;
                    } catch (NumberFormatException e) {
                        System.out.println("Number format exception " + e.getMessage());
                        return 0;
                    } finally {
                        System.out.println("End parse text: " + text);
                    }
                }
            }
