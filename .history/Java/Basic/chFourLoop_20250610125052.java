class Ex4_7 {
    public static void main(String[] args) {
        for( ; ; ){
            System.out.println("Hello!");
        }
        int i = 1;

        do {
            System.out.println(i + "回目の処理");
            i++;
        } while(i <= 5);
    }
}
