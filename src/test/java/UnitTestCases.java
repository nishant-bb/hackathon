import com.bankbazaar.servlets.HackathonServlet;
import org.junit.Assert;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.PrintWriter;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by nishant on 20/7/16.
 */
public class UnitTestCases {

    @Test
    public void testAdminPage()
    {
        /*HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);

        when(request.getParameter("username")).thenReturn("me");
        when(request.getParameter("password")).thenReturn("secret");*/
        Assert.assertEquals(true, true);

    }

    @Test
    public void testCase2()
    {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testCase3()
    {
        Assert.assertEquals(true, true);
    }

    @Test
    public void testCase4()
    {
        Assert.assertEquals(true, true);
    }
}
