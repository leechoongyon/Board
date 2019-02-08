package org.simple;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleBoardApplicationTests
{
	private static final Logger logger = LoggerFactory.getLogger(SimpleBoardApplicationTests.class);
	
	@Autowired
	private DataSource ds;
 		
	@Test
	public void contextLoads()
	{
		
	}
	
	@Test
	public void testConnection() throws Exception
	{
		logger.debug("ds : {}", ds);
		Connection conn = ds.getConnection();
		logger.debug("conn : {}", conn);
		conn.close();
	}

}
