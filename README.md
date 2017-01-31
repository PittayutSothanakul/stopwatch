
# Stopwatch tasks by Pittayut Sothanakul(5910546678)

I ran the tasks on a Mac Pro , and got these results:

Task					| Time
----------------------------------------|-------:
Append 50,000 chars to String		| 1.052309 sec
Append 100,000 chars to String		| 2.864532 sec
Append 100,000 chars to StringBuilder	| 0.002938 sec
Add 1 billion double using array	| 1.396759 sec
Add 1 billion Double using array 	| 4.454500 sec
Add 1 billion BigDecimal using array 	| 8.504789 sec


* Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars?
 Because it use memory to keep a new String and old String ,So every time created a new String It takes more time and more.
Example String a = "a"; and String b = "b"; a = a+b;
the memory will have a String "a" and "b" and "ab".

* Why is appending to StringBuilder so much different than appending to String? What is happening to the String?
 Because StringBuilder will not create a new String it just update the value inside the char[] value it has only one String but appendToString it create a new String and keep old and new String in memories.

* Explain difference in time to sum double, Double, and BigDecimal. Which is faster and why?
 double is the fastest because it is primitive value ,Class Double is faster than Bigdecimal because Double is an object it has attributes and methods which take in memory.A BigDecimal class is the slowest because it not rounded off decimal digit ,so longer decimal it take more memory it will be slow.  
