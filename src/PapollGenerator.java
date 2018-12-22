public class PapollGenerator {

    public String getParoll(int size) {
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < size; i++) {
            int rnd = 0 + (int) (Math.random() * 20);
            b.append((char) (rnd + 'A'));
        }
            return b.toString();
    }
}
