public class Counter {

    int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this(0);
    }

    public int getValue() {
        return this.value;
    }

    public void increase(int increaseBy) {
        if (increaseBy < 0) {
            return;
        }
        this.value += increaseBy;
    }

    public void increase() {
        this.increase(1);
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy < 0) {
            return;
        }
        this.value -= decreaseBy;
    }

    public void decrease() {
        this.decrease(1);
    }

}
