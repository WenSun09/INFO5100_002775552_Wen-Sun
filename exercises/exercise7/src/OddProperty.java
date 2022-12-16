public class OddProperty implements Property<Integer>{
    @Override
    public boolean meetProperty(Integer obj) {
        return obj % 2 != 0;
    }
}
