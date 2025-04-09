import org.example.EX1;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class EX1Test {

    public EX1 Inicialize()
    {
        EX1 ex1 = new EX1();
       return ex1;
    }

    @Test
    public void Given_List_When_SizeUnder1_Then_ShouldReturnZero(){
        assertEquals(Inicialize().metodo1(new ArrayList<>(), 2), 0.00);
    }

    @Test
    public void Given_List_When_SizeItsGreaterThan60_Then_ShouldReturnZero(){
        ArrayList list = new ArrayList<>();
        for(int i = 0; i<61; i++){
            list.add(i);
        }
        assertEquals(Inicialize().metodo1(list, 2), 0.00);
    }

    @Test
    public void Given_List_When_SizeItsUnder6_Then_ShouldReturnZero(){
        ArrayList list = new ArrayList<>();
        for(int i = 0; i<6; i++){
            list.add(i);
        }
        assertEquals(Inicialize().metodo1(list, 2), 0.00);
    }

    @Test
    public void  Given_List_When_SizeItsGreaterThan15_Then_ShouldntReturnZero(){
        ArrayList list = new ArrayList<>();
        for(int i = 0; i<16; i++){
            list.add(i);
        }
        assertEquals(Inicialize().metodo1(list, 2), 0.00);
    }

    @Test
    public void  Given_List_When_SizeItsBetween6and15_Then_ShouldntReturnZero(){
        ArrayList list = new ArrayList<>();
        for(int i = 0; i<15; i++){
            list.add(i);
        }
        assertEquals(Inicialize().metodo1(list, 2), 0.00);
    }

    @Test
    public void  Given_List_When_SizeItsBetween1and60_Then_ShouldntReturnZero(){
        ArrayList list = new ArrayList<>();
        for(int i = 0; i<59; i++){
            list.add(i);
        }
        assertNotEquals(Inicialize().metodo1(list, 2), 0.00);
    }

    @Test
    public void  Given_List2_When_SizeItsEqual6_Then_ShouldntReturnZero(){
        ArrayList list2 = new ArrayList<>();
        for(int i = 0; i<6; i++){
            list2.add(i);
        }
        assertNotEquals(Inicialize().metodo1(list2, 2), 0.00);
    }
}
