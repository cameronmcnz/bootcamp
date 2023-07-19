package com.stock.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.domain.StockAccount;
import com.stock.service.StockAccountService;

//TODO Declare the class is a REST Controller
//TODO Map the entire class to the /accounts URI
@RestController
@RequestMapping("/accounts")
public class StockAccountResource {

	//TODO Inject the stock account service
	@Autowired
	private StockAccountService accountService;

	//TODO Create a method to retrieve all the stock accounts
	@RequestMapping
	public Collection<StockAccount> findAllAccounts() {
		Collection<StockAccount> accounts = accountService.findAll();
		
		return accounts;
	}
	
	//TODO Create a method to retrieve a stock account by id
	@RequestMapping("/{id}")
	public StockAccount findAccountById(@PathVariable("id") Long id) {
		return accountService.findById(id);
	}
	
	//TODO Create a method to retrieve a stock account by name
	@RequestMapping("/name/{name}")
	public StockAccount findAccountByName(@PathVariable("name") String name) {
		return accountService.findByName(name).stream().findFirst().orElse(null);
	}
		
	/* Alternate Solution #1 */
//	public StockAccount findAccountByName(@PathVariable("name") String name) {	
//		
//		Collection<StockAccount> accountCollection = accountService.findByName(name);
//		
//		StockAccount account = null;
//		
//		if (accountCollection.size() > 0) {
//			account = new ArrayList<StockAccount>(accountCollection).get(0);
//		} 
//
//		return account;
//	}
	
	/* Alternate Solution #2 */
//	public StockAccount findAccountByName(@PathVariable("name") String name) {		
//		Collection<StockAccount> accountCollection = accountService.findByName(name);
//				
//		StockAccount account = null;
//		
//		if (accountCollection.size() > 0) {
//			account = accountCollection.iterator().next();
//		}
//		
//		return account;
//	}

}
