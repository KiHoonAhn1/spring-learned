package com.mapper;

import java.util.ArrayList;

import com.vo.User;

public interface SearchMapper<K1, K2, V> {
	public ArrayList<V> search(K1 obj);
	public ArrayList<V> search(K1 k1, K2 k2);
}



