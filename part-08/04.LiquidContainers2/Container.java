public class Container {

    private int volume;
    private final int minVolume;
    private final int maxVolume;

    public Container() {
        this.volume = 0;
        this.minVolume = 0;
        this.maxVolume = 100;
    }

    public int contains() {
        return this.volume;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }

        this.volume += amount;

        if (this.volume < this.minVolume) {
            this.volume = this.minVolume;
        } else if (this.volume > this.maxVolume) {
            this.volume = this.maxVolume;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }

        this.volume -= amount;

        if (this.volume < this.minVolume) {
            this.volume = this.minVolume;
        } else if (this.volume > this.maxVolume) {
            this.volume = this.maxVolume;
        }
    }

    public String toString() {
        return this.volume + "/" + this.maxVolume;
    }
}
