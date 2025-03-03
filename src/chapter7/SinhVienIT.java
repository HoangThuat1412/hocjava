package chapter7;

public class SinhVienIT extends SinhVien {

	private double scoreJava;
	private double scoreHTML;

	public double getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(double scoreJava) {
		this.scoreJava = scoreJava;
	}

	public double getscoreHTML() {
		return scoreHTML;
	}

	public void setScoreHTML(double scoreHTML) {
		this.scoreHTML = scoreHTML;
	}

	public SinhVienIT(double scoreJava, double scoreHTML) {
		this.scoreJava = scoreJava;
		this.scoreHTML = scoreHTML;
	}

	double getDiem() {

		return (this.scoreJava * 2 + this.scoreHTML) / 3;
	}

}
