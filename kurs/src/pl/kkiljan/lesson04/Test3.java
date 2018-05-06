package pl.kkiljan.lesson04;

import java.util.Arrays;

public class Test3 {


        private Integer[][] sudoku = new Integer[9][9];

        public Test3(){

        }

        public Test3(Integer[][]sudoku)
        {
            this.sudoku = sudoku;

        }

    public static Test3 sudoku() {
        Integer [][] board = new Integer[][]{
                new Integer[] {2,    null, null, 6,    null, 7,    5,    null, null},
                new Integer[] {null, null, null, null, null, null, null, 9,    6},
                new Integer[] {6,    null, 7,    null, null, 1,    3,    null, null},

                new Integer[] {null, 5,    null, 7,    3,    2,    null, null, null},
                new Integer[] {null, 7,    null, null, null, null, null, 2,    null},
                new Integer[] {null, null, null, 1,    8,    9,    null, 7,    null},

                new Integer[] {null, null, 3,    5,    null, null, 6,    null, 4},
                new Integer[] {8,    4,    null, null, null, null, null, null, null},
                new Integer[] {null, null, 5,    2,    null, 6,    null, null, 8}
        };
        return new Test3(board);

    }

    public static void main(String[] args) {


        Test3 test3 = new Test3();
        test3 = Test3.sudoku();
        System.out.println(Arrays.deepToString(test3.sudoku));



    }


}
