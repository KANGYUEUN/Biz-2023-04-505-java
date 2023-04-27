package com.callor.score;


public class ScoreDto {

	public String stNum;

	public int scKor;
	public int scEng;
	public int scMath;
	public int scMusic;
	public int scArt;

	public int getTotal() {
		int total = scKor;
		total += scEng;
		total += scMath;
		total += scMusic;
		total += scArt;

		return total;
	}

	public float getAvg() {
		float avg = (float) this.getTotal() / 5;
		return avg;

	}

	public void scoreTotalPrint(int scKor, int scEng, int scMath, int scMusic, int scArt) {
		System.out.printf("\t");
		System.out.printf("\t");
		System.out.printf("%3d\t", scKor);
		System.out.printf("%3d\t", scEng);
		System.out.printf("%3d\t", scMath);
		System.out.printf("%3d\t", scMusic);
		System.out.printf("%3d\t", scArt);

		System.out.printf("%3d\n", scKor + scEng + scMath + scMusic + scArt);
		// System.out.printf("%5.2f\n",(float)/ scKor + scEng + scMath + scMusic + scArt);
	}

}
