package se.s8n.dupefinder;

/**
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
    	CmdLineParser todo = new CmdLineParser(args);
    	boolean statusOK = false;
		FileDatabase db = new FileDatabase(todo.getDBLocation());
		switch (todo.getAction()) {
		case CmdLineParser.CreateDB:
			statusOK = db.createDB(todo.getDbRoot());
		case CmdLineParser.ListDB:
			statusOK = db.listDB();
		case CmdLineParser.ShowDuplicates:
			statusOK = db.showDuplicates();
		}
    	if (statusOK) {
    		System.exit(0);
    	}
    	System.exit(1);
    }
}
