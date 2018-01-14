package Loboda.db;

import java.sql.Connection;

public interface ConnectionFactory {
	Connection createConnection() throws DatabaseExeption;
}
