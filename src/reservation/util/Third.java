package reservation.util;

public class Third<F, S, T> {
	final F first;
	final S second;
	final T third;

	public Third(F first, S second, T third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	public F getFirst() {
		return first;
	}
	
	public S getSecond() {
		return second;
	}

	public T getThird() {
		return third;
	}

	static <F, S, T> Third<F, S, T> of(F first, S second, T third) {
		return new Third<F, S, T>(first, second, third);
	}
}