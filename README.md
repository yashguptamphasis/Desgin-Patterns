# Desgin-Patterns
Design patterns, code in java.
________________________________________________________________________________________________________________________________________
Factory Design pattern
_________________________

Here we create a classes implemented by a common interface and then the object is created by another Factory Class. We just pass the name to FactoryClass and it creates that obj and sends back accourdingly.
Object in Test class are called by Interface name.

eg. Interface   Battery
                  |
      Samsung            Sony             FactoryClass
                                                |
                                            TestClass
adv: 1) Loose coupling. Objects are created without hard coding using Factory Class just by passing name.
     2) If we want to add any more battery or remove can be done easyly without changin the hard Coding.
     
_________________________________________________________________________________________________________________________________________
Singleton Design

There will be only 1 object of a Class and that will be accessable throughout the application.

step 1 : For this make class with private const.
step 2 : Make Private and static object of that class inside that class
step 3 : write a getInstance public static methord which could be called from anywhere.

Types: 1. Early Init- The obj will be created while class loading.
       2. Late Init - The obj will be created when the class will be called.(Create in getInstance methord but 1st check weather already created).
       
use: 1) should be used when a resource is been accessed by entire app that means all should access by same single obj.

_________________________________________________________________________________________________________________________________________
    
