package lowofdemeter;

public class LowOfDemeter {

    private SomeClass someClass;

    public void doSomething() {
        // Doing some stuff...
    }

    public void doesNotViolatesLoD(SomeClass2 someClass2) {

        // invocation of own method
        doSomething();

        // invocation of class member object method
        someClass.doSomething();

        // invocation of argument object method
        someClass2.doSomething();

        // invocation of local object method
        SomeClass3 someClass3 = new SomeClass3();
        someClass3.doSomething();

        // operation on owned object resource
        String listElement = someClass.getList().get(0);
    }

    public void lawOfDemeterViolation(SomeClass2 someClass2) {
        // ex1
        someClass2.getSomeClass3().doSomething();

        // ex2
        someClass2.getSomeClass3().getSomeClass().doSomething();
    }
}