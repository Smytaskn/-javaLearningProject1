
public interface Drawable{

    void draw();
    public void clear();
    default void fill(){
        System.out.println("hey");
    };

}


