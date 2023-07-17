
Create a C:\temp folder

Run the StockTracker's main method to create an account with millions of dollars.

Shut down the program and run it again. The former balances should have persisted.

You can persist a StockAccount with StockFileManager.getStoredAccount()

You can get the persisted account data in your REST APIs with StockFileManager.getStoredAccount()

You could add a helper method to any class that needs the user's stock account often.

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

Here is a sample implementation of the /buy method:

  @PostMapping(path = "/buy", consumes = JSON, produces = JSON)
  @ResponseBody
  	public StockAccount buyStock(@RequestBody Stock toBuy) throws StockException {
	  System.out.println("In buy");
	  getStockAccount().buyStock(toBuy);
	  return getStockAccount();
  	}

	
	