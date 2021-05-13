package util;

/**
 * this enum helps us get the right fxml path for each page of the application
 *
 */
public enum Navigator {
	LOGIN ("/loginScreen/LoginUI.fxml"),
	PRINCIPLE_DASHBOARD("/principleDashboard/PrincipleDashboardUI.fxml"),
	TEACHER_DASHBOARD ("/teacherDashboard/TeacherDashboardUI.fxml"),
	STUDENT_DASHBOARD ("/studentDashboard/StudentDashboardUI.fxml"),
	QUESTION_BANK ("/teacherDashboard/QuestionBankUI.fxml"),
	CHECK_TEST ("/teacherDashboard/CheckTestByCodeUI.fxml"),
	TEST_BANK ("/teacherDashboard/TestBankUI.fxml"),
	ADDING_NEW_TEST ("/teacherDashboard/AddingNewTestUI.fxml"),
	ACTIVE_TESTS("/principleDashboard/ActiveTestsPage.fxml"),
	VIEW_REPORTS ("ViewReports.fxml"),
	CREATE_REPORT ("CreateReport.fxml"),
	BLANK_QUESTION_FORM ("BlankQuestionFormUI.fxml"),
	STUDENT_TAKE_TEST ("StudentTakeTest.fxml"),
	GRADES ("StudentGrades.fxml");

  
	private final String val;

	Navigator(String val) {
		this.val = val;
	}

	public String getVal() {
		return val;
	}
}
