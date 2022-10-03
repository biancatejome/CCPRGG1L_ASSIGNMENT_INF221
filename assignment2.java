public class App {
    public static void main(String[] args) throws Exception {

        // FOR LOOP
        int FirstNameCount = 5;

        for (FirstNameCount = 5; FirstNameCount != 0; FirstNameCount--) 
        {
            if (FirstNameCount == 3) {
                break;
            }

            System.out.println("Jan Bianca");
        }

        //  DO WHILE LOOP
        int surnameCount = 5;

        do {
            System.out.println("Tejome");
            surnameCount--;
        } while (surnameCount != 0);

           // WHILE LOOP
           int nicknameCount = 5;
           while (nicknameCount != 0) {
   
           nicknameCount--;
                if (nicknameCount == 3) {
                    continue;
                }
           System.out.println("Jiu");
        }
    }
}
