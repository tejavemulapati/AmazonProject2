package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void sum() {
	  int a = 10;
	  int b = 10;
	  Assert.assertEquals(20, a+b);
  }
  @Test
  public void Sub() {
	  int a = 30;
	  int b = 10;
	  Assert.assertEquals(20, a-b);
  }
  @Test
  public void Mul() {
	  int a = 10;
	  int b = 10;
	  Assert.assertEquals(100, a*b);
  }
  @Test
  public void Div() {
	  int a = 10;
	  int b = 10;
	  Assert.assertEquals(1	, a/b);
  }
}
