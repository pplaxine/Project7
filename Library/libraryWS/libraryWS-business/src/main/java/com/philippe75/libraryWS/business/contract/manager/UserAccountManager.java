package com.philippe75.libraryWS.business.contract.manager;

import com.philippe75.libraryWS.business.dto.UserAccountDto;
import com.philippe75.libraryWS.model.exception.saop.LibraryServiceException;
import com.philippe75.libraryWS.model.user.UserAccount;

/**
 * <b>Contains all methods related to {@link UserAccount} requests</b>
 * 
 * @author Philippe plaxine
 * @version 1.0
 */
public interface UserAccountManager  {
	
	/**
	 * @param userMemeberId the member id of the user.
	 * @param password the password.
	 * @return UserAccountDto the Dto object of a {@link UserAccount} with the id required.  
	 */
	UserAccountDto getUserAccountByMemberId(String userMemberId, String password) throws LibraryServiceException;
	
	/**
	 * Method that saves user password if first login.
	 * 
	 * @param userMemberId the user Member id
	 * @param password user password to save 
	 * @return UserAccountDto 
	 */
	UserAccountDto saveUserAccountPw(String userMemberId, String password) throws LibraryServiceException;
}
