/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *    |_ IDBManager
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * <pre>
 *
 * @author		: joo
 * @version		: 1.0
 */
public interface IDBManager
{
	static final String ORACLE_DATABASE = "ORACLE";
	static final String SYBASE_DATABASE = "SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	static IDBManager getDBObject(String database)
	{
		if(database.equals(ORACLE_DATABASE))
		{
			return new OracleDB();
		}
		else if(database.equals(SYBASE_DATABASE))
		{
			return new SybaseDB();
		}
		return null;							// 이건 무조건 써야 함.
	}
}