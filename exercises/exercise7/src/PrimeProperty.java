public class PrimeProperty implements Property<Integer>{
    @Override
    public boolean meetProperty(Integer obj) {
        if (obj < 2) {
            return false;
        }
        for (int i = 2; i <= (int)Math.sqrt(obj); i++) {
            if (obj % i == 0) {
                return false;
            }
        }
        return true;
    }
}
