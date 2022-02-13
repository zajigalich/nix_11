import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    public void main(String[] args) {
        System.out.println("Enter 1 to execute the programme or 0 to exit");
        String executor = this.scanner.nextLine();
        do {
            switch (executor){
                case "0" -> System.exit(1);
                case "1" -> Chooser(executor);
            }
        }
        while ((executor = scanner.nextLine())!=null);
    }

    private void Chooser(String executor) {
        executor = this.scanner.nextLine();
        switch (executor){
        }
    }
}
