# OCP Exam Preparation.

* [About](#about)
* [Help](#help)
* [License](#license)

## Contents at a Glance.
* [Enum](#enum)
* [InstanceOf](#instanceof)
* [Nested Class](#nested-class)
* [Methods from Object Class](#methods-from-object-class)
* [Virtual Methods](#virtual-methods)

## About.
- This project created for educational purposes.
- This project may contain invalid or false information.
- Always check the information you are learning.










## Enum.
### Constructor.
* [Enum constructor must have access modifier private or package.](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/_enum/enumConstructor/a/a1/Example.java)

### Inheritance.
* [Inheritance not allowed for "Enum". It is only allowed to implement the interface.](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/_enum/inheritance/a/a1/Example.java)

### Using "Switch" with "Enum".
* [Work with "Enum" and with "Switch".](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/_enum/enumSwitch/a/a1/Example.java)

### Pre-defined Methods.
* [Work with "Enum" method "valueOf".](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/_enum/methodsOfEnum/valueOf/a/a1/Example.java)
* [Work with "Enum" method "values".](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/_enum/methodsOfEnum/values/a/a1/Example.java)

### Definition abstract methods in "Enum", and implementation this abstract methods in "Enum Value".
* [Definition of an abstract method  in a "Enum". And implementation this abstract method in each "Enum Value".](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/_enum/methods/abstractMethod/a/a1/Example.java)
* [Each and every "Enum Value", required to implement abstract method.](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/_enum/methods/abstractMethod/a/a2/Example.java)
* [If "Enum Value", have defined abstract method, "Enum" required to have defined this abstract method.](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/_enum/methods/abstractMethod/a/a3/Example.java)
* [Is allowed implementation many abstract method in "Enum Values".](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/_enum/methods/abstractMethod/a4/Example.java)

### Definition methods in "Enum", and implementation this methods in "Enum Value".
* [Definition of an method  in a "Enum". And implementation this method in each "Enum" value.](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/_enum/methods/a/a1/Example.java)
* [Is not mandatory implementing methods in every "Enum" values.](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/_enum/methods/a/a2/Example.java)
* [If "Enum" value, have defined method, "Enum" required to have defined this method.](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/_enum/methods/a/a3/Example.java)
* [Is allowed implementing many method in "Enum" values.](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/_enum/methods/a/a4/Example.java)

### Note to self.
* [1](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/_enum/b/b1/Example.java)











## InstanceOf.










## Nested Class.
- Exist two types of classes: top-level class, Nested Class.
- Nested Class divided into two types: "Static Nested Class" and "Inner Class".
- Sywchestvyet "Anonymous class". "Anonymous class" siempre is "Nested Class" no potom stanovitca libo "Static Nested Class" libo "Inner Class".
- "Nested Class" may have "access modifier": private, default, protected, public.

### Static Nested Class.

#### Type of Static Nested Class
- Exist four types of Static Nested Class: interface, abstract class, class, enum.

#### Variables
- Non-static variables from "top-level class" cannot be used in the "static nested class".
- Static variables from "top-level class" can be used in the "static nested class".

#### Definition "Static Nested Class" in the method.
- Not allowed definition "static nested class" in the method body.
- Not allowed definition "static nested class" in the static method body.

#### Local Static Nested Class.
* [The definition for the "Local Static Nested Class" is not allowed.](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/nestedClass/staticNestedClass/localStaticNestedClass/a/a1/Example.java)


### Inner Class.
- The "Inner Class" has a subtype that name is "Local Inner Class".
- Ekzempliar "Inner Class" vsehda dolzen sodirzat ssulky na "top-level class".
- Esli sozdaietsa "top-level class" eto ne znachit chto proisxodit sozdanie "Inner Class".
- Esli sozdaietsa "Inner Class" to obiazan sywchestvovat ekzempliar "top-level class". I "Inner Class" bydet ssulatsa na "top-level class".
- Raznue "Inner Class" mohut ssulatsa na odin i totze "top-level class".
- "Inner Class" mozet bit obiavlion v methode. No znachenie kotoroe vozvrawchaet ethot method ne mozet bit tipos etoho "Inner Class". 
  "Inner Class" kotorui obiavlaetsa v nytri methoda, ne viden za figurnumi scobcami etoho methoda. 
  Znachenie cotoroe vozvrawchaet method mozet bit "Object type" i takim sposobom mozno vozvrawcaht "Inner Class" kororui opredelon v methode.
- java memory leak. "Inner Class" mozet sprovocurovat "java memory leak". Do toho vremeni kohda ziv "Inner Class" bydet ziv "top-level calss",
  "Garbage Collector" ne smozet ydalit "top-level class".

#### Type of Inner Class
- Exist four types of Inner Class: interface, abstract class, class, enum.

#### Variables.
- Static and non-static variables from top-level class can be used in the inner class.

#### Local Inner Class.
* [The definition for the "Local Inner Class".](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/nestedClass/innerClass/localInnerClass/a/a1/Example.java)
* [Local Inner Class can't have an access modifier.](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/nestedClass/innerClass/localInnerClass/accessModifier/a/a1/Example.java)
* [Local Inner Class can't be declared static.](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/nestedClass/innerClass/localInnerClass/_static/a/a1/Example.java)
* [Local Inner Class can't have an variables static.](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/nestedClass/innerClass/localInnerClass/_static/variables/a/a1/Example.java)
* [Local Inner Class can't have an methods static.](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/nestedClass/innerClass/localInnerClass/_static/methods/a/a1/Example.java)
* [Local Inner Class have access to all variables of the outer class.](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/nestedClass/innerClass/localInnerClass/variables/a/a1/Example.java)
* [Local Inner Class have access to all methods of the outer class.](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/nestedClass/innerClass/localInnerClass/methods/a/a1/Example.java)
* [Local Inner Class have access to local variables without access modifier and final local variables of the method.](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/nestedClass/innerClass/localInnerClass/variables/localVariables/a/a1/Example.java)

### Anonymous Class.
* [If type of an "Anonymous Class" is "Abstract Class". And this "Abstract Class" have "abstract methods", all "abstract 
   methods" from this "Abstract Class" is mandatory must be defined.](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/nestedClass/anonymousClasses/_abstract/a/a1/Example.java)
* [If type of an "Anonymous Class" is "Interface". And this "Interface" have "abstract methods", all "abstract method" 
   from this "Interface" is mandatory must be defined.](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/nestedClass/anonymousClasses/_interface/a/a1/Example.java)
* [Type of an "Anonymous Class" is "Static Nested Class".](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/nestedClass/anonymousClasses/staticNestedClass/a/a1/Example.java)
* [Type of an "Anonymous Class" is "Inner Class".](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/nestedClass/anonymousClasses/innerClass/a/a1/Example.java)

#### Initialization. 
* [Initialization of "Anonymous Class".](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/nestedClass/anonymousClasses/initialization/a/a1/Example.java)

#### Final Class.
* [An type of an "Anonymous Class" cannot be final.](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/nestedClass/anonymousClasses/_final/a/a1/Example.java)

#### Final Method.
* [If some type of an "Anonymous Class" have "final method" and you want implement this "final method", that will be impossible. 
   It is not allowed to redefine final methods.](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/nestedClass/anonymousClasses/methods/_final/a/a1/Example.java)
   
#### Static Method.
* [If some type of an "Anonymous Class" have "static method" and you want implement this "static method", that will be impossible. 
   It is not allowed to redefine static methods.](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/nestedClass/anonymousClasses/methods/_static/a/a1/Example.java)

#### Access Modifier of Method.
* [Private methods are not allowed to redefine. Methods of access modifier: public, protected, package is allowed redefine.](https://github.com/OCP-Exam-Preparation/OCP/blob/master/src/main/java/com/trl/theoreticalKnowledge/nestedClass/anonymousClasses/methods/accessModifier/a/a1/Example.java)












## Methods from Object class.










## Virtual Methods.










## Help










## License
Apache 2.0, see [LICENSE](LICENSE).
