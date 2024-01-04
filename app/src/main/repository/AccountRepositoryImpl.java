package main.repository;

import main.domain.Account;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class AccountRepositoryImpl extends BaseRepositoryImplementation<Account> implements AccountRepository {
	private final ConcurrentHashMap<Long, Account> storage = new ConcurrentHashMap<>();
	private final AtomicLong sequence = new AtomicLong(0);

protected ConcurrentHashMap<Long, Account> getStorage() {
	return storage;
}
protected AtomicLong getSequence() {
	return sequence;
}

}
