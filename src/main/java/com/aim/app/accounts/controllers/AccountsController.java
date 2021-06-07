//package com.aim.app.accounts.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.aim.app.accounts.models.User;
//import com.aim.app.accounts.repositories.UserRepository;
//import com.aim.app.utils.ApiResponse;
//
//@RestController
//@RequestMapping("/api/v1/accounts")
//public class AccountsController {
//
//	private final UserRepository userRepository;
//
//	@Autowired
//	public AccountsController(UserRepository userRepository) {
//		this.userRepository = userRepository;
//	}
//
//	@GetMapping
//	public ResponseEntity<ApiResponse<User>> getAccounts() {
//
//		ApiResponse<User> response = new ApiResponse<>();
//
//		response.setStatus("1");
//		response.setMessage("Success");
//		response.setDataList(userRepository.findAll());
//		response.setDataListCount(userRepository.count());
//
//		return new ResponseEntity<ApiResponse<User>>(response, HttpStatus.OK);
//	}
//
//}
