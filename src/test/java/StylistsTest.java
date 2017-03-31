import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;

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

}
