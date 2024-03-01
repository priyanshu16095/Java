public class Star_Pattern_Programs {
    public static void main(String[] args) {

        // n, a, s, b, z, l, q, e
        
        // RIGHT HALF PYRAMID
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // REVERSE LEFT HALF PYRAMID
        for(int i = 1; i <= 5; i++) {
            for(int j = 5; j >= i; j--) {
                System.out.print("* " );
            }
            System.out.println();
        }
        System.out.println();

        // PYRAMID
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5-i; j++) {
                System.out.print("  ");
            }
            for(int k = 1; k <= 2*i-1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // LEFT HALF PYRAMID
        for(int i = 1; i <= 5; i++) {
            for(int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // EQUILATERAL TRIANGLE PATTERN
        int e = 6;
        for(int i = 0; i < e; i++) {
            for(int j = e-i; j > 1; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        // RIGHT ANGLE TRIANGLE PATTERN WITH NUMBERS
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        // NUMBER INCREASING PYRAMID
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        // NUMBER CHANGING PYRAMID
        int s = 1, b = 4;
        for(int i = 1; i <= b; i++){
            for(int j = 1; j <= i; j++) {
                System.out.print(s + " ");
                s++;
            }
            System.out.println();
        }
        System.out.println();

        // SQUARE HOLLOW PATTERN
        // OBSERVATION : STAR IS PRINTED ONLY WHEN IT IS THE FIRST AND LAST, ROW AND COLOUMN.
        int n = 6;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // HOLLOW RIGHT ANGLE TRIANGLE PATTERN
        // OBSERVATION: STAR IS PRINTED WHEN BOUNDARY[J==1 OR J MEETS THE CONDITION OF J==I] OR FOR LAST LINE[I==N]
        int a = 6; 
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if(j == 1 || j == i || i == a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();


        // ZERO ONE TRIANGLE
        // OBSERVATION : WHEN (I+J) IS EVEN PRINT EVEN
        int z = 5;
        for(int i = 1; i <= z; i++) {
            for(int j = 1; j <= i; j++) {
                if((i+j) % 2 == 0){
                    System.out.print(0 + " ");
                } else {
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // PASCAL'S TRIANGLE
        for(int i = 0; i <= 5; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(ncr(i,j) + " ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 1; i<= 5; i++) {
            for(int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // ALPHABET RIGHT HALF PYRAMID
        char ch = 'A';
        for(int i =1; i <= 5; i++) {
            for(int j = 1; j<= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
            ch++;
        }
        System.out.println();

        // CHANGING ALPHABET RIGHT HALF PYRAMID
        char c = 'A';
        for(int i =1; i <= 5; i++) {
            for(int j = 1; j<= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
        System.out.println();
        
        // ALPHABET IN CONTINUATION : RIGHT HALF PYRAMID
        char cha = 'A';
        for(int i =1; i <= 5; i++) {
            for(int j = 1; j<= i; j++) {
                System.out.print(cha++ + " ");
            }
            System.out.println();
        }
        System.out.println();

        // PALLINDROE TRIANGLE PATTERN
        for(int i = 1; i <= 5; i++) {
            for(int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for(int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for(int m = 2; m <= i; m++) {
                System.out.print(m);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Number of Active Threads : " + Thread.activeCount());
        
    }

    // -------------------------------------------------------------
    // FUNCTION NCR
    public static int ncr(int n, int r) {
        int ncr = fact(n) / (fact(r)*fact(n-r));
        return ncr;
    }
    // FUNCTION FACTORIAL
    public static int fact(int n) {
        if(n == 0){
            return 1;
        }
        int f = 1;
        for(int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    
}
