package diyproject;
import diyproject.dao.DBconnection;

public class diyprojectApp {

	public diyprojectApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		DBconnection.getConnection();
	}

}
