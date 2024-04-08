package N_DesignPattern.BehaviourDP.IteratorDP;

public class Channel {
    private double frequency;
    private ChannelTypeEnum Type;

    public Channel(double frequency, ChannelTypeEnum type) {
        this.frequency = frequency;
        Type = type;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public ChannelTypeEnum getType() {
        return Type;
    }

    public void setType(ChannelTypeEnum type) {
        Type = type;
    }

    @Override
    public String toString() {
        return "Channel [frequency=" + frequency + ", Type=" + Type + "]";
    }

     
}
