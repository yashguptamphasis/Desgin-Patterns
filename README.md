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
    
