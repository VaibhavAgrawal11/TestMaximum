import org.junit.Assert;
import org.junit.Test;
public class TestMaximum {
    Maximum maximum ;

    @Test
    public void givenThreeInteger_WhenProper_MaximumShouldBeTrue() {
        maximum = new Maximum(1,2,3);
        Integer maximumInteger = (Integer) maximum.testMaximum();
        Assert.assertEquals(3,(int)maximumInteger);
    }

    @Test
    public void givenThreeInteger_WhenProper_MaximumShouldBeTrue_2() {
        maximum = new Maximum(2,2,1);
        Integer maximumInteger = (Integer) maximum.testMaximum();
        Assert.assertEquals(2,(int)maximumInteger);
    }

    @Test
    public void givenThreeFloat_WhenProper_MaximumShouldBeTrue() {
        maximum = new Maximum(1.2f,22.3f,33f);
        Float maximumFloat = (Float) maximum.testMaximum();
        Assert.assertEquals((Float)33f,maximumFloat);
    }

    @Test
    public void givenThreeFloat_WhenProper_MaximumShouldBeTrue_2() {
        maximum = new Maximum(1.2f,22.3f,22.4f);
        Float maximumFloat = (Float) maximum.testMaximum();
        Assert.assertEquals((Float)22.4f,maximumFloat);
    }

    @Test
    public void givenThreeStrings_WhenProper_MaximumShouldBeTrue() {
        maximum = new Maximum("Vaibhav","Aish","YoYo");
        String maximumString = (String) maximum.testMaximum();
        Assert.assertEquals("YoYo",maximumString);
    }

    @Test
    public void givenThreeStrings_WhenProper_MaximumShouldBeTrue_2() {
        maximum = new Maximum("Vaibhav","vaibhav","vaibh");
        String maximumString = (String) maximum.testMaximum();
        Assert.assertEquals("vaibhav",maximumString);
    }

    @Test
    public void givenThreeStrings_WhenProper_MaximumShouldBeTrue_3() {
        maximum = new Maximum("VaibhaAAv","Vaibhav","Aaibhav");
        String maximumString = (String) maximum.testMaximum();
        Assert.assertEquals("Vaibhav",maximumString);
    }

    @Test
    public <E> void givenThreeGeneric_WhenProper_ShoulReturnMaximum() {
        maximum = new Maximum("Hello","232","r");
        E maxGeneric = (E) maximum.testMaximum();
        Assert.assertEquals("r",maxGeneric);
    }

}
