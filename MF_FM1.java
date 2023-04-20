import ij.*;
import ij.process.*;
import ij.gui.*;
import java.awt.*;
import ij.plugin.*;

public class My_Plugin implements PlugIn {

    public void run(String arg) {
        ImagePlus imp = IJ.getImage();
        //IJ.setTool("oval");
        imp.setRoi(new OvalRoi(239,126,248,372));
        IJ.run(imp, "Find Maxima...", "prominence=5 strict exclude output=[Point Selection]");
    }

}
