import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        int[][] seats = new int[5][6];
        int[][] check = {
            {0,2},{1,1},{2,5},{3,0},{3,5},{4,2}
        };
        for (int reservation = 0; reservation < check.length; reservation++){
            int reservationLine = check[reservation][0];
            int reservationColumn = check[reservation][1];
            seats[reservationLine][reservationColumn] = 1;
        }
        for (int line =0; line <5; line++){
            for(int column =0; column <6; column++){
            System.out.print("[" + seats[line][column] + "]");
            }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("予約したい座席の行番号（1-5）: ");
        String seatsLine = scanner.nextLine();
        int seatsLines = Integer.parseInt(seatsLine);
        System.out.print("予約したい座席の列番号（1-6）: ");
        String seatsColumn = scanner.nextLine();
        int seatsColumns = Integer.parseInt(seatsColumn);

        if (seatsLines > 5 || seatsColumns > 6 || seatsLines < 1 || seatsColumns < 1){
            System.out.println("無効な座席番号です。");
        }
        else if(seats[seatsLines - 1][seatsColumns - 1] == 1) {
            System.out.println("指定された座席はすでに予約済みです。");
        }
        else {seats[seatsLines - 1][seatsColumns - 1] = 1;
            System.out.println(seatsLines + "行" + seatsColumns + "列" + "の座席を予約しました");
        }
        scanner.close();
        
        System.out.println("予約後の座席状況");
        for (int line =0; line <5; line++){
            for(int column =0; column <6; column++){
            System.out.print("[" + seats[line][column] + "]");
            }
            System.out.println();

        }
    }
}
