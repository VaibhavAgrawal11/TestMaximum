public class Maximum {
    public <E extends Comparable> E maximumGeneric (E[] maxString)
    {
        E maximum=maxString[0];
        for(E index: maxString)
        {
            if(index.compareTo(maximum)>0)
                maximum=index;
        }
        return maximum;
    }
}
