package ss7_abstract_class_and_interface.practice.practice_3;

import ss6_inhertiance.practice.shape_object.Shape;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public interface Comparator<C extends Shape, T> extends java.util.Comparator<T> {

}
