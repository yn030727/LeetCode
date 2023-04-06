import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LanQiao3 {


    public static void main(String[] args) {
        List<NUM> list = new ArrayList<>();
        list.add(new NUM(1,3));
        NUM number = new NUM(1,3);
        if(list.contains(number)){
            System.out.println("niubi");
        }
    }


    static class NUM{
        int x;
        int y;
        public NUM(int x , int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            NUM num = (NUM) o;
            return x == num.x && y == num.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}

