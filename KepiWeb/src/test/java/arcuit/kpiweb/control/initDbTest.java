package arcuit.kpiweb.control;

import arcuit.kpiweb.action.InitDb;
import org.junit.Ignore;
import org.junit.Test;

public class initDbTest {
    @Test
    @Ignore
    public void testInitDb(){
        InitDb action = new InitDb();
        action.execute();
    }
}
