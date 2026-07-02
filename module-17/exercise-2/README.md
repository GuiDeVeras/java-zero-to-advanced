Exercise 2
	Let's create a method that copies the elements from one list to another list that can be more generic than the first one.

	List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
	List<Double> myDoubles = Arrays.asList(3.14, 6.28);
	List<Object> myObjs = new ArrayList<Object>();

	copy(myInts, myObjs);

	copy(myDoubles, myObjs);
