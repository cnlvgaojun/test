package test.java;
public class Test {
    @Test
    public void testadd(){
        Calculator c = new Calculator();
        int result = c.add(3,2);
        System.out.println(result);
    }
}