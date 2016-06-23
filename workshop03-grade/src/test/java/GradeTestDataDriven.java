import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class GradeTestDataDriven {

	Grade grade = new Grade();
	private int score;
	private String expectedGrade;
	
	public GradeTestDataDriven(int score, String expectedGrade) {
		this.score = score;
		this.expectedGrade = expectedGrade;
	}
	
	@Parameters public static Collection<Object[]>
	data_Score_and_expectedGrade(){
		return Arrays.asList(new Object[][]{
			{80, "A"},
			{70, "B"},
			{60, "C"},
			{50, "D"},
			{40, "F"},
			{30, "F"},
		});
	}

	@Test public void 
	convert_score_to_grade() {
		assertEquals(String.format("%d => %s", score, expectedGrade), expectedGrade, grade.withScore(score));
	}

}
