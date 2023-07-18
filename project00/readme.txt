Here is a video to get you started on the project. There's no audio, just pure coding.

https://youtu.be/t9LslAkXwl4

0:00 Download GitHub Repo
0:54 Install Skeleton Project
1:40 Run project on server
2:00 Find correct URL
3:00 Test with Postman
4:25 Do a POST with Postman
5:55 Import Java code
7:35 Add an API method
8:30 Test your API method
9:40 Add default constructor
10:00 Finish the test

Files for the projects, including PDFs, starter ZIP files and Java classes for page 6 of of Project 1, can be found here:

https://github.com/cameronmcnz/bootcamp/tree/main/project00

First Project

You can download the PDF for the first project here:

https://github.com/cameronmcnz/bootcamp/blob/main/project00/01%20-%20First%20Project.pdf

Import the skeleton project, run it on the server and test it at:

http://localhost:8080/StockService/stocks/account

The URL in the book may be wrong depending on how the project is configured.

Test the StockService's GET method in Chrome, and then test the POST method in PostMan, which is a program installed on your computer.

After you test the Skeleton project, copy all the Stock related Java files from the Git repo into your project. This is a future step defined in Part 2 of this assignment, but you'll thank me for telling you to add them in right away. It's files like these:

StockFileManager
StockException
StockTracker
You may need to add empty default constructors to some classes like the Stock class.

public StockTracker (){}

Work to complete the Skeleton API. For Part I you only create method stubs and return fake, hard-coded data. 

An example would be this:
@PostMapping(path = "/buy", consumes = JSON, produces = JSON)
@ResponseBody
public StockAccount buyStock(@RequestBody Stock toBuy) throws Exception {
  System.out.println("In buy: " + toBuy);
  return null;
}

You need methods for each of these functions:

• The API must allow users to create an account
• The API must allow users to buy stock and dividend stock
• The API must allow users to sell stock and dividend stock
• The API must allow users to retrieve account name
• The API must allow users to retrieve account balance
• The API must allow users to retrieve a list of held stocks
• The API must allow users to retrieve all account information

Note: The methods in the StockAccount and the StockFileManager classes provide pretty obscene hints as to what your methods should look like. You'd basically be cheating if you looked at them.

Show me your skeleton API when you are finished Lab 1 in the first Project PDF.
A complete skeleton API will earn you a 75% mark project.

First Project Lab 2

Copy the stock related Java files from the GitHub folder linked above into your skeleton API project if you haven't already done so.

Create a C:\temp folder

Then check to see if you created a C:\temp folder
Open an new Windows Explorer and double-check to see if you created a C:\temp folder
Ask your best friend to look at your computer and check to see if you created a C:\temp folder
Post a screenshot to Twitter showing everyone you created a C:\temp folder

Run the StockTracker's main method to create an account with millions of dollars.

Shut down the program and run it again. The former balances should have persisted.

You can persist a StockAccount with StockFileManager.getStoredAccount()

You can get the persisted account data in your REST APIs with:
 
StockFileManager.getStoredAccount();

You could add a static helper method to any class that needs the user's stock account often. It might look something like this:

  public StockAccount getStockAccount() {
	  StockAccount account = null;
	    try {
	        account = StockFileManager.getStoredAccount();
	        //response.setStatus(HttpServletResponse.SC_OK);
	      } catch (StockException e) {
	        //response.setStatus(HttpServletResponse.SC_NOT_FOUND);
	      }
	    return account;
  }

You may need to add default constructors to some domain classes. If in doubt, do it.

To give you a start, here is a sample implementation of the /buy method:

@PostMapping(path = "/buy", consumes = JSON, produces = JSON)
@ResponseBody
public StockAccount buyStock(@RequestBody Stock toBuy) throws StockException {
	  System.out.println("In buy");
	  getStockAccount().buyStock(toBuy);
   return getStockAccount();
}

A completed Lab 2 will earn you 95% on the project.

Second Project

The second project is worth the last 10%!

For a full 10% you don't need to get it all done 100%, but you do need to demonstrate patience, enthusiasm and creativity when faced with difficult challenges. Ask good questions, show good problem-solving skills and work collaboratively with others when the chance arises. 

The PDF is here:

https://github.com/cameronmcnz/bootcamp/blob/main/project00/02%20-%20Final%20Project.pdf

This lab is difficult and challenging and pulls together everything you know about Spring and Java. 

Work hard to complete it.