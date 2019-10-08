package com.magazzino.controllers;

import java.util.HashMap;



/**
 * @author Antonio Della Fortuna
 * Oggetto Sessione: permette di tener traccia degli oggetti memorizzati in formato chiave, valore
 *
 */
public class Session {

	/**
	 * Oggetti memorizzati
	 */
	private static HashMap<String, Object> objects;
	
	static {
		objects = new HashMap<String, Object>();
	}
	
	/**
	 * @param key chiave del valore
	 * @param value oggetto da memorizzare
	 * Memorizza o rimpiazza un oggetto nella sessione
	 */
	static void addObject(String key, Object value) {
		Session.objects.put(key, value);
	}
	
	/**
	 * @param key chiave dell'oggetto
	 * Rimuovi l'oggetto dalla sessione
	 */
	static void removeObject(String key) {
		Session.objects.remove(key);
	}
	
	/**
	 * @param key chiave dell'oggetto
	 * @return L'oggetto specificato dalla chiave
	 * 
	 * Ritorna l'oggetto specificato dalla chiave
	 */
	static Object getObject(String key) {
		return Session.objects.get(key);
	}
}
