package N_DesignPattern.BehaviourDP.IteratorDP;

public class Main {

    private static ChannelCollection populateChannels(){
     ChannelCollection channels =  new ChannelCollectionImpl();
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
		channels.addChannel(new Channel(99.5, ChannelTypeEnum.HINDI));
		channels.addChannel(new Channel(100.5, ChannelTypeEnum.FRENCH));
		channels.addChannel(new Channel(101.5, ChannelTypeEnum.ENGLISH));
		channels.addChannel(new Channel(102.5, ChannelTypeEnum.HINDI));
		channels.addChannel(new Channel(103.5, ChannelTypeEnum.FRENCH));
		channels.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
		channels.addChannel(new Channel(105.5, ChannelTypeEnum.HINDI));
		channels.addChannel(new Channel(106.5, ChannelTypeEnum.FRENCH));
        return channels ;
    }

    public static void main(String[] args) {
        ChannelCollection channels =  populateChannels();

       ChannelIterator channelIterator =   channels.iterator(ChannelTypeEnum.ALL) ;
        while (channelIterator.hasNext()) {
            Channel c = channelIterator.next();
            System.out.println(c.toString());
        }
    }
    
}
