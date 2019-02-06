package com.philippe75.libraryWS.exposure.service.borrowing;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebService;

import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.philippe75.libraryWS.business.contract.handler.ManagerHandler;
import com.philippe75.libraryWS.business.dto.BookDto;
import com.philippe75.libraryWS.business.dto.BorrowingDto;
import com.philippe75.libraryWS.model.book.Borrowing;
import com.philippe75.libraryWS.model.exception.saop.LibraryServiceException;

/**
 * <b>Borrowing service end point Class.</b>
 * 
 * <p>
 * 	  Service related to borrowings of a user.
 * </p>
 * 
 * @author Philippe plaxine
 * @version 1.0
 */
@WebService(endpointInterface="com.philippe75.libraryWS.exposure.service.borrowing.BorrowingService")
public class BorrowingServiceImpl extends SpringBeanAutowiringSupport implements BorrowingService{
	
	/**
	 * Access to business layer.
	 * 
	 * @see ManagerHandler
	 */
	@Inject
	private ManagerHandler managerHandler;
	
	/**
	 * Method that gets, all the borrowings of a user.  
	 * 
	 * @param userMemeberId the member id of a user
	 * @return List<BorrowingDto> list of {@link Borrowing} of a user.
	 */
	@Override
	public List<BorrowingDto> getAllBorrowingForUser(String userMemberId) throws LibraryServiceException {
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
		return (List<BorrowingDto>)managerHandler.getBorrowingManager().getAllBorrowingForUser(userMemberId);
	}


	
}