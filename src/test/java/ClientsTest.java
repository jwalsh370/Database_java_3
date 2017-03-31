import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ClientsTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test public void Client_instantiatesCorrectly() {
    Client myClient = new Client("joe", 1);
    assertTrue(myClient instanceof Client);
  }

  @Test public void Client_getNameinstantiatesCorrectly() {
    Client myClient = new Client("joe", 1);
    assertEquals("joe", myClient.getName());
  }

}
