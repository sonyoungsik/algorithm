package Lunch_menu_recommendation;

import java.util.Scanner;

public class find_a_quiet_place {

	public static void main(String[] args) {

		while (true) {
			
			Scanner sc = new Scanner(System.in);

			int a = sc.nextInt(); // 공사 현장의 x 좌표
			int b = sc.nextInt(); // 공사 현장의 y 좌표
			int R = sc.nextInt(); // 공자 현장의 소음 크기
			int N = sc.nextInt(); // 나무 그늘의 갯수

			int x_N = 0; // 나무 그늘 N의 x좌표
			int y_N = 0; // 나무 그늘 N의 y좌표

			int[] x_N_Array = new int[N]; // 나무 그늘 N개의 x좌표값 배열로 저장
			int[] y_N_Array = new int[N]; // 나무 그늘 N개의 y좌표값 배열로 저장

			for (int i = 0; i < N; i++) { // 나무 그늘 N개 만큼 x좌표, y좌표 값을 입력받고, 그늘 갯수 순서대로 좌표값 배열로 저장

				x_N = sc.nextInt();
				x_N_Array[i] = x_N;

				y_N = sc.nextInt();
				y_N_Array[i] = y_N;
			}

			for (int i = 0; i < N; i++) { // 나무 그늘 N개 만큼 공사장 위치와 나무 그늘 위치 간의 거리를 비교 계산 반복 수행하여 소음 크기보다 멀리 있는 경우 결과값 출력
				if (Math.pow(x_N_Array[i] - a, 2) + Math.pow(y_N_Array[i] - b, 2) >= Math.pow(R, 2)) { // (x-a)^2 - (y-a)^2 >= R^2 (점과 점 사이의 거리 공식)
					System.out.println("silent"); // 거리가 충분히 멀면 책 읽기에 좋은 조건을 알려주고..
				} else {
					System.out.println("noisy"); // 공사장과 거리가 가깝다면.. 책 읽을 수 없겠네요..ㅠㅠ
				}
			}
			System.out.print("\n");
		}
	}
}
