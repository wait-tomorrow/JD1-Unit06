package by.tc.task01.dao;

public class DAOException extends Exception {

    public DAOException() {
	super();
    }

    public DAOException(String message) {
	super(message);
    }

    public DAOException(Exception e) {
	super(e);
    }
}
