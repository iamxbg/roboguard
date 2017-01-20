package roboguard.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import roboguard.config.RootConfig;
import roboguard.entity.UserT;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={RootConfig.class})
public class UserDaoTest {
	
	@Autowired
	private SessionFactory sf;
	
	@SuppressWarnings("unchecked")
	@Test
	public void testFindAllUsers(){
	
		System.out.print("------");
		Session sess=sf.openSession();
		Assert.assertNotNull(sess);
		

			
			Query<UserT> query=sess.createQuery(" from roboguard.entity.UserT u ");
			
			
			
			List<UserT> userList=query.getResultList();

				System.out.println("record-count:"+userList.size());
				for(UserT user:userList){
					System.out.println("username:"+user.getNickname());
				}
			
				
			sess.close();
	}
	
}
