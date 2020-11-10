import java.time.Duration;
import java.util.ArrayList;

public class Problem {
	private String name;
	private int score;
	private Duration executionLimit;
	private String topic;
	private ArrayList<Test> tests;
	private ArrayList<Submission> submissions;
	public boolean evaluate(Runable r) {
		return false;
	}
}
