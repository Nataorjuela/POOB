import java.time.LocalDateTime;

public class Submission {
	private static int nextSubmissionNumber;
	private int number;
	private LocalDateTime upload;
	private char status;
	private Problem problem;
	private Runable code;

	public int score(Contest c) {
		return 1;
	}

	public boolean isFor(Contest c) {
		return false;
	}

	public void evaluate() {

	}

}
