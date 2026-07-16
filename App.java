public static void main(String[] arg){
    int a = 0;
    int b = switch (a){
    case 0  -> {
        yield 5;
    }
    default -> 6 
    };
System.out.printline(b);
}

