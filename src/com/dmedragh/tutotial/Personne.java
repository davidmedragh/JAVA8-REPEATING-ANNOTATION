/**
 * 
 */
package com.dmedragh.tutotial;

import java.lang.annotation.Annotation;

/**
 * @author @dmedragh
 *
 */
@Modifiee(auteur="dmedragh")
@Modifiee(auteur = "mmedragh")
public class Personne {

	/**
	 * 
	 */
	public Personne() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Annotation[] annotations = Personne.class.getAnnotations();
		for (Annotation a : annotations) {
			System.out.println(a);
		}
		
	}

}
