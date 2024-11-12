package com.example.demo;

import com.example.demo.entity.BankAccount;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.BankAccountRepository;
import com.example.demo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	UserRepository repository;

	@Autowired
	BankAccountRepository bankAccountRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void test() {
		long count = repository.count();
		System.out.println(count);
	}

	@Test
	void test2() {
		long count = bankAccountRepository.count();
		System.out.println(count);

		UserEntity user = new UserEntity();
		user.setName("Andreas");
		repository.save(user);

		BankAccount bankAccount = new BankAccount();
		bankAccount.setBalance(100.0);
		bankAccount.setUser(user);
		bankAccountRepository.save(bankAccount);

		var bankAccountList = bankAccountRepository.findAll();

		System.out.println(bankAccountList);

	}
}
