package gui;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class JunitTesting {



	@Test
	void testUserName() {
		User user = new User();
		user.setUserName("username");
		assertEquals("username", user.getUserName());
	}

	@Test
	void testPassword() {
		User user = new User();
		user.setPassword("password");
		assertEquals("password", user.getPassword());
	}

	@Test
	void testFirstName() {
		User user = new User();
		user.setFirstName("John");
		assertEquals("John", user.getFirstName());
	}

	@Test
	void testCourses() {
		User user = new User();
		ArrayList<String> courses = new ArrayList<>();
		user.setCourses(courses);
		assertEquals(courses, user.getCourses());
	}

	@Test
	void testRole() {
		User user = new User();
		user.setRole("admin");
		assertEquals("admin", user.getRole());
	}

	@Test
	void testNotify() {
		User user = new User();
		user.setNotify(true);
		assertTrue(user.isNotify());
	}

	@Test
	void testValidated() {
		User user = new User();
		user.setValidated(true);
		assertTrue(user.isValidated());
	}

	// Additional Tests if needed for comprehensive testing, such as testing defaults or other methods

	@Test
	void testUserInitialization() {
		User user = new User(); // Assuming User class has a default state to test
		assertNotNull(user); // Verify the user object is successfully created
		// Can include assertions for default values if applicable
	}

	@Test
	void testSetAndGetCoursesWithActualCourses() {
		User user = new User();
		ArrayList<String> courses = new ArrayList<>();
		courses.add("Math");
		courses.add("Science");
		user.setCourses(courses);
		assertEquals(courses, user.getCourses()); // Ensure the getter returns exactly what was set, including non-empty lists
	}



	// Pseudo database for BookRequest
	private static HashMap<String, BookRequest> bookRequestDatabase = new HashMap<>();


	@Test
	void testBookRequestConstruction() {
		BookRequest bookRequest = new BookRequest("Title", RequestType.COURSE);
		assertEquals("Title", bookRequest.getBookTitle());
		assertEquals(RequestType.COURSE, bookRequest.getRequestType());
	}

	@Test
	void testSetBookTitle() {
		BookRequest bookRequest = new BookRequest("Initial Title", RequestType.COURSE);
		bookRequest.setBookTitle("New Title");
		assertEquals("New Title", bookRequest.getBookTitle());
	}

	@Test
	void testSetRequestType() {
		BookRequest bookRequest = new BookRequest("Title", RequestType.COURSE);
		bookRequest.setRequestType(RequestType.SELF_IMPROVEMENT);
		assertEquals(RequestType.SELF_IMPROVEMENT, bookRequest.getRequestType());
	}

	@Test
	void testToCSVString() {
		BookRequest bookRequest = new BookRequest("A Title", RequestType.SELF_IMPROVEMENT);
		String expectedCSV = "A Title,SELF_IMPROVEMENT";
		assertEquals(expectedCSV, bookRequest.toCSVString());
	}

	@Test
	void testEqualsAndHashCode() {
		BookRequest bookRequest1 = new BookRequest("Title", RequestType.COURSE);
		BookRequest bookRequest2 = new BookRequest("Title", RequestType.COURSE);
		BookRequest bookRequest3 = new BookRequest("Different Title", RequestType.COURSE);

		assertEquals(bookRequest1, bookRequest2);
		assertNotEquals(bookRequest1, bookRequest3);

		assertEquals(bookRequest1.hashCode(), bookRequest2.hashCode());
		assertNotEquals(bookRequest1.hashCode(), bookRequest3.hashCode());
	}

	@Test
	void testSaveToDatabase() {
		BookRequest bookRequest = new BookRequest("Database Title", RequestType.COURSE);
		bookRequestDatabase.put("1", bookRequest);

		assertTrue(bookRequestDatabase.containsKey("1"));
		assertEquals(bookRequest, bookRequestDatabase.get("1"));
	}

	// Additional tests can be added here if needed, for example, to test removal from the database
	@Test
	void testRemoveFromDatabase() {
		// Assuming an initial book request was added
		BookRequest bookRequest = new BookRequest("Removable Title", RequestType.COURSE);
		String key = "removable";
		bookRequestDatabase.put(key, bookRequest);

		// Ensure it's there
		assertTrue(bookRequestDatabase.containsKey(key));
		bookRequestDatabase.remove(key);

		// Now it should be gone
		assertFalse(bookRequestDatabase.containsKey(key));
	}



	@Test
	void testRequestType() {
		// Test RequestType enum functionality

		// Check if all enum values are correctly defined and accessible
		assertEquals(RequestType.COURSE, RequestType.valueOf("COURSE"));
		assertEquals(RequestType.SELF_IMPROVEMENT, RequestType.valueOf("SELF_IMPROVEMENT"));
	}


	// Pseudo database for Item
	private static HashMap<String, Item> itemDatabase = new HashMap<>();


	@Test
	void testItemConstruction() {
		Item item = new Item(1, "Book", "The Great Gatsby", "Library", 5, "F. Scott Fitzgerald", "Classic");
		assertEquals(1, item.getItemId());
		assertEquals("Book", item.getType());
		assertEquals("The Great Gatsby", item.getName());
		assertEquals("Library", item.getLocation());
		assertEquals(5, item.getCopiesAvailable());
		assertEquals("F. Scott Fitzgerald", item.getAuthor());
		assertEquals("Classic", item.getGenre());
	}

	@Test
	void testSetItemId() {
		Item item = new Item(1, "Book", "Dummy Name", "Dummy Location", 1, "Dummy Author", "Dummy Genre");
		item.setItemId(2);
		assertEquals(2, item.getItemId());
	}

	@Test
	void testSetType() {
		Item item = new Item(1, "Book", "Dummy Name", "Dummy Location", 1, "Dummy Author", "Dummy Genre");
		item.setType("DVD");
		assertEquals("DVD", item.getType());
	}

	@Test
	void testSetName() {
		Item item = new Item(1, "Book", "Dummy Name", "Dummy Location", 1, "Dummy Author", "Dummy Genre");
		item.setName("Inception");
		assertEquals("Inception", item.getName());
	}

	@Test
	void testSetLocation() {
		Item item = new Item(1, "Book", "Dummy Name", "Dummy Location", 1, "Dummy Author", "Dummy Genre");
		item.setLocation("Media Room");
		assertEquals("Media Room", item.getLocation());
	}

	@Test
	void testSetCopiesAvailable() {
		Item item = new Item(1, "Book", "Dummy Name", "Dummy Location", 1, "Dummy Author", "Dummy Genre");
		item.setCopiesAvailable(10);
		assertEquals(10, item.getCopiesAvailable());
	}

	@Test
	void testSetAuthor() {
		Item item = new Item(1, "Book", "Dummy Name", "Dummy Location", 1, "Dummy Author", "Dummy Genre");
		item.setAuthor("Christopher Nolan");
		assertEquals("Christopher Nolan", item.getAuthor());
	}

	@Test
	void testSetGenre() {
		Item item = new Item(1, "Book", "Dummy Name", "Dummy Location", 1, "Dummy Author", "Dummy Genre");
		item.setGenre("Science Fiction");
		assertEquals("Science Fiction", item.getGenre());
	}

	@Test
	void testToCsvString() {
		Item item = new Item(2, "DVD", "Inception", "Media Room", 10, "Christopher Nolan", "Science Fiction");
		assertEquals("2,DVD,Inception,Media Room,10,Christopher Nolan,Science Fiction", item.toCsvString());
	}

	@Test
	void testToString() {
		Item item = new Item(2, "DVD", "Inception", "Media Room", 10, "Christopher Nolan", "Science Fiction");
		assertEquals("Inception (DVD) - Copies: 10", item.toString());
	}

	@Test
	void testItemSaveToDatabase() {
		Item item = new Item(2, "DVD", "Inception", "Media Room", 10, "Christopher Nolan", "Science Fiction");
		itemDatabase.put("1", item);
		assertTrue(itemDatabase.containsKey("1"));
		assertEquals(item, itemDatabase.get("1"));
	}




	@Test
	void testLoadItemsFromCSVValidItems() {
		File tempFile = createTempFileWithContent(
				"1,Book,Harry Potter,Shelf 1,5,J.K. Rowling,Fantasy\n" +
						"2,Book,The Hobbit,Shelf 2,3,J.R.R. Tolkien,Fantasy\n"
				);

		ItemManager manager = new ItemManager();
		List<Item> items = manager.loadItemsFromCSV(tempFile.getAbsolutePath());

		assertEquals(2, items.size());

		checkItemDetails(items.get(0), 1, "Book", "Harry Potter", "Shelf 1", 5, "J.K. Rowling", "Fantasy");
		checkItemDetails(items.get(1), 2, "Book", "The Hobbit", "Shelf 2", 3, "J.R.R. Tolkien", "Fantasy");

		assertTrue(tempFile.delete());
	}

	@Test
	void testLoadItemsFromCSVWithInvalidData() {
		File tempFile = createTempFileWithContent(
				"1,Book,Harry Potter,Shelf 1,5,J.K. Rowling,Fantasy\n" +
						"3,Book,Invalid Data\n" // Invalid data
				);

		ItemManager manager = new ItemManager();
		List<Item> items = manager.loadItemsFromCSV(tempFile.getAbsolutePath());

		assertEquals(1, items.size()); // Only valid items should be added
		checkItemDetails(items.get(0), 1, "Book", "Harry Potter", "Shelf 1", 5, "J.K. Rowling", "Fantasy");

		assertTrue(tempFile.delete());
	}

	// Utility method to create a temp file with content
	private File createTempFileWithContent(String content) {
		File tempFile = null;
		try {
			tempFile = File.createTempFile("tempItemFile", ".csv");
			BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));
			bw.write(content);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
			fail("Failed to create temp file");
		}
		return tempFile;
	}

	// Utility method to check item details
	private void checkItemDetails(Item item, int expectedId, String expectedType, String expectedName, String expectedLocation, int expectedCopies, String expectedAuthor, String expectedGenre) {
		assertEquals(expectedId, item.getItemId());
		assertEquals(expectedType, item.getType());
		assertEquals(expectedName, item.getName());
		assertEquals(expectedLocation, item.getLocation());
		assertEquals(expectedCopies, item.getCopiesAvailable());
		assertEquals(expectedAuthor, item.getAuthor());
		assertEquals(expectedGenre, item.getGenre());
	}

	
	
	//has GUI parts to it.   
	
	//	 @Test
	//	    void testMobileWalletPayment() {
	//	        // Mock PaymentContext and PaymentFinishedListener
	//	        PaymentContext context = new PaymentContext(null); // No need for listener in this test
	//	        MobileWalletPayment mobilePayment = new MobileWalletPayment();
	//
	//	        // Test payment using MobileWalletPayment
	//	        assertDoesNotThrow(() -> mobilePayment.pay(context));
	//	    }
	//
	//	    @Test
	//	    void testPaymentContext() {
	//	        // Mock PaymentFinishedListener
	//	        PaymentFinishedListener listener = new PaymentFinishedListener() {
	//	            @Override
	//	            public void onPaymentFinished(boolean success) {
	//	                assertTrue(success);
	//	            }
	//	        };
	//	        PaymentContext context = new PaymentContext(listener);
	//
	//	        // Set state to MobileWalletPayment
	//	        context.setState(new MobileWalletPayment());
	//
	//	        // Test payment using PaymentContext
	//	        assertDoesNotThrow(() -> context.pay());
	//	    }

	@Test
    void testRentalConstructorAndGetterMethods() {
        // Setup
        LocalDate rentalDate = LocalDate.of(2022, 4, 1);
        LocalDate dueDate = LocalDate.of(2022, 4, 15);
        Rental rental = new Rental(123, "user123", rentalDate, dueDate);

        // Assertions to verify the constructor and getters
        assertEquals(123, rental.getItemId());
        assertEquals("user123", rental.getUsername());
        assertEquals(rentalDate, rental.getRentalDate());
        assertEquals(dueDate, rental.getDueDate());
    }

    @Test
    void testRentalToStringMethod() {
        // Setup
        LocalDate rentalDate = LocalDate.of(2022, 4, 1);
        LocalDate dueDate = LocalDate.of(2022, 4, 15);
        Rental rental = new Rental(123, "user123", rentalDate, dueDate);

        // Verify toString method
        assertEquals("Rental: Item ID 123, Username: user123", rental.toString());
    }

    @Test
    void testRentalToCSVStringMethod() {
        // Setup
        LocalDate rentalDate = LocalDate.of(2022, 4, 1);
        LocalDate dueDate = LocalDate.of(2022, 4, 15);
        Rental rental = new Rental(123, "user123", rentalDate, dueDate);

        // Verify toCSVString method
        assertEquals("123,user123,2022-04-01,2022-04-15", rental.toCSVString());
    }

  

	@Test
	public void testRequestQueue() {
		// Create a temporary mock CSV file
		File tempFile = null;
		try {
			tempFile = File.createTempFile("tempFile", ".csv");
			BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));
			bw.write("BookTitle,RequestType\n"); // Header
			bw.write("Harry Potter,COURSE\n");
			bw.write("The Hobbit,SELF_IMPROVEMENT\n");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Test the loadRequestsFromCSV method
		RequestQueue queue = RequestQueue.getInstance();
		Set<BookRequest> requests = queue.loadRequestsFromCSV(tempFile.getAbsolutePath());

		// Check the size of the returned set
		assertEquals(2, requests.size());

		// Add a new request and save it to the CSV file
		BookRequest newRequest = new BookRequest("The Lord of the Rings", RequestType.COURSE);
		queue.addRequest(newRequest);
		queue.saveRequestsToCSV(tempFile.getAbsolutePath());

		// Load the requests again and check that the new request was saved
		requests = queue.loadRequestsFromCSV(tempFile.getAbsolutePath());
		assertEquals(3, requests.size());

		// Process the next request
		BookRequest processedRequest = queue.processNextRequest();
		assertNotNull(processedRequest);

		// Refresh and save to CSV
		queue.refreshAndSaveToCSV(tempFile.getAbsolutePath());

		// Delete the temporary file
		tempFile.delete();
	}



	@Test
	public void testCsvReadWrite(@TempDir Path tempDir) throws IOException {
		// Initialize CsvReadWrite
		gui.CsvReadWrite csvReadWrite = new gui.CsvReadWrite();

		// Create and set the temporary file path for testing
		File tempFile = tempDir.resolve("tempUsers.csv").toFile();
		csvReadWrite.setFilePath(tempFile.getAbsolutePath());

		// Prepare the temporary CSV file with initial data
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile))) {
			bw.write("username,password,validated,role,firstName,notify,courses\n"); // Header
			bw.write("testUser1,password1,true,Student,John,false,Math;Science\n");
			bw.write("testUser2,password2,false,Faculty Member,Jane,true,Physics;Chemistry\n");
		}

		// Test registerUser method for a new user
		boolean registered = csvReadWrite.registerUser("testUser3", "password3", true, "Student", "Alice", true, new ArrayList<>(Arrays.asList("History")));
		assertTrue(registered);

		// Test loginUser method for all users
		User user1 = csvReadWrite.loginUser("testUser1", "password1");
		assertNotNull(user1);
		assertEquals("testUser1", user1.getUserName());

		User user2 = csvReadWrite.loginUser("testUser2", "password2");
		assertNull(user2); // User should not be logged in because validation is false

		User user3 = csvReadWrite.loginUser("testUser3", "password3");
		assertNotNull(user3);

		// Further tests...
		List<User> unverifiedUsers = csvReadWrite.getUnverifiedUsers();
		assertEquals(2, unverifiedUsers.size());

		csvReadWrite.verifyUser("testUser2");
		User user2Verified = csvReadWrite.loginUser("testUser2", "password2");
		assertNotNull(user2Verified);
		assertTrue(user2Verified.isValidated());

		// Assuming updateFacultyNotifications() notifies all faculties teaching "Physics"
		csvReadWrite.updateFacultyNotifications("Physics");
		User user1Updated = csvReadWrite.loginUser("testUser1", "password1");
		assertFalse(user1Updated.isNotify()); // user1 does not teach Physics, so should not be notified
	}
}
