1. This project has three classes: 
	The main class where the main method is found used to prepare all the data required for the program and 	initiate the operation,
	Operator class that is used to encapsulate information about an operator(i.e. operator name, and supported prefixes), 
	and finally the OperatorPicker where the method  to find the least costly operator is located.

2. Junit test is used to make sure every possible input works as it is expected.

3. I have used Singleton design pattern to define the OperatorPicker class since it does not maintain any state throughout the program life cycle a single instance can handle every request(assuming that this functionality can be called from different points and/or instances of caller).