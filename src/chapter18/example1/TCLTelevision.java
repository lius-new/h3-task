package chapter18.example1;

import chapter6.Tv;

public class TCLTelevision implements TV {
    private Object[] channel = {"CCTV-1", "CCTV-2"};

    @Override
    public TVIterator createIterator() {
        return new TCLIterator();
    }


    private class TCLIterator implements TVIterator {
        private int current = -1;

        @Override
        public void setChannel(int i) {
            current = i;
        }

        @Override
        public Object currentChannel() {
            return channel[current];
        }

        @Override
        public void next() {
            current++;
        }

        @Override
        public void previous() {
            current--;
        }

        @Override
        public boolean hasNext() {
            return current < channel.length - 1;
        }

        @Override
        public boolean hasPrevious() {
            return current > 0;
        }
    }

}
