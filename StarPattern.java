package pattern.star;

public class StarPattern {
    public void printNumberEight(int rows) {
        for (int i = 1; i < rows * 2; i++) {
            for (int j = 1; j <= rows; j++) {
                if ((i == 1 && (j == 1 || j == rows)) ||
                        (i == rows && (j == 1 || j == rows)) ||
                        (i == rows * 2 - 1 && (j == 1 || j == rows))) {
                    System.out.print(" ");
                } else if (i == 1 || i == rows || i == (rows * 2) - 1 || j == 1 || j == rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }

    public void printHeartPattern(int rows) {
        for (int i = rows / 2; i <= rows; i += 2) {
            for (int j = 1; j < rows - i; j += 2) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            for (int l = 1; l <= rows - i; l++) {
                System.out.print(" ");
            }

            for (int m = 1; m <= i; m++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = rows; i >= 1; i--) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void printHeartPattenWithName(int rows, String name) {
        char[] charName = name.toCharArray();
        int nameLength = charName.length;

        // upper part of the heart shape
        for (int i = rows / 2; i <= rows; i += 2) {
            for (int j = 1; j < rows - i; j += 2) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            for (int l = 1; l <= rows - i; l++) {
                System.out.print(" ");
            }

            for (int m = 1; m <= i; m++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // lower triangular part of the heart shape
        for (int i = rows; i >= 1; i--) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            if (i == rows) {
                for (int k = 1; k <= (rows * 2 - nameLength) / 2; k++) {
                    System.out.print("*");
                }

                System.out.print(name);

                for (int l = 1; l <= (rows * 2 - nameLength) / 2; l++) {
                    System.out.print("*");
                }
            } else {
                for (int m = 1; m <= (i * 2) - 1; m++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }

    public void printRightArrow(int rows) {
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j <= (2 * i - 2); j++) {
                System.out.print(" ");
            }

            for (int k = i; k <= rows; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int l = 1; l <= rows; l++) {
            for (int m = 1; m <= (2 * rows - 2 * l); m++) {
                System.out.print(" ");
            }

            for (int n = 1; n <= l; n++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void printLeftArrow(int rows) {
        // upper part of the arrow
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" ");
            }

            // inverted right triangle
            for (int k = i; k <= rows; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // bottom part of the arrow
        for (int l = 1; l <= rows; l++) {
            for (int m = 1; m < l; m++) {
                System.out.print(" ");
            }

            // the right triangle
            for (int n = 1; n <= l; n++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public void printFullDiamond(int rows) {
        int stars = 1;
        int spaces = rows - 1;

        for (int i = 1; i < rows * 2; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k < stars * 2; k++) {
                System.out.print("*");
            }

            System.out.println();

            if (i < rows) {
                spaces--;
                stars++;
            } else {
                spaces++;
                stars--;
            }
        }

    }

    public void printHalfDiamond(int rows) {
        int columns = 1;

        for (int i = 1; i < rows * 2; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("*");
            }

            if (i < rows)
                columns++;
            else
                columns--;

            System.out.println();
        }
    }

    public void printRightTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void printMirroredRightTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public void printInvertedRightTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= rows; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void printInvertedMirroredRightTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j <= rows; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void printHollowRightTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == rows) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }

    public void printHollowInvertedRightTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                if (i == rows || k == 1 || k == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }

    public void printSquare(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void printRhombus(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= rows; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void printRectangle(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void printPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void printPlus(int rows) {
        for (int i = 1; i <= (rows * 2 - 1); i++) {
            if (i == rows) {
                for (int j = 1; j <= (rows * 2 - 1); j++) {
                    System.out.print("+");
                }
            } else {
                for (int k = 1; k <= rows - 1; k++) {
                    System.out.print(" ");
                }

                System.out.print("+");
            }

            System.out.println();
        }
    }

    public void printX(int rows) {
        int count = rows * 2 - 1;

        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= count; j++) {
                if (j == i || (j == count - i + 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }

    public void printParallelogram(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= columns; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}