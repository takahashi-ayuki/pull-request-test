public static void main(String[] arg){
    int[] a = {0,1,2,3,4};
    for(int b :a){
    int b = switch (a){
    case 0  -> {
        yield 5;
    }
    case -> 7
    case 2 -> 4
    case 3 -> 
    default -> 6 
    };
System.out.printline(b);
    }
}

