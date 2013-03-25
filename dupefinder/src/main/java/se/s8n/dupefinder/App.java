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
		FileDatabase db = new FileDatabase();
		switch (todo.getAction()) {
		case CmdLineParser.CreateDB:
			statusOK = db.createDB(todo.getDBLocation(), todo.getDbRoot());
		case CmdLineParser.ListDB:
			statusOK = db.listDB(todo.getDBLocation());
		case CmdLineParser.ShowDuplicates:
			statusOK = db.showDuplicates(todo.getDBLocation());
		}
    	if (statusOK) {
    		System.exit(0);
    	}
    	System.exit(1);
    }
}
