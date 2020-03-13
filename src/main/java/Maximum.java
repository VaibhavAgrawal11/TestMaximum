public class Maximum {

    public Integer maximumInteger (Integer[] maxInteger)
    {
        Integer maximum = 0;
        for(Integer i: maxInteger)
        {
            if(i.compareTo(maximum)>0)
                maximum=i;
        }
        return maximum;
    }
}
