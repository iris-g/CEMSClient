package client;

import java.io.IOException;
import java.util.ArrayList;

import common.ActiveTest;
import common.TestToBeChecked;
import common.Question;
import common.ScheduledTest;
import common.Test;
import common.User;
import teacherDashboard.CheckTestsUIController;

public class ClientController {

	private static CEMSClient client;
	private static String roleFrame = null;
	private static ArrayList<Question> questions = null;
	private static ArrayList<Test> tests = null;
	private static ArrayList<ScheduledTest> scheduledTests = null;
	private static ArrayList<ActiveTest> activeTest;
	private static ArrayList<TestToBeChecked> checkTests;
	private static boolean testDeleted;
	

	public ClientController(String host, int port) {
		client = new CEMSClient(host, port, this);
	}

	/**
	 * UI request to server format: REQUEST_NAME-arg0,arg1,arg2
	 * 
	 * @param str
	 */
	public static void accept(String str) {
		try {
			client.handleMessageFromClientUI(str);
		} catch (Exception e) {
			try {
				client.closeConnection();
				e.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	public static String getRoleFrame() {
		return roleFrame;
	}

	public static void setRoleFrame(String roleFrame) {
		ClientController.roleFrame = roleFrame;
	}

	public static User getActiveUser() {
		return client.getActiveUser();
	}

	public static boolean getTestDeleted() {
		return testDeleted;
	}

	public static void setTestDeleted(boolean testDeleted) {
		ClientController.testDeleted = testDeleted;
	}

	public static ArrayList<Question> getQuestions() {
		return questions;
	}

	public static void setQuestions(ArrayList<Question> questions) {
		ClientController.questions = questions;
	}

	public static ArrayList<Test> getTests() {
		return tests;
	}

	public static void setTests(ArrayList<Test> tests) {
		ClientController.tests = tests;
	}

	public static ArrayList<ScheduledTest> getScheduledTests() {
		return scheduledTests;
	}

	public static void setScheduledTests(ArrayList<ScheduledTest> scheduledTests) {
		ClientController.scheduledTests = scheduledTests;
	}

	public static void setActiveTest(ArrayList<ActiveTest> activeTest) {

		ClientController.activeTest = activeTest;
	}

	public static ArrayList<ActiveTest> getActiveTest() {

		return activeTest;
	}
	
	public static void setTestToBeChecked(ArrayList<TestToBeChecked> checkTests) {

		ClientController.checkTests = checkTests;
	}

	public static ArrayList<TestToBeChecked> getTestToBeChecked() {
		
		return checkTests;
	}
	
}
