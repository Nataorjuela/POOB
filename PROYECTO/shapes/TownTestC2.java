
// import static org.junit.Assert.*;
// import org.junit.After;
// import org.junit.Before;
// import org.junit.Test;

// public class TownTestC2

// {
    // /**

     // * Default constructor for test class TownTestC2

     // */

    // public TownTestC2()

    // {

    // }
    // /**

     // * Sets up the test fixture.

     // *

     // * Called before every test case method.

     // */

    // @Before

    // public void setUp()

    // {

    // }
    // @Test

    // public void createTheLocation(){

        // Town town = new Town(800, 900);
        // town.addLocation("pink",100, 200);
        // town.addLocation("yellow",100, 700);
        // //assertEquals(2,town.localidades.size());
    // }
    
    // @Test
    // public void createTheStreet(){
        // Town town = new Town(800, 900);

        // town.addLocation("pink", 80 , 100);

        // town.addLocation("yellow", 150, 700);

        // town.addLocation("orange", 400, 400 );

        // town.addLocation("blue", 400, 150);

        // town.addStreet("pink","yellow");

        // town.addStreet("orange", "blue");

        // //assertEquals(2,town.caminos.size());

    // }
    // @Test
    // public void createTheSing(){
        // Town town = new Town(800, 900);
        // town.addLocation("pink", 80, 100);
        // town.addLocation("red", 150,700);
        // town.addStreet("pink", "red");
        // town.addSign("red","pink");
        // //assertEquals(1,town.señales.size());
    // }
    // @Test
    // public void delTheLocation(){
        // Town town = new Town(800,900);
        // town.addLocation("red",60,100);
        // town.addLocation("yellow",80,100);
        // town.addLocation("orange",120, 100);
        // town.addStreet("red","yellow");
        // //town.delLocation("red");
        // //assertEquals(2,town.localidades().size());
    // }
    
    // @Test
    // public void delLocation2(){
        // Town town = new Town(800,9000);

        // town.addLocation("pink",60,200);

        // town.addLocation("yellow",80,100);

        // town.addLocation("orange",150, 400);

        // town.addStreet("pink","yellow");

        // //town.delLocation("orange");

        // //assertEquals(2,town.localidades.size());

    // }
    // @Test
    // public void delStreet(){

        // Town town = new Town(800, 900);
        // town.addLocation("pink", 80 , 100);
        // town.addLocation("yellow", 150, 700);
        // town.addLocation("orange", 400, 400 );
        // town.addLocation("blue", 400, 150);
        // town.addStreet("pink","yellow");
        // town.addStreet("orange", "blue");
        // //town.deleteStreet();
        // //assertEquals(1,town.caminos.size());
    // }
    
    // @Test
    // public void delSing(){
        // Town town = new Town(800, 900);
        // town.addLocation("pink", 80, 100);
        // town.addLocation("red", 150,700);
        // town.addStreet("pink", "red");
        // town.addSign("red","pink");
        // town.deleteSign("red","pink");
        // //assertEquals(0,town.señales.size());
    // }
    // /**
     // * Tears down the test fixture.
     // *
     // * Called after every test case method.
     // */
    // @After
    // public void tearDown()
    // {
    // }
// }