package com.aspiresys.designpattern;

public class SingletonClass {
	public static void main(String args[]) {
		MySingletonClass x = MySingletonClass.getInstance();
		MySingletonClass y = MySingletonClass.getInstance();
		x.s = (x.s).toUpperCase();
		System.out.println(x.s);
		System.out.println(y.s);
	}
}

class MySingletonClass {

	private static MySingletonClass instance = null;
	public String s;

	private MySingletonClass() {
		s = "hello singleTon";
	}

	public static MySingletonClass getInstance() {
		if (instance == null)
			instance = new MySingletonClass();

		return instance;
	}
}
//
//Where to use?
//
// Hardware interface access: The use of singleton depends on the requirements.
// However practically singleton can be used in case external hardware resource
// usage limitation required e.g. Hardware printers where the print spooler can
// be made a singleton to avoid multiple concurrent accesses and creating
// deadlock.
//
// Logger : Similarly singleton is a good potential candidate for using in the
// log files generation. Imagine an application where the logging utility has to
// produce one log file based on the messages received from the users. If there
// is multiple client application using this logging utility class they might
// create multiple instances of this class and it can potentially cause issues
// during concurrent access to the same logger file. We can use the logger
// utility class as a singleton and provide a global point of reference.
//
// Configuration File: This is another potential candidate for Singleton pattern
// because this has a performance benefit as it prevents multiple users to
// repeatedly access and read the configuration file or properties file. It
// creates a single instance of the configuration file which can be accessed by
// multiple calls concurrently as it will provide static coranfig data loaded into
// in-memory objects. The application only reads from the configution file at
// the first time and there after from second call onwards the client
// applications read the data from in-memory objects.
//
// Cache: We can use the cache as a singleton object as it can have a global
// point of reference and for all future calls to the cache object the client
// application will use the in-memory object.
