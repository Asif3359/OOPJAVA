package IntroductionOOP;

/*
 * Basic Intro of oop in java
 */
public class IntroOOP {

    public class Television {
        private int channel;
        private int volume;

        public void setChannel(int newChannel) {
            this.channel = newChannel;
        }

        public void SetVolume(int newVolume) {
            this.volume = newVolume;
        }

        public int getChannel() {
            return channel;
        }

        public int getVolume() {
            return volume;
        }

    }

    public static void main(String[] args) {
        IntroOOP intro = new IntroOOP();
        Television t1 = intro.new Television();
        t1.setChannel(10);
        System.out.println("Channel: " + t1.getChannel());
    }
}