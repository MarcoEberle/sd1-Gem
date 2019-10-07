import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * This test class is for testing the GemBox and Gem class.
 */
public class GemBoxTest {

    @Test
    public void add() {
        //Arrange
        final GemBox sut = new GemBox();
        List<Gem> testList = new ArrayList<>();
        testList.add(Gem.Diamond);
        testList.add(Gem.Diamond);
        testList.add(Gem.Diamond);
        //Act
        sut.add(Gem.Diamond, 3);
        //Assert
        assertEquals(sut.getBox(), testList);

    }

    @Test
    public void remove() {
        //Arrange
        final GemBox sut = new GemBox();
        List<Gem> testList = new ArrayList<>();
        sut.add(Gem.Diamond,2);
        sut.add(Gem.Emerald,1);
        sut.add(Gem.Ruby,1);
        testList.add(Gem.Emerald);
        testList.add(Gem.Ruby);
        //Act
        sut.remove(Gem.Diamond, 2);
        //Assert
        assertEquals(sut.getBox(), testList);
    }

    @Test
    public void alchemy() {
        //Arrange
        final GemBox sut = new GemBox();
        List<Gem> testList = new ArrayList<>();
        sut.add(Gem.Diamond,1);
        sut.add(Gem.Emerald,1);
        testList.add(Gem.Diamond);
        testList.add(Gem.Diamond);
        //Act
        sut.alchemy(Gem.Emerald, Gem.Diamond);
        //Assert
        assertEquals(sut.getBox(), testList);
    }

    @Test
    public void print() {
        //Arrange
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        final GemBox sut = new GemBox();
        sut.add(Gem.Diamond,1);
        sut.add(Gem.Ruby,3);
        sut.add(Gem.Emerald,2);
        final String want = "(DRRREE)";
        //Act
        sut.print();
        //Assert
        assertEquals(want, outContent.toString());
    }
}