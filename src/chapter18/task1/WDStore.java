package chapter18.task1;

public class WDStore implements Store{

    private Object[] goods = {"商品1","商品2","商品3"};

    @Override
    public MyIterator createIterator() {
        return new WDIIterator();
    }

    private class WDIIterator implements MyIterator{ private int current = -1;
        @Override
        public void first() {
            current = 0;
        }

        @Override
        public void next() {
            current ++;

        }

        @Override
        public void previous() {
            current --;
        }

        @Override
        public boolean hasNext() {
            return current < goods.length - 1;
        }

        @Override
        public boolean hasPrevious() {
            return current > 0;
        }
        @Override
        public Object currentItem() {
            return goods[current];
        }
    }
}
