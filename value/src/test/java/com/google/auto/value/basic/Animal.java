package com.google.auto.value.basic;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Animal {
	static Animal create(String name, int numberOfLegs) {
		// See "How do I...?" below for nested classes.
		return new AutoValue_Animal(name, numberOfLegs);
	}

	abstract String name();

	abstract int numberOfLegs();
}

