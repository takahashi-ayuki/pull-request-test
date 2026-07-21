public class Main {
public static void main(String[] args) {
int[] a = {0, 1, 2, 3, 4};
for (int b : a) {
int result = switch (b) {
case 0 -> 5;
case 1 -> 7;
case 2 -> 4;
case 8 -> 19;
case 10 -> 9999;
case 11 -> 3301;
default -> 6;
};
System.out.println(result);
}

}

}