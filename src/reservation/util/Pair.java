package reservation.util;

public class Pair<F, S> {
	final F first;
	final S second;

	public Pair(F first, S second) {
		this.first = first;
		this.second = second;
	}

	public F getFirst() {
		return first;
	}

	public S getSecond() {
		return second;
	}

	static <F, S> Pair<F, S> of(F first, S second) {
		return new Pair<F, S>(first, second);
	}
}