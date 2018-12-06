import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
            Path imagePath = FileSystems.getDefault().getPath("resources", "test.BMP");

            bitmap bmp = new bitmap(imagePath);
//okay so here is where you get to pick which one you want to do. each one does something neat!
// bellow the description is how to call the method.

//             mirrorTop will make the Top half appear on the bottom as it is being mirrored.
//          bmp.mirrorRight();

//             mirrorBot will make the bottom half appear on the top as it is being mirrored.
//          bmp.mirrorBot();
//
//             flipVertically will flip the image ...Vertically(who would have guessed!)
//          bmp.flipVertically();

//              hope this doesn't come as a shocker but flipHorizontally flips the image horizontally
//              bmp.flipHorizontally();

            bmp.save(FileSystems.getDefault().getPath("resources", "test_new.BMP"));
        }

    }

