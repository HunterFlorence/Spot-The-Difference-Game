import edu.princeton.cs.introcs.Picture;
import edu.princeton.cs.introcs.StdOut;

import java.awt.*;

public class compression {
    public static void main(String[] args) {
        Picture one = new Picture("C:\\Users\\kaldridge\\IdeaProjects\\DeltaCompression\\src\\pic1.png");
        one.show();
        Picture two = new Picture("C:\\Users\\kaldridge\\IdeaProjects\\DeltaCompression\\src\\pic2.png");
        two.show();
        Picture three = new Picture(one.width(),two.height());
        for (int i = 0; i < one.width(); i++) {
            for (int j = 0; j < one.height(); j++) {
                if(!one.get(i, j).equals(two.get(i, j))){
                three.set(i,j,Color.CYAN);
            }
}
        three.show();
}
}
}