import org.junit.Assert;
import org.junit.Test;
public class TestMaximum {
    Maximum maximum ;

    @Test
    public void givenThreeInteger_WhenProper_MaximumShouldBeTrue() {
        maximum = new Maximum();
        Integer[] array = {1,2,3};
        Integer maximumInteger = maximum.maximumGeneric(array);
        Assert.assertEquals(3,(int)maximumInteger);
    }

    @Test
    public void givenThreeInteger_WhenProper_MaximumShouldBeTrue_2() {
        maximum = new Maximum();
        Integer[] array = {2,2,1};
        Integer maximumInteger = maximum.maximumGeneric(array);
        Assert.assertEquals(2,(int)maximumInteger);
    }

    @Test
    public void givenThreeFloat_WhenProper_MaximumShouldBeTrue() {
        maximum = new Maximum();
        Float[] array = {1.2f,22.3f,33f};
        Float maximumFloat = maximum.maximumGeneric(array);
        Assert.assertEquals((Float)33f,maximumFloat);
    }

    @Test
    public void givenThreeFloat_WhenProper_MaximumShouldBeTrue_2() {
        maximum = new Maximum();
        Float[] array = {1.2f,22.3f,22.4f};
        Float maximumFloat = maximum.maximumGeneric(array);
        Assert.assertEquals((Float)22.4f,maximumFloat);
    }

    @Test
    public void givenThreeStrings_WhenProper_MaximumShouldBeTrue() {
        maximum = new Maximum();
        String[] array = {"Vaibhav","Aish","YoYo"};
        String maximumString = maximum.maximumGeneric(array);
        Assert.assertEquals("YoYo",maximumString);
    }

}
