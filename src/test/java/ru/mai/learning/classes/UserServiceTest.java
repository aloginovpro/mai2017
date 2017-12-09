package ru.mai.learning.classes;

import org.junit.Test;
import ru.mai.learning.classes.testing.IllegalUserIdException;
import ru.mai.learning.classes.testing.UserDao;
import ru.mai.learning.classes.testing.UserService;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Test
    public void test() {
        UserDao dao = mock(UserDao.class);
        when(dao.getUserName(anyInt())).thenReturn("Vasya");
        UserService service = new UserService(dao);
        UserService.UserDetails userDetails = service.getUserDetails(10);
        assertEquals("Vasya", userDetails.name);
        assertEquals(10, userDetails.id);
    }

    @Test(expected = IllegalUserIdException.class)
    public void testNegativeId() {
        UserDao dao = mock(UserDao.class);
        UserService service = new UserService(dao);
        service.getUserDetails(-1);
    }

}
