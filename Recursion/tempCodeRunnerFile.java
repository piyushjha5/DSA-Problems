public static void printBinaryStrings(int n, int lastPlace, String str) {
        if(n == 0){
            System.out.println(str)
            return;
        }
    
        printBinaryStrings(n-1, 0, str+"0");
        if(lastPlace == 0) {
            printBinaryStrings(n-1, 0, str+"1");
        }
    }