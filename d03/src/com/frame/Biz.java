package com.frame;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

public interface Biz<K, V> {
	@Transactional
	public void register(V v) throws Exception;
	@Transactional
	public void remove(K k) throws Exception;
	@Transactional
	public void modify(V v) throws Exception;
	@Transactional
	public V get(K k) throws Exception;
	@Transactional
	public ArrayList<V> get() throws Exception;
	@Transactional
	public ArrayList<V> search(Object obj) throws Exception;
}