import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class bitmap {
    public Path path;
    public BufferedImage imageData;

    public bitmap(Path imagePath) {
        this.path = imagePath;

        BufferedImage img = null;
        try {
            img = ImageIO.read(imagePath.toFile());
            this.imageData = img;
        } catch (IOException e){

        }
    }

    public void mirrorBot(){
        for(int i = 0; i < this.imageData.getHeight(); i++){
            for(int j = 0; j < this.imageData.getWidth() / 2; j++){
                int temp = this.imageData.getRGB(i, this.imageData.getWidth()-1-j);
                this.imageData.setRGB(i,this.imageData.getWidth()-1, this.imageData.getRGB(i,j));
                this.imageData.setRGB(i, j, temp);
            }
        }
    }

    public void flipVertically() {
        for (int i = 0;i < this.imageData.getHeight();i++) {
            for (int j = 0; j < this.imageData.getWidth() / 2;j++){
                int temp = this.imageData.getRGB(i,j);
                this.imageData.setRGB(i,j, this.imageData.getRGB(i, this.imageData.getWidth() -j -1));
                this.imageData.setRGB(i, this.imageData.getWidth() -j -1, temp);
            }
        }
    }

    public void flipHorizontally(){
        for(int i = 0; i < this.imageData.getHeight(); i++){
            for(int j = 0; j < this.imageData.getWidth() / 2; j++){
                int temp = this.imageData.getRGB(this.imageData.getWidth()-1-j, i);
                this.imageData.setRGB(this.imageData.getWidth()-1-j, i, this.imageData.getRGB(j,i));
                this.imageData.setRGB(j, i, temp);
            }
        }
    }

    public void mirrorRight(){
        for(int i = 0; i < this.imageData.getHeight(); i++){
            for(int j = 0; j < this.imageData.getWidth() / 2; j++){
                int tempVal = this.imageData.getRGB(this.imageData.getWidth()-1-j, i);
                this.imageData.setRGB(this.imageData.getWidth()-1, i, this.imageData.getRGB(i,j));
                this.imageData.setRGB(j, i, tempVal);
            }
        }
    }

    public boolean save(Path savePath) {
        try{
            return ImageIO.write(imageData, "BMP", savePath.toFile());
        } catch (IOException e) {

        }
        return false;
    }
}
