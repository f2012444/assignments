import java.util.HashMap;

public class Test {
    public static void main(String[] arg) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "The cannonball went over the target. Height at the target was 4.357150481812686");
        hm.put(2, "The distance cannot be calculated with this input");
        hm.put(3, "The cannonball hit the target!");
        hm.put(4, "The cannonball went under the target. Height at the target was 2.8631355334347828");
        hm.put(5, "The cannonball did not make it to the target");
        hm.put(6, "The cannonball did not reach the target");
        hm.put(7, "The distnace cannot be calculated with that input");
        hm.put(8, "The cannonball did not reach the target");
        hm.put(9, "The cannonball hit the target!");
        hm.put(10, "The cannonball went under the target. Height at the target was 3.5684434562686422");

        try {
            Assignment1 ass = new Assignment1();
            for (int i = 1; i <= 10; i++) {
                String[] args = new String[1];
                args[0] = System.getProperty("user.dir")  +"/src/" + "input" + i + ".txt";
                ass.main(args);
                //System.out.println();
                System.out.println(i + ":" + hm.get(i));
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
