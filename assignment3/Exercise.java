public class Exercise {
    public static void main(String[] args) throws Exception {

        char [][] mdArray = {{'1','1','1'},{'1','1','1'},{'1','1','1'}, {'1', '1', '1'}};
        
        System.out.println("ASSIGNMENT #3: 10/24/2022");
        
        System.out.println(" ");
        
        System.out.println("1. PATTERN 1");
    
        //  PRINT if ODD rows, otherwise PRINT blank output for EVEN rows 
        
        // Outer loop
            for (int rows = 0; rows < mdArray.length; rows++) {
                System.out.println("");
        // Inner loop
            for (int columns = 0; columns < 3; columns++) {
                if (rows %2 != 0)
                    System.out.print(mdArray[rows][columns]);
            }
        }
        
        System.out.println("");
    
        System.out.println("2. PATTERN 2");
        
        //  PRINT if EVEN rows, otherwise PRINT blank output for ODD rows 
        
        // Outer loop
            for (int rows = 0; rows < mdArray.length; rows++) {
                System.out.println("");
        // Inner loop
            for (int columns = 0; columns < 3; columns++) {
                if (rows %2 == 0)
                    System.out.print(mdArray[rows][columns]);
            }
        }
        
        System.out.println("");
        
        System.out.println("3. PATTERN 3");
        
        //  PRINT if row 0 and row 3, for rows 1 & 2, print column 1 only
        
        // Outer loop
            for (int rows = 0; rows < mdArray.length; rows++) {
                System.out.println("");

        // Inner loop
            for (int columns = 0; columns < 3; columns++) {
                    System.out.print("");
                    
                if (rows == 0 || rows == 3) {
                    System.out.print(mdArray[rows][columns]);
                    }
                    
                if (rows == 1 || rows == 2) {
                    if (columns == 0 || columns == 2) {
                    System.out.print(" ");
                    }else{
                    System.out.print(mdArray[rows][columns]);
                    }
                }
            }
        }
        
        System.out.println("");
        
        System.out.println("4. PATTERN 4");
        
                //  PRINT if row 0 and row 3, for rows 1 & 2, print column 1 only
        
        // Outer loop
            for (int rows = 0; rows < mdArray.length; rows++) {
                System.out.println("");

        // Inner loop
            for (int columns = 0; columns < 3; columns++) {
                    System.out.print("");
                    
                if (rows == 1 || rows == 3) {
                    System.out.print(mdArray[rows][columns]);
                    }
                    
                if (rows == 0 || rows == 2) {
                    if (columns == 0 || columns == 2) {
                    System.out.print(" ");
                    }else{
                    System.out.print(mdArray[rows][columns]);
                    }
                }
            }
        }
        
        System.out.println("");
        
        
        int [][] sumArray = {{1,1,1},{1,1,1},{1,1,1}, {1, 1, 1}};
        System.out.println();
        System.out.println("5.  GET THE SUM!");

        int sum = 0;  
        
        // Outer Loop
            for (int rows = 0; rows < sumArray.length; rows++) {
        // Inner Loop
            for (int column = 0; column < 3; column++) {
            sum += sumArray[rows][column];
            }
        }
            System.out.print("The SUM of the Array Elements: " + sum);
    }
}
