/**
 * 
 */
package com.dmedragh.tutotial;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author dmedragh
 *
 */
@Repeatable(Modifiees.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Modifiee {

	String auteur() default "inconue";

}
