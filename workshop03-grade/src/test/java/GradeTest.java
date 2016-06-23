import static org.junit.Assert.*;

import org.junit.Test;

public class GradeTest {
	
	Grade grade = new Grade();

	@Test public void 
	grade_A_with_score_80() {
		assertEquals("A", grade.withScore(80));
	}

	@Test public void 
	gradeB_with_score_70() {
		assertEquals("B", grade.withScore(70));
	}

	@Test public void 
	grade_C_with_score_60() {
		assertEquals("C", grade.withScore(60));
	}

	@Test public void 
	grade_D_with_score_50() {
		assertEquals("D", grade.withScore(50));
	}

	@Test public void 
	grade_F_with_score_40() {
		assertEquals("F", grade.withScore(40));
	}

}
