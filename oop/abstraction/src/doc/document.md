As per dictionary, **abstraction** is the quality of dealing with ideas rather than events. For example, when you consider the case of e-mail, complex details such as what happens as soon as you send an e-mail, the protocol your e-mail server uses are hidden from the user. Therefore, to send an e-mail you just need to type the content, mention the address of the receiver, and click send.

Likewise in Object-oriented programming, abstraction is a process of hiding the implementation details from the user, only the functionality will be provided to the user. In other words, the user will have the information on what the object does instead of how it does it.

In Java, abstraction is achieved using Abstract classes and interfaces.
#Abstract Class
A class which contains the abstract keyword in its declaration is known as abstract class.

Abstract classes may or may not contain abstract methods, i.e., methods without body ( public void get(); )
But, if a class has at least one abstract method, then the class must be declared abstract.
If a class is declared abstract, it cannot be instantiated.
To use an abstract class, you have to inherit it from another class, provide implementations to the abstract methods in it.
If you inherit an abstract class, you have to provide implementations to all the abstract methods in it.
#Abstract Methods
If you want a class to contain a particular method but you want the actual implementation of that method to be determined by child classes, you can declare the method in the parent class as an abstract.

abstract keyword is used to declare the method as abstract.
You have to place the abstract keyword before the method name in the method declaration.
An abstract method contains a method signature, but no method body.
Instead of curly braces, an abstract method will have a semoi colon (;) at the end.