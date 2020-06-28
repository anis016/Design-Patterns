# Observer Design Patterns

The `Observer Design Patterns` defines a `one-to-many` dependency between objects, so that when one object (`subject`) 
changes state all of its dependencies (`subscribers`) are notified and updated automatically.


Consider there are two objects - **A** and **B**
* **Object A** has something where the state changes
* **Object B** is a subscriber for **Object A**

### Polling
In `Polling`, **Object B** constantly `polls` **Object A** if there are any changes
Basically **Object A** is asking for a data (query whether there is an update) before even knowing if there are new data.
<br>

&nbsp;&nbsp;&nbsp; Now, consider there are lots of different objects of type B (that is multiple subscribers), and this 
is going to be problem if all these subscribers are constantly queries **Object A** for the update. Bad idea!

### Pushing
In `Pushing`, instead of subscribers constantly querying for change, **Object A** will `push` (notify) to all the subscribers 
if there is any change (**only** when there is a change) in the state of the **Object A**. Good idea!
<br>

&nbsp;&nbsp;&nbsp; Before `Pushing`, all the subscribers (`Observers` - **Object B**) needs to register to the subject 
(`Subject` - **Object A**). So when there is a `change in the subject object`, then the subject object `notifies the
observers object`. 

<p align="center">
  <img src="https://raw.githubusercontent.com/anis016/Design-Patterns/master/resource/Observer_Design_Pattern_UML.png?raw=true"/>
  <br>
    <em>UML class. Image Source: <a href="https://learning.oreilly.com/library/view/learning-javascript-design/9781449334840/ch09s05.html">Learning JavaScript Design Patterns</a></em>
</p>

# Resource
* [Head First Design Patterns](https://learning.oreilly.com/library/view/head-first-design/0596007124/)
* [Observer Pattern - Design Patterns (ep 2)](https://www.youtube.com/watch?v=_BpmfnqjgzQ)
