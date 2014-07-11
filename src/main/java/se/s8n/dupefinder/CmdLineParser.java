package se.s8n.dupefinder;

public class CmdLineParser {
	static final int NoActionFound = 0;
	static final int CreateDB = 1;
	static final int ListDB = 2;
	static final int ShowDuplicates = 3;
	private int actionTodo;

	CmdLineParser(String[] args) {
		System.err.println("Parsing command line");
		actionTodo = NoActionFound;
	}

	int getAction() {
		// TODO Auto-generated method stub
		return actionTodo;
	}

	String getDBLocation() {
		// TODO Auto-generated method stub
		return "D:\\db";
	}

	String getDbRoot() {
		// TODO Auto-generated method stub
		return "D:\\Documents";
	}
}
