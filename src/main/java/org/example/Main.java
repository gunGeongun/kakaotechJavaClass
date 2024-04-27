package org.example;

import java.util.Arrays;
import java.util.Scanner;

//20224287984 김건
public class Main {
    public static int LOTTO_NUM = 6;
    public static void InputNoDuplicateLottoNum(int[][] randomLotto){ //중복되지 않은 로또 번호 생성 및 저장
        int i,j,k;
        int num;
        for(i=0;i<randomLotto.length;i++) {
            for (j = 0; j < randomLotto[0].length; j++) {
                num = (int) (Math.random() * 45) + 1;
                boolean duplicate = false;
                for (k = 0; k < j; k++) {  //중복검사
                    if (randomLotto[i][k] == num) {
                        duplicate = true;
                        break;
                    }
                }
                if (duplicate) {
                    j--;
                }
                else {
                    randomLotto[i][j] = num;
                }
            }
            Arrays.sort(randomLotto[i]);
        }

    }
    public static void InputLottoNum(int[] lottoNum){ //당첨 번호 저장
        int i,j;
        int num;
        for(i=0;i<lottoNum.length;i++) {
            num = (int)(Math.random() * 45) + 1;
            boolean duplicate = false;
            for(j=0;j<i;j++){
                if (lottoNum[j] == num) {
                    duplicate = true;
                    break;
                }
            }
            if (duplicate) {
                i--;
            }
            else {
                lottoNum[i] = num;
            }

        }
        Arrays.sort(lottoNum);
    }
    public static void PrintLottoNum(int[][] randomLotto,int[] lottoNum){ //랜덤 번호, 당첨 번호 출력
        int i, j;
        System.out.println("--------------------------------------------");
        System.out.println("자동 생성 번호: ");
        for(i=0;i<randomLotto.length;i++) {
            System.out.printf("[%d] ", (i+1));
            for (j = 0; j < randomLotto[0].length; j++) {
                System.out.printf("%2d ",randomLotto[i][j]);
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");
        System.out.print("당첨 번호: ");
        for(i=0;i<lottoNum.length;i++){
            System.out.printf("%2d ",lottoNum[i]);
        }
        System.out.println();
        System.out.println("--------------------------------------------");

    }
    public static void CompareLottoNum(int[][] randomLotto, int[] lottoNum) {
        for (int i = 0; i < randomLotto.length; i++) {
            System.out.printf("Result[%d]: ", (i+1));
            for (int j = 0; j < randomLotto[i].length; j++) {
                System.out.printf("%2d ", randomLotto[i][j]);
            }
            System.out.println();
            System.out.print("            ");
            for (int j = 0; j < randomLotto[i].length; j++) {
                boolean matched = false;
                for (int k = 0; k < lottoNum.length; k++) {
                    if (randomLotto[i][j] == lottoNum[k]) {
                        matched = true;
                        break;
                    }
                }
                System.out.printf("%s  ", matched ? "O" : "X");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int i,j,gameCount;
        Scanner sc = new Scanner(System.in);
        while(true){
            int[][] randomLotto;
            int[] lottoNum = new int[6];
            System.out.print("구입할 Lotto 게임 수를 입력하세요 (1~5):");
            gameCount = sc.nextInt();
            if(gameCount<1 && gameCount>5){
                continue;
            }
            randomLotto = new int[gameCount][LOTTO_NUM];
            InputNoDuplicateLottoNum(randomLotto); //중복되지 않은 로또 번호 생성 및 저장
            InputLottoNum(lottoNum); //당첨번호 저장
            PrintLottoNum(randomLotto,lottoNum); //랜덤 번호, 당첨 번호 출력
            CompareLottoNum(randomLotto,lottoNum); // 랜덤 번호 ,당첨 번호 비교
            System.out.println("Lotto 게임 종료");
            break;


        }
    }
}
