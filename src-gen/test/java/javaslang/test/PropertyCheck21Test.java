/*     / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javaslang.test;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import static org.assertj.core.api.Assertions.assertThat;

import javaslang.CheckedFunction21;
import org.junit.Test;

public class PropertyCheck21Test {

    static final Arbitrary<Object> OBJECTS = Gen.of(null).arbitrary();

    @Test
    public void shouldApplyForAllOfArity21() {
        final Property.ForAll21<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> forAll = new Property("test").forAll(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        assertThat(forAll).isNotNull();
    }

    @Test
    public void shouldApplySuchThatOfArity21() {
        final Property.ForAll21<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> forAll = new Property("test").forAll(OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS);
        final CheckedFunction21<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Boolean> predicate = (o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21) -> true;
        final Property.Property21<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> suchThat = forAll.suchThat(predicate);
        assertThat(suchThat).isNotNull();
    }

    @Test
    public void shouldCheckTrueProperty21() {
        final Property.ForAll21<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> forAll = new Property("test").forAll(OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS);
        final CheckedFunction21<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Boolean> predicate = (o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21) -> true;
        final CheckResult result = forAll.suchThat(predicate).check();
        assertThat(result.isSatisfied()).isTrue();
        assertThat(result.isExhausted()).isFalse();
    }

    @Test
    public void shouldCheckFalseProperty21() {
        final Property.ForAll21<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> forAll = new Property("test").forAll(OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS);
        final CheckedFunction21<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Boolean> predicate = (o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21) -> false;
        final CheckResult result = forAll.suchThat(predicate).check();
        assertThat(result.isFalsified()).isTrue();
    }

    @Test
    public void shouldCheckErroneousProperty21() {
        final Property.ForAll21<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> forAll = new Property("test").forAll(OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS);
        final CheckedFunction21<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Boolean> predicate = (o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21) -> { throw new RuntimeException("woops"); };
        final CheckResult result = forAll.suchThat(predicate).check();
        assertThat(result.isErroneous()).isTrue();
    }

    @Test
    public void shouldCheckProperty21ImplicationWithTruePrecondition() {
        final Property.ForAll21<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> forAll = new Property("test").forAll(OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS);
        final CheckedFunction21<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Boolean> p1 = (o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21) -> true;
        final CheckedFunction21<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Boolean> p2 = (o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21) -> true;
        final CheckResult result = forAll.suchThat(p1).implies(p2).check();
        assertThat(result.isSatisfied()).isTrue();
        assertThat(result.isExhausted()).isFalse();
    }

    @Test
    public void shouldCheckProperty21ImplicationWithFalsePrecondition() {
        final Property.ForAll21<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> forAll = new Property("test").forAll(OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS);
        final CheckedFunction21<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Boolean> p1 = (o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21) -> false;
        final CheckedFunction21<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Boolean> p2 = (o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21) -> true;
        final CheckResult result = forAll.suchThat(p1).implies(p2).check();
        assertThat(result.isSatisfied()).isTrue();
        assertThat(result.isExhausted()).isTrue();
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowOnProperty21CheckGivenNegativeTries() {
        new Property("test")
            .forAll(OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS)
            .suchThat((o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21) -> true)
            .check(Checkable.RNG.get(), 0, -1);
    }

    @Test
    public void shouldReturnErroneousProperty21CheckResultIfGenFails() {
        final Arbitrary<Object> failingGen = Gen.fail("woops").arbitrary();
        final CheckResult result = new Property("test")
            .forAll(failingGen, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS)
            .suchThat((o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21) -> true)
            .check();
        assertThat(result.isErroneous()).isTrue();
    }

    @Test
    public void shouldReturnErroneousProperty21CheckResultIfArbitraryFails() {
        final Arbitrary<Object> failingArbitrary = size -> { throw new RuntimeException("woops"); };
        final CheckResult result = new Property("test")
            .forAll(failingArbitrary, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS, OBJECTS)
            .suchThat((o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21) -> true)
            .check();
        assertThat(result.isErroneous()).isTrue();
    }
}