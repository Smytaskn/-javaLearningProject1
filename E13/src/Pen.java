public class Pen {
    public void draw(Drawable drawable){
        String drawingInfo= drawable.getDrawingInfo();
        System.out.println("Drawing: "+drawingInfo);
    }

    public void showDrawingInfo(Drawable drawable){

        String drawingInfo=drawable.getDrawingInfo();
        System.out.println("Drawing info:"+drawingInfo);
    }

}
