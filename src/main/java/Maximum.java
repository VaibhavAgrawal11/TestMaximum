public class Maximum {

    public Integer maximumInteger (Integer[] maxInteger)
    {
        Integer maximum = 0;
        for(Integer integer: maxInteger)
        {
            if(integer.compareTo(maximum)>0)
                maximum=integer;
        }
        return maximum;
    }
    public Float maximumFloat (Float[] maxFloat)
    {
        Float maximum = 0.0f;
        for(Float floatValue: maxFloat)
        {
            if(floatValue.compareTo(maximum)>0)
                maximum=floatValue;
        }
        return maximum;
    }
}
