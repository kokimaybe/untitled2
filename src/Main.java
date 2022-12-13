import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static String toRim(int num) throws IOException {
        String result = "";
        int tens = num / 10;
        int fives = (num - 10*tens) / 5;
        int ones = num - fives*5 - tens*10;

        if(num <= 0){
            throw new IOException();
        }

        if(tens >= 10){
            result += "C";
            tens -= 10;
        } else if (tens >= 9) {
            result += "XC";
            tens -= 9;
        } else if (tens >= 5) {
            result += "L";
            tens -= 5;
        } else if (tens >= 4) {
            result += "XL";
            tens -= 4;
        }

        result += "X".repeat(tens);
        result += "V".repeat(fives);
        result += "I".repeat(ones);

        return result;
    }

    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String[] input = scanner.nextLine().split(" ");
                int[] input2 = new int[3];
                String operation = "";
                int countRim = 0;
                int countLat = 0;
                int result = 0;

                for (int i = 0; i < input.length; i++) {
                    switch (input[i]) {
                        case "I":
                            input2[i] = 1;
                            countRim += 1;
                            break;
                        case "II":
                            input2[i] = 2;
                            countRim += 1;
                            break;
                        case "III":
                            input2[i] = 3;
                            countRim += 1;
                            break;
                        case "IV":
                            input2[i] = 4;
                            countRim += 1;
                            break;
                        case "V":
                            input2[i] = 5;
                            countRim += 1;
                            break;
                        case "VI":
                            input2[i] = 6;
                            countRim += 1;
                            break;
                        case "VII":
                            input2[i] = 7;
                            countRim += 1;
                            break;
                        case "VIII":
                            input2[i] = 8;
                            countRim += 1;
                            break;
                        case "IX":
                            input2[i] = 9;
                            countRim += 1;
                            break;
                        case "X":
                            input2[i] = 10;
                            countRim += 1;
                            break;
                        case "1":
                            input2[i] = 1;
                            countLat++;
                            break;
                        case "2":
                            input2[i] = 2;
                            countLat++;
                            break;
                        case "3":
                            input2[i] = 3;
                            countLat++;
                            break;
                        case "4":
                            input2[i] = 4;
                            countLat++;
                            break;
                        case "5":
                            input2[i] = 5;
                            countLat++;
                            break;
                        case "6":
                            input2[i] = 6;
                            countLat++;
                            break;
                        case "7":
                            input2[i] = 7;
                            countLat++;
                            break;
                        case "8":
                            input2[i] = 8;
                            countLat++;
                            break;
                        case "9":
                            input2[i] = 9;
                            countLat++;
                            break;
                        case "10":
                            input2[i] = 10;
                            countLat++;
                            break;
                        case "+":
                            operation = "+";
                            break;
                        case "-":
                            operation = "-";
                            break;
                        case "*":
                            operation = "*";
                            break;
                        case "/":
                            operation = "/";
                            break;
                        default:
                            throw new IOException();
                    }

                }
                if (countRim == 1) {
                    throw new IOException();
                } else if (countLat == 1) {
                    throw new IOException();
                }


                switch (operation) {
                    case "+":
                        result = input2[0] + input2[2];
                        break;
                    case "-" :
                        result = input2[0] - input2[2];
                        break;
                    case "*":
                        result = input2[0] * input2[2];
                        break;
                    case "/":
                        result = input2[0] / input2[2];
                        break;
                    default:
                        throw new IOException();
                }
                ;

                if (countRim == 2) {
                    System.out.println(toRim(result));
                } else {
                    System.out.println(result);
                }

            }
        }
    }
}