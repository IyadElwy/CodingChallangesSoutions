import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matrix = new int[25];
        for (int i = 0; i < 25; i++) {
            matrix[i] = scanner.nextInt();
        }

        Matrix m = new Matrix(matrix);
        m.makeBeautiful();
    }
}

class Matrix {
    private int[] matrix;

    public Matrix(int[] matrix) {
        this.matrix = matrix;
    }

    public boolean checkIfMatrixBeautiful() {
        if (this.matrix[12] == 1) {
            return true;
        }
        return false;
    }

    public int getPosOfOne() {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == 1)
                return i;
        }
        return -1;
    }

    public void swapRows(int position) {
        int[] bRow = {10, 11, 12, 13, 14};
        if (position <= 4 && position >= 0) {
            System.out.println("r1");
            for (int i = 0; i < 5; i++) {
                int tempValue = this.matrix[i];
                this.matrix[i] = matrix[bRow[i]];
                matrix[bRow[i]] = tempValue;
            }
        } else if (position <= 9 && position >= 5) {
            System.out.println("r2");
            for (int i = 0; i < 5; i++) {
                int tempValue = this.matrix[i + 5];
                this.matrix[i + 5] = matrix[bRow[i]];
                matrix[bRow[i]] = tempValue;
            }
        } else if (position <= 14 && position >= 10) {
            System.out.println("r3");
            for (int i = 0; i < 5; i++) {
                int tempValue = this.matrix[i + 10];
                this.matrix[i + 10] = matrix[bRow[i]];
                matrix[bRow[i]] = tempValue;
            }
        } else if (position <= 19 && position >= 15) {
            System.out.println("r4");
            for (int i = 0; i < 5; i++) {
                int tempValue = this.matrix[i + 15];
                this.matrix[i + 15] = matrix[bRow[i]];
                matrix[bRow[i]] = tempValue;
            }
        } else if (position <= 24 && position >= 20) {
            System.out.println("r5");
            for (int i = 0; i < 5; i++) {
                int tempValue = this.matrix[i + 20];
                this.matrix[i + 20] = matrix[bRow[i]];
                matrix[bRow[i]] = tempValue;
            }
        }
    }

    public void swapColumns(int position) {
        int[] bCol = {2, 7, 12, 17, 22};
        if ((position - 5) % 5 == 0) {
            System.out.println("c1");
            for (int i = 0; i < 20; i += 5) {
                int tempValue = this.matrix[i];
                this.matrix[i] = matrix[bCol[i / 5]];
                matrix[bCol[i / 5]] = tempValue;
            }
        } else if ((position - 5) % 5 == 1) {
            System.out.println("c2");

            for (int i = 1; i < 21; i += 5) {
                int tempValue = this.matrix[i + 5];
                this.matrix[i + 5] = matrix[bCol[i / 5]];
                matrix[bCol[i / 5]] = tempValue;
            }
        } else if ((position - 5) % 5 == 2) {
            System.out.println("c3");
            for (int i = 2; i < 22; i += 5) {
                int tempValue = this.matrix[i + 10];
                this.matrix[i + 10] = matrix[bCol[i / 5]];
                matrix[bCol[i / 5]] = tempValue;
            }
        } else if ((position - 5) % 5 == 3) {
            System.out.println("c4");
            for (int i = 3; i < 23; i += 5) {
                int tempValue = this.matrix[i + 15];
                this.matrix[i + 15] = matrix[bCol[i / 5]];
                matrix[bCol[i / 5]] = tempValue;
            }
        } else if ((position - 5) % 5 == 4) {
            System.out.println("c5");
            for (int i = 4; i < 24; i += 5) {
                int tempValue = this.matrix[i + 20];
                this.matrix[i + 20] = matrix[bCol[i / 5]];
                matrix[bCol[i / 5]] = tempValue;
            }
        }
    }

    public void makeBeautiful() {
        int positionOfOne = getPosOfOne();
        if (!checkIfMatrixBeautiful()) {
            swapRows(positionOfOne);
            if (!checkIfMatrixBeautiful()) {
                swapColumns(positionOfOne);
            }
        } else {
            System.out.println("Matrix is Beautiful");
        }
        drawMatrix();
    }

    public void drawMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i]);
            if (i % 5 == 4) {
                System.out.println();
            }
        }
    }
}