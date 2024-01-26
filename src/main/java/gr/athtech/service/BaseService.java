package gr.athtech.service;



import gr.athtech.domain.BaseModel;

import java.util.HashSet;
import java.util.List;

public interface BaseService<T extends BaseModel, K> {
	T create(T item);

	List<T> createAll(List<T> items);

	List<T> createAll(T... items);

	void update(T item);

	void delete(T item);

	void deleteById(K id);

	T get(K id);

	boolean exists(T item);

	List<T> findAll();

	Long count();
}
