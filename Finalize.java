
public class Finalize {
protected void finalize() throws Throwable
{
try {
System.out.println("inside demo's finalize()");
}
catch (Throwable e) {
throw e;
}
finally {
System.out.println("Calling finalize method"
+ " of the Object class");
// Calling finalize() of Object class
super.finalize();
}
}
}