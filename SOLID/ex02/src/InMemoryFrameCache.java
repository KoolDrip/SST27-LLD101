public class InMemoryFrameCache implements FrameCache {
    private Frame last;

    @Override
    public void store(Frame frame) {
        last = frame;
    }

    @Override
    public boolean hasLast() {
        return last != null;
    }
}
