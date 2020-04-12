package com.dmedragh.tutotial;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Modifiees {

	Modifiee[] value();
}
