# OCP Exam Preparation.

## Contents at a Glance.
* [About](#about)
* [Enum](#enum)
* [InstanceOf](#instanceof)
* [Nested Class](#nested-class)
* [Methods from Object Class](#methods-from-object-class)
* [Virtual Methods](#virtual-methods)
* [Imports](#imports)
* [Casting Values](#casting-values)
* [Java Inheritance](#java-inheritance)
* [Functional Interface](#functional-interface)
* [Lambda Expression](#lambda-expression)
* [Help](#help)
* [License](#license)

## About.
This project created for educational purposes, and this project may contain invalid or false information always check the information you are learning. <br/>










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

















# InstanceOf.
* [Example of "InstanceOf".](src/main/java/com/trl/theoreticalKnowledge/instanceOf/a/a1/Example.java)
* [Example of "null instanceOf someValue".](src/main/java/com/trl/theoreticalKnowledge/instanceOf/_null/a/a1/Example.java)










> ## Nested Class.
> * Exist two types of classes: top-level class, Nested Class.
> * Nested Class divided into two types: "Static Nested Class" and "Inner Class".
> * Sywchestvyet "Anonymous class". "Anonymous class" siempre is "Nested Class" no potom stanovitca libo "Static Nested Class" libo "Inner Class".
> * "Nested Class" may have "access modifier": private, default, protected, public.
>
>> ### Static Nested Class.
>>
>>> #### Type of Static Nested Class
>>> * Exist four types of Static Nested Class: interface, abstract class, class, enum.
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
>>>> * Non-static variables from "top-level class" cannot be used in the "static nested class".
>>>
>>>> ##### Static.
>>>> * Static variables from "top-level class" can be used in the "static nested class".
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
>>>> * Not allowed definition "static nested class" in the method body.
>>>
>>>> ##### Static.
>>>> * Not allowed definition "static nested class" in the static method body.
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
>> * The "Inner Class" has a subtype that name is "Local Inner Class".
>> * Ekzempliar "Inner Class" vsehda dolzen sodirzat ssulky na "top-level class".
>> * Esli sozdaietsa "top-level class" eto ne znachit chto proisxodit sozdanie "Inner Class".
>> * Esli sozdaietsa "Inner Class" to obiazan sywchestvovat ekzempliar "top-level class". I "Inner Class" bydet ssulatsa na "top-level class".
>> * Raznue "Inner Class" mohut ssulatsa na odin i totze "top-level class".
>> * "Inner Class" mozet bit obiavlion v methode. No znachenie kotoroe vozvrawchaet ethot method ne mozet bit tipos etoho "Inner Class". 
>>   "Inner Class" kotorui obiavlaetsa v nytri methoda, ne viden za figurnumi scobcami etoho methoda. 
>>   Znachenie cotoroe vozvrawchaet method mozet bit "Object type" i takim sposobom mozno vozvrawcaht "Inner Class" kororui opredelon v methode.
>> * java memory leak. "Inner Class" mozet sprovocurovat "java memory leak". Do toho vremeni kohda ziv "Inner Class" bydet ziv "top-level calss",
>>   "Garbage Collector" ne smozet ydalit "top-level class".
>>
>>> #### Type of Inner Class
>>> * Exist four types of Inner Class: interface, abstract class, class, enum.
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











## Methods from Object class.










## Virtual Methods.










## Imports.
### Static Import.
* [Example of correct definition of "Static Import".](src/main/java/com/trl/theoreticalKnowledge/_imports/_static/Example.java)










## Casting Values.
* [If casting operation is incorrect while be throw "Runtime Exception".](src/main/java/com/trl/theoreticalKnowledge/castingValues/a/a1/Example.java)










> ## Java Inheritance.
>
>> ### Class.
>> * ["Class" can only be "extend" from one "class" or one "abstract class".]()
>> * ["Class" can be "implement" may "interfaces".]()
>>
>>> #### Variables.
>> * [Class variables are not inherited.](src/main/java/com/trl/theoreticalKnowledge/inheritance/variable/a/a1/Example.java)
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










### Functional Interface.
* ["Functional Interface" as an "Interface" that contains a single "Abstract Method". Bat may have defined "Default Method" or 
   "Static Method". Or may have defined both methods at the same time.](src/main/java/com/trl/theoreticalKnowledge/functionalInterface/a/a1/Example.java)










> ### Lambda Expression.
>
>> #### Parameters of Lambda.
>> * [The parentheses can be omitted in a lambda expression if there is exactly one input parameter and the type is not 
>>    explicitly stated in the expression. This means that expressions that have zero or more than one input parameter will 
>>    still require parentheses. ]()
>> * [Pass one parameter to "Lambda Expression".](src/main/java/com/trl/theoreticalKnowledge/lambda/parameters/a/a1/Example.java)
>> * [Pass two or many parameters to "Lambda Expression".](src/main/java/com/trl/theoreticalKnowledge/lambda/parameters/a/a2/Example.java)
>
>> #### Body of Lambda.
>> * [Semicolon.](src/main/java/com/trl/theoreticalKnowledge/lambda/body/semicolon/a/a1/Example.java)
>> * [Return Value.](src/main/java/com/trl/theoreticalKnowledge/lambda/body/returnValue/a/a1/Example.java)
>> * [Since Java doesn’t allow us to re‐declare a local variable.](src/main/java/com/trl/theoreticalKnowledge/lambda/body/a/a1/Example.java)
>










## Help
## Help 2










## License
Apache 2.0, see [LICENSE](LICENSE).
