import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;

public class StylistsTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void stylists_instantiatesCorrectly_true() {
    Stylist testStylist = new Stylist("Jay");
    assertEquals(true, testStylist instanceof Stylist);
  }

  @Test
  public void getName_stylistsInstantiatesWithName_Jay() {
    Stylist testStylist = new Stylist("Jay");
    assertEquals("Jay", testStylist.getName());
  }

  @Test
  public void all_returnsAllInstancesOfStylist_true() {
   Stylist firstStylist = new Stylist("Jay");
   firstStylist.save();
   Stylist secondStylist = new Stylist("Work");
   secondStylist.save();
   assertEquals(true, Stylist.all().get(0).equals(firstStylist));
   assertEquals(true, Stylist.all().get(1).equals(secondStylist));
  }

  @Test
  public void getId_stylistsInstantiateWithAnId_1() {
    Stylist testStylist = new Stylist("Jay");
    testStylist.save();
    assertTrue(testStylist.getId() > 0);
  }

  @Test
  public void find_returnsStylistWithSameId_secondStylist() {
    Stylist firstStylist = new Stylist("Jay");
    firstStylist.save();
    Stylist secondStylist = new Stylist("Tom");
    secondStylist.save();
    assertEquals(Stylist.find(secondStylist.getId()), secondStylist);
  }

   @Test
   public void equals_returnsTrueIfNamesAretheSame() {
     Stylist firstStylist = new Stylist("Jacob");
     Stylist secondStylist = new Stylist("Jacob");
     assertTrue(firstStylist.equals(secondStylist));
   }

   @Test
   public void save_savesIntoDatabase_true() {
     Stylist myStylist = new Stylist("Susan");
     myStylist.save();
     assertTrue(Stylist.all().get(0).equals(myStylist));
   }

   @Test
   public void save_assignsIdToObject() {
     Stylist myStylist = new Stylist("Susan");
     myStylist.save();
     Stylist savedStylist = Stylist.all().get(0);
     assertEquals(myStylist.getId(), savedStylist.getId());
   }

   @Test
   public void getClients_retrievesALlClientsFromDatabase_clientsList() {
     Stylist myStylist = new Stylist("Susan");
     myStylist.save();
     Client firstClient = new Client("Joseph", myStylist.getId());
     firstClient.save();
     Client secondClient = new Client("Maria", myStylist.getId());
     secondClient.save();
     Client[] clients = new Client[] { firstClient, secondClient };
     assertEquals(false, myStylist.getClients().containsAll(Arrays.asList(clients)));
   }


}
