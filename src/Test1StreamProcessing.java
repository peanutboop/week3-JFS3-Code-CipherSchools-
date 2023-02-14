import java.util.List;
import java.util.Arrays;

class Program {
    static void Converter(int arg) {
        System.out.println(Math.abs(arg));
    }

    void doAction() {
        List<Integer> nums = Arrays.asList(5, -3, 6, 7, 8, -9, 2);
        nums.forEach(Program::Converter);
    }
}

    public class Test1StreamProcessing {
        public static void main(String[] args) {
            Program obj = new Program();
            obj.doAction();

        }
    }

