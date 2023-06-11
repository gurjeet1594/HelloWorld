@Test
public void main() throws Exception{                
    PrintStream originalOut = System.out; // to have a way to undo the binding with your `ByteArrayOutputStream` 
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(bos));
    // action
    App.main(null);
    // assertion
    Assert.assertEquals("Hello world!", bos.toString());
    // undo the binding in System
    System.setOut(originalOut);
}
