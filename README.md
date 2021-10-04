# Calculator

Desirable Characteristics of a Design that tried to enhance by ths project :

● Minimal complexity
  Make “simple” and “easy-to-understand” designs.
  
● Ease of maintenance

● Loose coupling
  Loose coupling means designing so that it holds connections among different parts of a program to a minimum.
  
● Extensibility
  Ehance a system without causing violence to the underlying structure which facilitate to change a piece of a system without affecting other pieces.
  
● Reusability
  Reusability means designing the system so that it is possible to reuse pieces of it in other systems.

● Portability
  Designing the system so that easily move it to another environment


●SOLID principles 
  The SOLID principles tells how to arrange our functions and data structures into classes, and howthose classes should be interconnected

01)Single responsibility principle - SRP
	 A class should have only a single responsibility.
	 A class should have only one reason to change.


02)Open/closed principle
	Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.
	Such an entity can allow its behaviour to be extended without modifying its source code.

03)Liskov substitution principle
	objects in a program should be replaceable with instances of their subtypes without altering the correctness of that program.

04)Interface segregation principle (ISP)
	Many client-specific interfaces are better than one general-purpose interface.

05)Dependency inversion principle (DIP)
	The Dependency Inversion Principle (DIP) tells us that the most flexible systems are those in which source code dependencies refer only to abstractions, not to concretions.
	In a statically typed language, like Java, this means that the use , import , and include statements should refer only to source modules containing interfaces, abstract       classes, or some other kind of abstract declaration.

●Cohesion
	Classes should have a small number of instance variables.
	Each of the methods of a class should manipulate one or more of those variables.
	n general the more variables a method manipulates the more cohesive that method is to its class.
	A class in which each variable is used by each method is maximally cohesive.

●Classes to Avoid
	Avoid creating god classes - Avoid creating omniscient classes that are all-knowing and all-powerful. Ask whether that functionality might better be organized into those       other classes rather than into the god class. Ex: Util classes, Manager classes
	Avoid classes named after verbs - A class that has only behavior but no data is generally not really a class. Consider turning a class like DatabaseInitialization() or         StringBuilder() into a routine on some other class.


●Simple rules for creating good names
The main concepts of naming were,
	use intention-revealing names  
	avoid disinformation 
	using pronounceable names
	use solution domain names and  problem domain names in suitabe suituations 
