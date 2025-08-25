public class Player {
    private final Decoder decoder;
    private final Renderer renderer;
    private final FrameCache cache;

    public Player(Decoder decoder, Renderer renderer, FrameCache cache) {
        this.decoder = decoder;
        this.renderer = renderer;
        this.cache = cache;
    }

    public void play(byte[] fileBytes) {
        Frame f = decoder.decode(fileBytes);
        renderer.render(f);
        cache.store(f);
        System.out.println("Cached last frame? " + cache.hasLast());
    }
}
