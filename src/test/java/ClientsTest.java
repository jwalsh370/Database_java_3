import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ClientsTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void Client_instantiatesCorrectly() {
    Client myClient = new Client("joe", 1);
    assertTrue(myClient instanceof Client);
  }

  @Test
  public void Client_getNameinstantiatesCorrectly() {
    Client myClient = new Client("joe", 1);
    assertEquals("joe", myClient.getName());
  }

  @Test
  public void all_returnsAllInstancesofClient_true() {
    Client myClient = new Client("joe", 1);
    myClient.save();
    Client mySecondClient = new Client("jam", 1);
    mySecondClient.save();
    assertEquals(true, Client.all().get(0).equals(myClient));
    assertEquals(true, Client.all().get(1).equals(mySecondClient));
  }

  @Test
  public void clear_emptiesAllClientsFromArrayList() {
    Client myClient = new Client("joe", 1);
    assertEquals(Client.all().size(), 0);
  }

  @Test
  public void getId_clientsInstantiateWithAnID_1() {
    Client myClient = new Client("joe", 1);
    myClient.save();
    assertTrue(myClient.getId() > 0);
  }

  @Test
  public void find_returnsClientWithSameId_secondClient() {
    Client firstClient = new Client("joe", 1);
    firstClient.save();
    Client secondClient = new Client("Moe", 1);
    secondClient.save();
    assertEquals(Client.find(secondClient.getId()), secondClient);
  }

  @Test
  public void equals_returnsTrueIfNamesAretheSame() {
    Client firstClient = new Client("Joe", 1);
    Client secondClient = new Client("Joe", 1);
    assertTrue(firstClient.equals(secondClient));
  }

  @Test
  public void save_returnsTrueIfNamesAretheSame() {
    Client myClient = new Client("Joe", 1);
    myClient.save();
    assertTrue(Client.all().get(0).equals(myClient));
  }


}
