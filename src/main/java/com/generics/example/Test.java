package com.generics.example;

public class Test {
    public static void main(String[] args) {

        User user = new User();
        user.setId(1L);
        user.setFirstName("Bla Blas");
        user.setLastName("Bla Blas");

        Account account = new Account();
        account.setId(1L);
        account.setAccountNumber(32123123132L);
        account.setBalance(5000.0);

        UserRepository userRepository = new UserRepository();
        userRepository.save(user);
//        userRepository.save(account);

        AccountRepository accountRepository = new AccountRepository();
        accountRepository.save(account);
    }
}
