# OCP Exam Preparation.

## Contents at a Glance.
* [Oracle Documentations](#oracle-documentations)
* [About](#about)
* [Enum](#enum)
* [InstanceOf](#instanceof)
* [Nested Class](#nested-class)
* [Methods from Object Class](#methods-from-object-class)
* [Imports](#imports)
* [Casting Values](#casting-values)
* [Java Inheritance](#java-inheritance)
* [Polymorphism](#polymorphism)
* [Referenceable Objects and References](#referenceable-objects-and-references)
* [Design Principles](#design-principles)
* [Design Pattern](#design-pattern)
* [Functional Interface](#functional-interface)
* [Lambda Expression](#lambda-expression)
* [Method Reference](#method-reference)
* [Generics](#generics)
* [Collections](#collections)
* [Array](#array)
* [Arrays](#arrays)
* [Stream API](#stream-api)
* [Help](#help)
* [License](#license)

## Oracle Documentations.
* [Exam Java SE 8 Programmer II](https://education.oracle.com/java-se-8-programmer-ii/pexam_1Z0-809)
* [Java® Language Specification. Java SE 8 Edition](https://docs.oracle.com/javase/specs/jls/se8/html/index.html)
* [Java Platform, Standard Edition (Java SE) 8](https://docs.oracle.com/javase/8/)
* [Java™ Platform, Standard Edition 8 API Specification](https://docs.oracle.com/javase/8/docs/api/)




## About.
* This project created for educational purposes, and this project may contain invalid or false "Information or Cod Examples". <br/> 
* Always check the "Information or Cod Examples" you are learning. <br/>










> ## Enum.
>
>> ### Initialization.
>> * [1.](src/main/java/com/trl/theoreticalKnowledge/_enum/initialization/a/a1/Example.java)
>
>> ### Semicolon.
>> * [1.](src/main/java/com/trl/theoreticalKnowledge/_enum/semicolon/a/a1/Example.java)
>> * [2.](src/main/java/com/trl/theoreticalKnowledge/_enum/semicolon/b/b2/Example.java)
>> * [3.](src/main/java/com/trl/theoreticalKnowledge/_enum/semicolon/b/b1/Example.java)
>
>> ### Constructor.
>>
>>> #### Access Modifier.
>>> * [Enum constructor must have access modifier private or package.](src/main/java/com/trl/theoreticalKnowledge/_enum/enumConstructor/a/a1/Example.java)
> 
>> ### Inheritance.
>> * [Inheritance not allowed for "Enum". It is only allowed to implement the interface.](src/main/java/com/trl/theoreticalKnowledge/_enum/inheritance/a/a1/Example.java)
>
>> ### Using "Switch" with "Enum".
>> * [Work with "Enum" and with "Switch".](src/main/java/com/trl/theoreticalKnowledge/_enum/enumSwitch/a/a1/Example.java)
>
>> ### Values.
>> * [Values of Enum.](src/main/java/com/trl/theoreticalKnowledge/_enum/values/a/a1/Example.java)
>>
>>> #### Constructors.
>>
>>> #### Methods.
>>>> ##### Access Modifier.
>>>
>>>> ##### Abstract.
>>>> * [Implementation abstract method in each "Enum Value".](src/main/java/com/trl/theoreticalKnowledge/_enum/values/methods/_abstract/a/a1/Example.java)
>>>> * [Each and every "Enum Value", required to implement this abstract method.](src/main/java/com/trl/theoreticalKnowledge/_enum/values/methods/_abstract/a/a2/Example.java)
>>>> * [If "Enum Value", have implemented method, "Enum" required to have defined this abstract method, so that later this method could be called.](src/main/java/com/trl/theoreticalKnowledge/_enum/values/methods/_abstract/a/a3/Example.java)
>>>> * [Is allowed implementation many abstract method in "Enum Values".](src/main/java/com/trl/theoreticalKnowledge/_enum/values/methods/_abstract/a/a4/Example.java)
>>>
>>>> ##### Non-static.
>>>> * [Implementation this method in each "Enum Value".](src/main/java/com/trl/theoreticalKnowledge/_enum/values/methods/a/a1/Example.java)
>>>> * [Is not mandatory implementing methods in every "Enum Values".](src/main/java/com/trl/theoreticalKnowledge/_enum/values/methods/a/a2/Example.java)
>>>> * [If "Enum Value", have implemented method, "Enum" required to have defined this method, so that later this method could be called.](src/main/java/com/trl/theoreticalKnowledge/_enum/values/methods/a/a3/Example.java)
>>>> * [Is allowed implementing many methods in "Enum Values".](src/main/java/com/trl/theoreticalKnowledge/_enum/values/methods/a/a4/Example.java)
>>>
>>>> ##### Static.
>>>
>>>> ##### Final.
>>
>>> #### Variables.
>>>
>>>> #### Access Modifier.
>>>
>>>> #### Non-static.
>>>
>>>> #### Static
>>>
>>>> #### Final
>
>> ### Methods.
>>> #### Pre-defined Methods.
>>> * [Work with "Enum" method "valueOf".](src/main/java/com/trl/theoreticalKnowledge/_enum/methodsOfEnum/valueOf/a/a1/Example.java)
>>> * [Work with "Enum" method "values".](src/main/java/com/trl/theoreticalKnowledge/_enum/methodsOfEnum/values/a/a1/Example.java)
>>> * [Work with "Enum" method "ordinal".](src/main/java/com/trl/theoreticalKnowledge/_enum/methodsOfEnum/ordinal/a/a1/Example.java)
>>
>>> #### Access Modifier.
>>
>>> #### Abstract
>>
>>> #### Non-static.
>>
>>> #### Static
>>> * [Is allowed definition many static methods in "Enum".](src/main/java/com/trl/theoreticalKnowledge/_enum/methods/_static/a/a1/Example.java)
>>> * [Is not allowed implementing static methods in "Enum" values.](src/main/java/com/trl/theoreticalKnowledge/_enum/methods/_static/b/b1/Example.java)
>>
>>> #### Final
>
>> ### Variables.
>>
>>> #### Access Modifier.
>>
>>> #### Non-static.
>>
>>> #### Static
>>
>>> #### Final
>
>> ### Note to self.










> ## Nested Class.
> * Exist two types of classes: top-level class, Nested Class. <br/>
> * Nested Class divided into two types: "Static Nested Class" and "Inner Class". <br/>
> * Sywchestvyet "Anonymous class". "Anonymous class" siempre is "Nested Class" no potom stanovitca libo "Static Nested Class" libo "Inner Class". <br/>
> * "Nested Class" may have "access modifier": private, default, protected, public. <br/>
>
>> ### Static Nested Class.
>>
>>> #### Type of Static Nested Class
>>> * Exist four types of Static Nested Class: interface, abstract class, class, enum. <br/>
>>
>>> ### Inheritance.
>>
>>> #### Initialization of "Static Nested Class".
>>> * [1.](src/main/java/com/trl/theoreticalKnowledge/nestedClass/staticNestedClass/inicialization/a1/Example.java)
>>> * [2.](src/main/java/com/trl/theoreticalKnowledge/nestedClass/staticNestedClass/inicialization/b/b1/Example.java)
>>
>>> #### Access Modifier of "Static Nested Class".
>>
>>> #### Constructors.
>>> 
>>>> ##### Access Modifier.
>>
>>> #### Variables.
>>>
>>>> ##### Access Modifier.
>>> 
>>>> ##### Non-static.
>>>> * Non-static variables from "top-level class" cannot be used in the "static nested class". <br/>
>>>
>>>> ##### Static.
>>>> * Static variables from "top-level class" can be used in the "static nested class". <br/>
>>> 
>>>> ##### Final.
>>
>>> #### Methods.
>>>
>>>> ##### Access Modifier.
>>>
>>>> ##### Abstract.
>>>
>>>> ##### Non-static.
>>>> * Not allowed definition "static nested class" in the method body. <br/>
>>>
>>>> ##### Static.
>>>> * Not allowed definition "static nested class" in the static method body. <br/>
>>> 
>>>> ##### Final.
>>
>>> #### Note to self.
>>> * [Null Reference.]()
>>
>
>> ### Local Static Nested Class.
>> * [The definition for the "Local Static Nested Class" is not allowed.](src/main/java/com/trl/theoreticalKnowledge/nestedClass/staticNestedClass/localStaticNestedClass/a/a1/Example.java)
>
>> ### Inner Class.
>> * The "Inner Class" has a subtype that name is "Local Inner Class". <br/>
>> * Ekzempliar "Inner Class" vsehda dolzen sodirzat ssulky na "top-level class". <br/>
>> * Esli sozdaietsa "top-level class" eto ne znachit chto proisxodit sozdanie "Inner Class". <br/>
>> * Esli sozdaietsa "Inner Class" to obiazan sywchestvovat ekzempliar "top-level class". I "Inner Class" bydet ssulatsa na "top-level class". <br/>
>> * Raznue "Inner Class" mohut ssulatsa na odin i totze "top-level class". <br/>
>> * "Inner Class" mozet bit obiavlion v methode. No znachenie kotoroe vozvrawchaet ethot method ne mozet bit tipos etoho "Inner Class". 
>>   "Inner Class" kotorui obiavlaetsa v nytri methoda, ne viden za figurnumi scobcami etoho methoda.
>>   Znachenie cotoroe vozvrawchaet method mozet bit "Object type" i takim sposobom mozno vozvrawcaht "Inner Class" kororui opredelon v methode.
>> * java memory leak. "Inner Class" mozet sprovocurovat "java memory leak". Do toho vremeni kohda ziv "Inner Class" bydet ziv "top-level calss",
>>   "Garbage Collector" ne smozet ydalit "top-level class". <br/>
>>
>>> #### Type of Inner Class
>>> * Exist four types of Inner Class: interface, abstract class, class, enum. <br/>
>>
>>> ### Inheritance.
>>
>>> #### Initialization of "Inner Class".
>>> * [1.](src/main/java/com/trl/theoreticalKnowledge/nestedClass/innerClass/initialization/a/a1/Example.java)
>>> * [2.](src/main/java/com/trl/theoreticalKnowledge/nestedClass/innerClass/initialization/c/c1/Example.java)
>>
>>> #### Access Modifier of "Inner Class".
>>> * [If "Inner Class" have "access modifier" private, then this "Inner Class" may have methods with any "access modifier".](src/main/java/com/trl/theoreticalKnowledge/nestedClass/innerClass/accessModifierOfInnerClass/a/a1/Example.java)
>>> * [If "Inner Class" have "access modifier" private, then this "Inner Class" may have variables with any "access modifier".](src/main/java/com/trl/theoreticalKnowledge/nestedClass/innerClass/accessModifierOfInnerClass/b/b1/Example.java)
>>
>>> #### Constructors.
>>> 
>>>> ##### Access Modifier.
>>
>>> #### Variables.
>>>
>>>> ##### Access Modifier.
>>> 
>>>> ##### Non-static.
>>>> * [Non-static variables from top-level class can be used in the inner class.](src/main/java/com/trl/theoreticalKnowledge/nestedClass/innerClass/variables/a/a1/Example.java)
>>>> * [Non-static variables can be use in "Inner Class".](src/main/java/com/trl/theoreticalKnowledge/nestedClass/innerClass/variables/c/c1/Example.java)
>>>
>>>> ##### Static.
>>>> * [Static variables from top-level class can be used in the inner class.](src/main/java/com/trl/theoreticalKnowledge/nestedClass/innerClass/variables/static_variable/a/a1/Example.java)
>>>> * [Static variables is not allowed define in "Inner Class".](src/main/java/com/trl/theoreticalKnowledge/nestedClass/innerClass/variables/static_variable/b/b1/Example.java)
>>> 
>>>> ##### Final.
>>
>>> #### Methods.
>>>
>>>> ##### Access Modifier.
>>>
>>>> ##### Abstract.
>>>
>>>> ##### Non-static.
>>>> * [Non-static methods from top-level class can be used in the inner class.]()
>>>> * [Non-static methods can be used in the "Inner Class".]()
>>>
>>>> ##### Static.
>>>> * [Static methods from top-level class can be used in the inner class.]()
>>>> * [Static methods is not allow use in "Inner Class".]()
>>> 
>>>> ##### Final.
>>
>>> #### Note to self.
>>> * [Null Reference.]()
>>
>
>> ### Local Inner Class.
>> * [The definition for the "Local Inner Class".](src/main/java/com/trl/theoreticalKnowledge/nestedClass/innerClass/localInnerClass/a/a1/Example.java)
>> * [Local Inner Class can't have an access modifier.](src/main/java/com/trl/theoreticalKnowledge/nestedClass/innerClass/localInnerClass/accessModifier/a/a1/Example.java)
>> * [Local Inner Class can't be declared static.](src/main/java/com/trl/theoreticalKnowledge/nestedClass/innerClass/localInnerClass/_static/a/a1/Example.java)
>> * [Local Inner Class have access to local variables without access modifier and final local variables of the method.](src/main/java/com/trl/theoreticalKnowledge/nestedClass/innerClass/localInnerClass/variables/localVariables/a/a1/Example.java)
>>
>>> #### Type of Local Inner Class
>>
>>
>>> ### Inheritance.
>>
>>> #### Access Modifier of "Local Inner Class".
>>
>>> #### Constructors.
>>> 
>>>> ##### Access Modifier.
>>
>>> #### Variables.
>>> * [Local Inner Class have access to all variables of the outer class.](src/main/java/com/trl/theoreticalKnowledge/nestedClass/innerClass/localInnerClass/variables/a/a1/Example.java)
>>>
>>>> ##### Access Modifier.
>>> 
>>>> ##### Non-static.
>>>
>>>> ##### Static.
>>>> * [Local Inner Class can't have an variables static.](src/main/java/com/trl/theoreticalKnowledge/nestedClass/innerClass/localInnerClass/_static/variables/a/a1/Example.java)
>>> 
>>>> ##### Final.
>>
>>> #### Methods.
>>> * [Local Inner Class have access to all methods of the outer class.](src/main/java/com/trl/theoreticalKnowledge/nestedClass/innerClass/localInnerClass/methods/a/a1/Example.java)
>>>
>>>> ##### Access Modifier.
>>>
>>>> ##### Abstract.
>>>
>>>> ##### Non-static.
>>>
>>>> ##### Static.
>>>> * [Local Inner Class can't have an methods static.](src/main/java/com/trl/theoreticalKnowledge/nestedClass/innerClass/localInnerClass/_static/methods/a/a1/Example.java)
>>> 
>>>> ##### Final.
>>
>>> #### Note to self.
>>
>






### Anonymous Class.
* [If type of an "Anonymous Class" is "Abstract Class". And this "Abstract Class" have "abstract methods", all "abstract 
   methods" from this "Abstract Class" is mandatory must be defined.](src/main/java/com/trl/theoreticalKnowledge/nestedClass/anonymousClasses/_abstract/a/a1/Example.java)
* [If type of an "Anonymous Class" is "Interface". And this "Interface" have "abstract methods", all "abstract method" 
   from this "Interface" is mandatory must be defined.](src/main/java/com/trl/theoreticalKnowledge/nestedClass/anonymousClasses/_interface/a/a1/Example.java)
* [Type of an "Anonymous Class" is "Static Nested Class".](src/main/java/com/trl/theoreticalKnowledge/nestedClass/anonymousClasses/staticNestedClass/a/a1/Example.java)
* [Type of an "Anonymous Class" is "Inner Class".](src/main/java/com/trl/theoreticalKnowledge/nestedClass/anonymousClasses/innerClass/a/a1/Example.java)

#### Initialization. 
* [Initialization of "Anonymous Class".](src/main/java/com/trl/theoreticalKnowledge/nestedClass/anonymousClasses/initialization/a/a1/Example.java)

#### Final Class.
* [An type of an "Anonymous Class" cannot be final.](src/main/java/com/trl/theoreticalKnowledge/nestedClass/anonymousClasses/_final/a/a1/Example.java)

#### Methods.
* [If some type of an "Anonymous Class" have "final method" and you want implement this "final method", that will be impossible. 
   It is not allowed to redefine final methods.](src/main/java/com/trl/theoreticalKnowledge/nestedClass/anonymousClasses/methods/_final/a/a1/Example.java)   
* [If some type of an "Anonymous Class" have "static method" and you want implement this "static method", that will be impossible. 
   It is not allowed to redefine static methods.](src/main/java/com/trl/theoreticalKnowledge/nestedClass/anonymousClasses/methods/_static/a/a1/Example.java)
* [Private methods are not allowed to redefine. Methods of access modifier: public, protected, package is allowed redefine, 
   considering the relationship policy of "Access Modifiers".](src/main/java/com/trl/theoreticalKnowledge/nestedClass/anonymousClasses/methods/accessModifier/a/a1/Example.java)

#### Variables.
* [Access to variables of an "Anonymous Class".](src/main/java/com/trl/theoreticalKnowledge/nestedClass/anonymousClasses/variables/a/a1/Example.java)
* [Access to variables of an "Anonymous Class" using "this".](src/main/java/com/trl/theoreticalKnowledge/nestedClass/anonymousClasses/variables/_this/a/a1/Example.java)
* [Access to final variables of an "Anonymous Class".](src/main/java/com/trl/theoreticalKnowledge/nestedClass/anonymousClasses/variables/_this/a/a1/Example.java)
* [The final variables from the "Anonymous Class" cannot be changed.](src/main/java/com/trl/theoreticalKnowledge/nestedClass/anonymousClasses/variables/_final/b/b1/Example.java)
* [Access to static variables of an "Anonymous Class".](src/main/java/com/trl/theoreticalKnowledge/nestedClass/anonymousClasses/variables/_static/a/a1/Example.java)
* [The final variables from the "Anonymous Class" can be changed.](src/main/java/com/trl/theoreticalKnowledge/nestedClass/anonymousClasses/variables/_static/b/b1/Example.java)
* [Private variables are not allowed to redefine. Variables of access modifier: public, protected, package is allowed redefine, 
   considering the relationship policy of "Access Modifiers".](src/main/java/com/trl/theoreticalKnowledge/nestedClass/anonymousClasses/variables/accessModifier/a/a1/Example.java)











> ## Methods from Object class.
>
>> ### equals.
>> * [Difference between "getClass()" and "instanceof"](src/main/java/com/trl/theoreticalKnowledge/objectMethods/equals/a/a2/Example.java)
>> * [Difference between "getClass()" and "instanceof"](src/main/java/com/trl/theoreticalKnowledge/objectMethods/equals/a/a1/Example.java)
>
>> ### hashCode.
>
>> ### toString.
>
>> ### getClass.
>> * [1.](src/main/java/com/trl/theoreticalKnowledge/objectMethods/getClass/a/a1/Example.java)
>
>> ### clone.









## Imports.
### Static Import.
* [Example of correct definition of "Static Import".](src/main/java/com/trl/theoreticalKnowledge/_imports/_static/Example.java)










## Casting Values.
* [If casting operation is incorrect while be throw "Runtime Exception".](src/main/java/com/trl/theoreticalKnowledge/castingValues/a/a1/Example.java)
* Here are some basic rules to keep in mind when casting variables: <br/>
    * [Casting an object from a subclass to a superclass doesn’t require an explicit cast.](src/main/java/com/trl/theoreticalKnowledge/castingValues/b/b1/Example.java) <br/>
    * [Casting an object from a superclass to a subclass requires an explicit cast.](src/main/java/com/trl/theoreticalKnowledge/castingValues/c/c1/Example.java) <br/>
    * [The compiler will not allow casts to unrelated types.](src/main/java/com/trl/theoreticalKnowledge/castingValues/d/d1/Example.java) <br/>
    * [Even when the code compiles without issue, an exception may be thrown at runtime if
        the object being cast is not actually an instance of that class.](src/main/java/com/trl/theoreticalKnowledge/castingValues/e/e1/Example.java)
### Explicit Cast.
### Without an Explicit Cast.










> ## Java Inheritance.
>  * Virtual Methods in object-oriented programming, a virtual function or virtual method is a function or method 
>    whose behaviour can be overridden within an inheriting class by a function with the same signature to provide 
>    the polymorphic behavior.
>
>> ### Class.
>> * ["Class" can only be "extend" from one "class" or one "abstract class".]()
>> * ["Class" can be "implement" may "interfaces".]()
>> * [If the "Class is final", other class cannot be inherited from it.](src/main/java/com/trl/theoreticalKnowledge/inheritance/_class/_final/a/a1/Example.java)
>>
>>> #### Constructor.
>>>> ##### Access Modifier.
>>>> * [If class have only defined "private constructor", other class cannot be inherited from it. By marking the 
>>>>    constructors private, we have implicitly marked the class final. ](src/main/java/com/trl/theoreticalKnowledge/inheritance/_class/constructor/accessModifier/a/a1/Example.java)
>>
>>> #### Variables.
>>> * [Class variables are not inherited.](src/main/java/com/trl/theoreticalKnowledge/inheritance/variable/a/a1/Example.java)
>>
>>> #### Methods. In other words "Overriding".
>>> * [Method Inheritance.](src/main/java/com/trl/theoreticalKnowledge/override/a/a1/Example.java)
>>>
>>>> ##### Access Modifiers.
>>>
>>>> ##### Abstract Methods.
>>>
>>>> ##### Final Methods.
>>>
>>>> ##### Non-static Methods.
>>>
>>>> ##### Static Methods.
>
>> ### Interface.
>> * ["Interface" can be "extend" from many others "interfaces".](src/main/java/com/trl/theoreticalKnowledge/inheritance/_interface/b/b1/Example.java)
>> * ["Interface" cannot be "extend" from "class" or "abstract class".](src/main/java/com/trl/theoreticalKnowledge/inheritance/_interface/b/b2/Example.java)
>> * ["Marker Interface" - this is an "interface" that has no methods.]()
>> * [Interfaces cannot extend classes, nor can classes extend interfaces.]()
>> * [Interfaces may also not be marked final or instantiated directly.]()
>> * [ There are additional rules for default methods, such as Java failing to compile if a class or interface inherits 
>>     two default methods with the same signature and doesn’t provide its own implementation.]()
>>
>>> #### Variables.
>>> * [The compiler automatically adds "public static final" to all interface variables, if the developer does not provide them.]()
>>> * [Only "public static final" variables are allowed define in the "Interface". All variables from "Interface" is "public static final".]()
>>>
>>>> ##### Access Modifier. 
>>>> * [Only "public" variables are allowed define in the "Interface". All variables from "Interface" have "public access modifier".](src/main/java/com/trl/theoreticalKnowledge/inheritance/_interface/variables/accessModifier/a/a1/Example.java) 
>>>
>>>> ##### Static. 
>>>> * [Only "static" variables are allowed define in the "Interface". All variables from "Interface" is "static".]()
>>>
>>>> ##### Final. 
>>>> * [Only "final" variables are allowed define in the "Interface". All variables from "Interface" is "final".]()
>>
>>> #### Methods. In other words "Overriding".
>>> * [The compiler automatically adds "public abstract" to all non‐static and non‐default methods, if the developer does not provide them.]()
>>>
>>>> ##### Access Modifiers.
>>>> * [Only public methods can be defined in a interface.]()
>>>
>>>> ##### Abstract Methods.
>>>
>>>> ##### Default Methods.
>>>
>>>> ##### Static Methods.
>
>> ### Abstract Class.
>> * ["Abstract Class" can only be "extend" from one "class" or one "abstract class".]()
>> * ["Abstract Class" can be "implement" many "interfaces".]()
>>
>>> #### Variables.
>>
>>> #### Methods. In other words "Overriding".
>>>
>>>> ##### Access Modifiers.
>>>
>>>> ##### Abstract Methods.
>>>
>>>> ##### Final Methods.
>>>
>>>> ##### Non-static Methods.
>>>
>>>> ##### Static Methods.
>









## Polymorphism.
* The dictionary definition of polymorphism refers to a principle in biology in which an organism or species can have 
  many different forms or stages. This principle can also be applied to object-oriented programming and languages like 
  the Java language. Subclasses of a class can define their own unique behaviors and yet share some of the same 
  functionality of the parent class. <br/>
* Polymorphism is the ability of a single interface to support multiple underlying forms. In Java, this allows multiple 
  types of objects to be passed to a single method or class.  In Java, this allows multiple types of objects to be 
  passed to a single method or class. <br/>
* Types of Polymorphism: <br/>
    * Inheritance. <br/>
    * Generics. <br/>
    * <br/>
    * <br/>










## Referenceable Objects and References.
* We can summarize this principle with the following two rules: <br/>
   * The type of the object determines which properties exist within the object in memory. <br/>
   * The type of the reference to the object determines which methods and variables are accessible to the Java program. <br/>
* An object is an instance of a class created from it using the new keyword. <br/>
* Classes, interfaces, arrays, enumerations and, annotations are the in Java are reference types in Java. Reference 
  variables hold the objects/values of reference types in Java. <br/>










## InstanceOf.
* [Example of "InstanceOf".](src/main/java/com/trl/theoreticalKnowledge/instanceOf/a/a1/Example.java)
* [Example of "null instanceOf someValue".](src/main/java/com/trl/theoreticalKnowledge/instanceOf/_null/a/a1/Example.java)










> ## Design Principles.
> * A design principle is an established idea or best practice that facilitates the software design process. <br/>
> * In general, following good design principles leads to:
>      * More logical code
>      * Code that is easier to understand
>      * Classes that are easier to reuse in other relationships and applications
>      * Code that is easier to maintain and that adapts more readily to changes in the application requirements 
>
>> ### Encapsulating Data.
>> * [Incorrect definition of "Encapsulation Data".](src/main/java/com/trl/theoreticalKnowledge/designPrinciples/encapsulationData/a/a1/Example.java)
>> * [Correct definition of "Encapsulation Data".](src/main/java/com/trl/theoreticalKnowledge/designPrinciples/encapsulationData/b/b1/Example.java)
>
>> ### Creating JavaBeans.
>> * [JavaBeans Spec URL](https://www.oracle.com/technetwork/java/javase/documentation/spec-136004.html)
>> * JavaBean naming conventions: <br/>
>>       1. Properties are private. <br/>
>>       2. A public no-argument constructor. <br/>
>>       3. Getter for non‐boolean properties begins with "get". <br/>
>>       4. Getters for boolean properties must begin with "is". <br/>
>>       5. Getters for Boolean properties must begin with "get". <br/>
>>       6. Setter methods begin with "set". <br/>
>>       7. The method name must have a prefix of "set", "get", "is" followed by the first letter of the property in 
>>          uppercase and followed by the rest of the property name. <br/>
>>       8. Implements Serializable. <br/>
>>     
>> * Although boolean values use "is" to start their getter method, the same does not apply to instances of the 
>>   wrapper Boolean class, which use "get". <br/>
>> * [Example of Java Bean.](src/main/java/com/trl/theoreticalKnowledge/designPrinciples/creacionJavaBean/a/a1/Example.java)
>
>> ### Is‐a Relationship.
>
>> ### Has‐a Relationship.
>>
>>> #### Composing Objects.
>>>
>>>> ##### Delegation.
>










> ## Design Pattern.
> * A design pattern is an established general solution to a commonly occurring software development problem. 
>   The purpose of a design pattern is to leverage the wealth of knowledge of developers who have come before you in 
>   order to solve old problems that you may encounter easily. It also gives developers a common vocabulary in which 
>   they can discuss common problems and solutions.
>
>> ### Singleton Pattern. 
>>
>>> #### Lazy Initialization.
>>
>>> #### Thread Safe.
>>
>>> #### Singleton and Class Loader.
>
>>  ### Immutable Objects. 
>>  1. Use a constructor to set all properties of the object. <br/>
>>  2. Mark all of the instance variables private and final. <br/>
>>  3. Don’t define any setter methods. <br/>
>>  4. Don’t allow referenced mutable objects to be modified or accessed directly. <br/>
>>  5. Prevent methods from being overridden. <br/>
>
>> ###  Builder Pattern.
>
>>  ### Factory Pattern.
>>
>>>  #### Factory Method Pattern.
>














## Functional Interface.
* ["Functional Interface" as an "Interface" that contains a single "Abstract Method". Bat may have defined "Default Method" or 
   "Static Method". Or may have defined both methods at the same time.](src/main/java/com/trl/theoreticalKnowledge/functionalInterface/a/a1/Example.java)










> ## Lambda Expression.
>
>> ### Parameters of Lambda.
>> * [The parentheses can be omitted in a lambda expression if there is exactly one input parameter and the type is not 
>>    explicitly stated in the expression. This means that expressions that have zero or more than one input parameter will 
>>    still require parentheses. ]()
>> * [Pass one parameter to "Lambda Expression".](src/main/java/com/trl/theoreticalKnowledge/lambda/parameters/a/a1/Example.java)
>> * [Pass two or many parameters to "Lambda Expression".](src/main/java/com/trl/theoreticalKnowledge/lambda/parameters/a/a2/Example.java)
>
>> ### Body of Lambda.
>> * [Semicolon.](src/main/java/com/trl/theoreticalKnowledge/lambda/body/semicolon/a/a1/Example.java)
>> * [Return Value.](src/main/java/com/trl/theoreticalKnowledge/lambda/body/returnValue/a/a1/Example.java)
>> * [Since Java doesn’t allow us to re-declare a local variable.](src/main/java/com/trl/theoreticalKnowledge/lambda/body/a/a1/Example.java)
>










## Method Reference.










> ## Generics.
> * [Oracle Java Documentation. The Java Generic Tutorials.](https://docs.oracle.com/javase/tutorial/java/generics/index.html)
> * [Covariant, Contravariance, Invariance.]()
> * [Oracle Java Documentation. Lower Bounded Wildcards.](https://docs.oracle.com/javase/tutorial/java/generics/lowerBounded.html)
> * [Oracle Java Documentation. Upper Bounded Wildcards.](https://docs.oracle.com/javase/tutorial/java/generics/upperBounded.html)
> * [1.](src/main/java/com/trl/theoreticalKnowledge/generics/a/a1/Example.java)
>
>> ### Unbounded wildcard.
>> * [Initialization.](src/main/java/com/trl/theoreticalKnowledge/generics/unboundedWildcard/initialization/a/a1/Example.java)
>> * [Constructor.]()
>> * [Method Parameter.](src/main/java/com/trl/theoreticalKnowledge/generics/unboundedWildcard/methods/parameters/a/a1/Example.java)
>> * [Method Return Value.](src/main/java/com/trl/theoreticalKnowledge/generics/unboundedWildcard/methods/returnValue/a/a1/Example.java)
>> * [Definition Interface.](src/main/java/com/trl/theoreticalKnowledge/generics/unboundedWildcard/_interface/a/a1/Example.java)
>> * [Definition Abstract Class.](src/main/java/com/trl/theoreticalKnowledge/generics/unboundedWildcard/abstractClass/a/a1/Example.java)
>> * [Definition Class.](src/main/java/com/trl/theoreticalKnowledge/generics/unboundedWildcard/_class/a/a1/Example.java)
>> * [Definition Enum.](src/main/java/com/trl/theoreticalKnowledge/generics/unboundedWildcard/_enum/a/a1/Example.java)
>
>> ### Lower Bounded Wildcards.
>> * [Initialization.](src/main/java/com/trl/theoreticalKnowledge/generics/wildcardLowerBound/initialization/a/a1/Example.java)
>> * [Constructor.]()
>> * [? super OneType & OtherType.]()
>> * [Method Parameter.](src/main/java/com/trl/theoreticalKnowledge/generics/wildcardLowerBound/methods/parameters/a/a1/Example.java)
>> * [Method Return Value.](src/main/java/com/trl/theoreticalKnowledge/generics/wildcardLowerBound/methods/returnValue/a/a1/Example.java)
>> * [Definition Interface.](src/main/java/com/trl/theoreticalKnowledge/generics/wildcardLowerBound/_interface/a/a1/Example.java)
>> * [Definition Abstract Class.](src/main/java/com/trl/theoreticalKnowledge/generics/wildcardLowerBound/abstractClass/a/a1/Example.java)
>> * [Definition Class.](src/main/java/com/trl/theoreticalKnowledge/generics/wildcardLowerBound/_class/a/a1/Example.java)
>> * [Definition Enum.](src/main/java/com/trl/theoreticalKnowledge/generics/wildcardLowerBound/_enum/a/a1/Example.java)
>
>> ### Upper Bounded Wildcards.
>> * [Initialization.](src/main/java/com/trl/theoreticalKnowledge/generics/wildcardUpperBound/initialization/a/a1/Example.java)
>> * [Constructor.]()
>> * [? extends OneType & OtherType.]()
>> * [Method Parameter.](src/main/java/com/trl/theoreticalKnowledge/generics/wildcardUpperBound/methods/parameters/a/a1/Example.java)
>> * [Method Return Value.](src/main/java/com/trl/theoreticalKnowledge/generics/wildcardUpperBound/methods/returnValue/a/a1/Example.java)
>> * [Definition Interface.](src/main/java/com/trl/theoreticalKnowledge/generics/wildcardUpperBound/_interface/a/a1/Example.java)
>> * [Definition Abstract Class.](src/main/java/com/trl/theoreticalKnowledge/generics/wildcardUpperBound/abstractClass/a/a1/Example.java)
>> * [Definition Class.](src/main/java/com/trl/theoreticalKnowledge/generics/wildcardUpperBound/_class/a/a1/Example.java)
>> * [Definition Enum.](src/main/java/com/trl/theoreticalKnowledge/generics/wildcardUpperBound/_enum/a/a1/Example.java)
>
>> ### Generic Classes.
>
>> ### Generic Nested Classes.
>
>> ### Generic Abstract Class.
>
>> ### Generic Interface.
>
>> ### Generic Function Interface.
>
>> ### Generic Constructor.
>
>> ### Generic Methods.
>> * [1.](src/main/java/com/trl/theoreticalKnowledge/generics/method/a/a1/Example.java)
>> * [Type of Parameters.](src/main/java/com/trl/theoreticalKnowledge/generics/method/typeParameter/a/a1/Example.java)
>> * [Return Value.](src/main/java/com/trl/theoreticalKnowledge/generics/method/returnValue/a/a1/Example.java)
>










> ## Collections.
> * For any type of collections, the methods is very important: equals, hashCode, compare, compareTo.
>
>> ### Big O, Big Theta, Big Omega.
>>
>>> #### Big-O.
>> 
>>> #### Big-Theta.
>>
>>> #### Big-Omega.
>
>> ### Collections Utils Class.
>>> #### Methods.
>>> * [sort()](src/main/java/com/trl/theoreticalKnowledge/collections/collectionsMethods/sort/a/a1/Example.java) 
>>> 
>>> * [binarySearch()](src/main/java/com/trl/theoreticalKnowledge/collections/collectionsMethods/binarySearch/a/a1/Example.java)
>>> 
>
>> ### Iterable.
>
>> ### List.
>> * [A list is an ordered collection of elements that allows duplicate entries. Elements in a list can be accessed by an int index.]()
>>
>>> #### ArrayList.
>>>
>>>> ##### Constructor. 
>>>> * [ArrayList<>()](src/main/java/com/trl/theoreticalKnowledge/collections/list/arrayList/constructors/a/a1/Example.java) 
>>>> * [ArrayList<>(int initialCapacity)](src/main/java/com/trl/theoreticalKnowledge/collections/list/arrayList/constructors/b/b1/Example.java) 
>>>> * [ArrayList<>(java.util.Collection<? extends E> c)](src/main/java/com/trl/theoreticalKnowledge/collections/list/arrayList/constructors/c/c1/Example.java) 
>>>
>>>> ##### Methods. 
>>>>> ###### add
>>>>> * [boolean add (E element)](src/main/java/com/trl/theoreticalKnowledge/collections/list/arrayList/methods/add/a/a1/Example.java) 
>>>>> * [void add (int index, E element)](src/main/java/com/trl/theoreticalKnowledge/collections/list/arrayList/methods/add/b/b1/Example.java) 
>>>>
>>>>> ###### set
>>>>> * [E set (int index, E element)](src/main/java/com/trl/theoreticalKnowledge/collections/list/arrayList/methods/set/a/a1/Example.java)
>>>>
>>>>> ###### get
>>>>> * [E get (int index)](src/main/java/com/trl/theoreticalKnowledge/collections/list/arrayList/methods/get/a/a1/Example.java)
>>>>
>>>>> ###### remove
>>>>> * [E remove (int index)](src/main/java/com/trl/theoreticalKnowledge/collections/list/arrayList/methods/remove/a/a1/Example.java) 
>>>>> * [boolean remove(Object o)](src/main/java/com/trl/theoreticalKnowledge/collections/list/arrayList/methods/remove/b/b1/Example.java) 
>>>>
>>>>> ###### isEmpty
>>>>> * []()
>>>> 
>>>>> ###### size
>>>>> * []()
>>>>
>>>>> ###### clear
>>>>> * []()
>>>>
>>>>> ###### contains
>>>>> * [This method calls equals() on each element of the ArrayList to see if there are any matches.]()
>>>>> * []()
>>>>
>>>>> ###### indexOf
>>>>> * []()
>>>>
>>>>> ###### lastIndexOf
>>>>> * []()
>>>>
>>>>> ###### iterator
>>>>> * []()
>>>
>>>> ##### Initialization. 
>>
>>> #### LinkedList.
>>> * A LinkedList implements List and Queue. <br/>
>>
>>> #### Old Collections.
>>>> ##### Vector.
>>>
>>>> ##### Stack.
>>>>  * If you need a stack, use an ArrayDeque instead <br/>
>
>> ### Set.
>> * [A set is a collection that does not allow duplicate entries.]()
>>
>>> #### HashSet
>>> * A HashSet stores its elements in a hash table. This means that it uses the hashCode() method of the objects to retrieve them more efficiently. <br/>
>>> * The equals() method is used to determine equality. <br/> 
>>>
>>>> ##### Constructor. 
>>>> * [HashSet<>()]() 
>>>> * [HashSet<>(int initialCapacity)]() 
>>>> * [HashSet<>(java.util.Collection<? extends E> c)]() 
>>>> * [HashSet<>(int initialCapacity, float loadFactor)]() 
>>>
>>>> ##### Methods. 
>>>>> ###### add
>>>>> * [boolean add(E e)](src/main/java/com/trl/theoreticalKnowledge/collections/set/hashSet/add/a/a1/Example.java) 
>>>>
>>>>> ###### remove
>>>>> * [boolean remove(Object o)](src/main/java/com/trl/theoreticalKnowledge/collections/set/hashSet/remove/a/a1/Example.java) 
>>>>
>>>>> ###### isEmpty
>>>>> * []()
>>>> 
>>>>> ###### size
>>>>> * []()
>>>>
>>>>> ###### clear
>>>>> * []()
>>>>
>>>>> ###### contains
>>>>> * [This method calls equals() on each element of the HashSet to see if there are any matches.]()
>>>>> * []()
>>>
>>>> ##### Initialization. 
>>
>>> #### LinkedHashSet.
>>
>>> #### TreeSet.
>>> * A TreeSet stores its elements in a sorted tree structure. The main benefit is that the set is always in sorted order.
>>> * TreeSet implements the NavigableSet interface. And the interface NavigableSet implemented SortedSet. And the interface SortedSet implemented Set.
>>>
>>>> ##### Constructor. 
>>>> * [TreeSet<>()]() 
>>>> * [TreeSet(Collection<? extends E> c)]() 
>>>> * [TreeSet(Comparator<? super E> comparator)]() 
>>>> * [TreeSet(SortedSet<E> s)]() 
>>>
>>>> ##### Methods. 
>>>>> ###### add
>>>>> * [boolean add (E e)]() 
>>>>
>>>>> ###### remove
>>>>> * [boolean remove (Object o)]() 
>>>>
>>>>> ###### isEmpty
>>>>> * [boolean isEmpty ()]()
>>>> 
>>>>> ###### size
>>>>> * [int size ()]()
>>>>
>>>>> ###### clear
>>>>> * [void clear ()]()
>>>>
>>>>> ###### contains
>>>>> * [boolean contains(Object o)]()
>>>>> * [This method calls equals() on each element of the TreeSet to see if there are any matches.]()
>>>>
>>>>> ###### lower
>>>>> * [E lower (E e)](src/main/java/com/trl/theoreticalKnowledge/collections/set/sortedSet/navigableSet/treeSet/methods/lower/a/a1/Example.java)
>>>>
>>>>> ###### floor
>>>>> * [E floor (E e)](src/main/java/com/trl/theoreticalKnowledge/collections/set/sortedSet/navigableSet/treeSet/methods/floor/a/a1/Example.java)
>>>>
>>>>> ###### ceiling
>>>>> * [E ceiling (E e)](src/main/java/com/trl/theoreticalKnowledge/collections/set/sortedSet/navigableSet/treeSet/methods/ceiling/a/a1/Example.java)
>>>>
>>>>> ###### higher
>>>>> * [E higher (E e)](src/main/java/com/trl/theoreticalKnowledge/collections/set/sortedSet/navigableSet/treeSet/methods/higher/a/a1/Example.java)
>
>> ### Map.
>> * [ A map is a collection that maps keys to values, with no duplicate keys allowed. The elements in a map are key/value pairs.]()
>
>> ### Queue.
>> * You use a queue when elements are added and removed in a specific order. Queues are typically used for sorting 
>>   elements prior to processing them. <br/>
>> * [A queue is a collection that orders its elements in a specific order for processing. A typical queue processes its 
>>   elements in a FIFO (first-in, first-out) order, but other orderings are possible.]()
>>
>>> #### PriorityQueue.
>>>
>>>> ##### Constructor. 
>>>> * [PriorityQueue()]() 
>>>> * [PriorityQueue(Collection<? extends E> c)]() 
>>>> * [PriorityQueue(Comparator<? super E> comparator)]() 
>>>> * [PriorityQueue(int initialCapacity)]() 
>>>> * [PriorityQueue(int initialCapacity, Comparator<? super E> comparator)]() 
>>>> * [PriorityQueue(PriorityQueue<? extends E> c)]() 
>>>> * [PriorityQueue(SortedSet<? extends E> c)]() 
>>>
>>>> ##### Methods. 
>>>>> ###### add
>>>>> * [boolean add (E e)]() 
>>>>
>>>>> ###### remove
>>>>> * [boolean remove (Object o)]() 
>>>>
>>>>> ###### isEmpty
>>>>> * [boolean isEmpty ()]()
>>>> 
>>>>> ###### size
>>>>> * [int size ()]()
>>>>
>>>>> ###### clear
>>>>> * [void clear ()]()
>>>>
>>>>> ###### contains
>>>>> * [boolean contains(Object o)]()
>>>>> * [This method calls equals() on each element of the TreeSet to see if there are any matches.]()
>>
>>> #### ArrayDeque.
>>>
>>>> ##### Constructor. 
>>>> * [ArrayDeque<>()]() 
>>>> * [ArrayDeque(Collection<? extends E> c)]() 
>>>> * [ArrayDeque(int numElements)]() 
>>>
>>>> ##### Methods. 
>>>>> ###### add
>>>>> * [boolean add (E e)]() 
>>>>
>>>>> ###### remove
>>>>> * [E remove ()]() 
>>>>> * [boolean remove (Object o)]() 
>>>>
>>>>> ###### isEmpty
>>>>> * [boolean isEmpty ()]()
>>>> 
>>>>> ###### size
>>>>> * [int size ()]()
>>>>
>>>>> ###### clear
>>>>> * [void clear ()]()
>>>>
>>>>> ###### contains
>>>>> * [boolean contains(Object o)]()
>>>>> * [This method calls equals() on each element of the TreeSet to see if there are any matches.]()
>
>> ### Heap.
>>
>> ### Additional Information.
>>
>>> #### Method "equals()".
>>> * [1.]()
>>
>>> #### Method "hashCode().
>>
>>> #### Interfaces "Comparable" and "Comparator". Methods compareTo() and compare().
>>> * []()
>
>> ### Concurrent Collections.
>










## Array.
* [1.](src/main/java/com/trl/theoreticalKnowledge/array/a/a1/Example.java)










## Arrays.
* [asList()](src/main/java/com/trl/theoreticalKnowledge/arrays/asList/a/a1/Example.java)
* [sort()](src/main/java/com/trl/theoreticalKnowledge/arrays/sort/a/a1/Example.java)
* [parallelSort()]()
* [binarySearch()](src/main/java/com/trl/theoreticalKnowledge/arrays/binarySearch/a/a1/Example.java)









## Stream API.










## Compiler.
* Compiler Warning is different from a compiler error in that all of the code still compiles with a compiler error. 
  The compiler warning is Java informing you that you should take a closer look at something.










## Help










## License
Apache 2.0, see [LICENSE](LICENSE).
